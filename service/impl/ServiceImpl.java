package feedbackManagementSystem.service.impl;

import feedbackManagementSystem.entity.*;
import feedbackManagementSystem.service.Service;

import java.util.ArrayList;

public class ServiceImpl implements Service {


    public void signup(String name, String phoneNumber, String password, String role) {
        if (role.equalsIgnoreCase("admin")) {
            Admin obj = new Admin(name, phoneNumber, password);
            adminRepo.save(obj);
        } else {
            Student obj = new Student(name, phoneNumber, password);
            studentRepo.save(obj);
        }

    }


    public boolean signin(String phoneNumber, String password, String role) {
        if (role.equalsIgnoreCase("admin")) {
            Admin admin = adminRepo.fetchAdmin(phoneNumber);
            if (admin != null) {
                if (password.equals(admin.getPassword()))
                    return true;
                else
                    return false;
            } else
                return false;
        } else {
            Student student = studentRepo.fetchStudent(phoneNumber);
            if (student != null) {
                if (password.equals(student.getPassword()))
                    return true;
                else
                    return false;
            } else
                return false;
        }
    }


    public void createBatch(String adminPhoneNumber, String batchName, String bId) {
        if (adminRepo.isAdmin(adminPhoneNumber)) {
            Batch batch = new Batch(batchName, bId);
            batchRepo.save(batch);
        } else
            System.out.println("Cannot create");

    }


    public void assignBatch(String adminPhoneNumber, String studentPhoneNumber, String bId) {
        if (adminRepo.isAdmin(adminPhoneNumber)) {
            Student student = studentRepo.fetchStudent(studentPhoneNumber);
            student.setBatchId(bId);
            student.setBatchName(batchRepo.fetchBatch(bId).getName());
            batchRepo.addStudentToBatch(student, bId);
        } else
            System.out.println("cannot assign");
    }


    public void createFeedback(String fId, String bId, ArrayList<Question> questionList) {
        Feedback feedbackTemplate = new Feedback(fId, questionList);
        Batch batch = batchRepo.fetchBatch(bId);
        batch.setFeedbackTemplate(feedbackTemplate);
    }


    public void editQuestion(String bId, int questionNumber, String editedQuestion) {
        Batch batch = batchRepo.fetchBatch(bId);
        Feedback feedbackTemplate = batch.getFeedbackTemplate();
        ArrayList<Question> questionList = feedbackTemplate.getQuestionList();
        Question editedQuestionObj = new Question(editedQuestion);
        questionList.set(questionNumber - 1, editedQuestionObj);
    }


    public void deleteQuestion(String bId, int questionNumber) {
        Batch batch = batchRepo.fetchBatch(bId);
        ArrayList<Question> questionList = batch.getFeedbackTemplate().getQuestionList();
        questionList.remove(questionNumber - 1);
    }


    public ArrayList<Feedback> showMyBatchFeedbacks(String studentPhoneNumber) {
        String bId = studentRepo.fetchStudent(studentPhoneNumber).getBatchId();
        return batchRepo.fetchBatch(bId).getFeedbackList();
    }


    public void submitFeedback(String studentPhoneNumber, String bId, String[] answerList) {
        Batch batch=batchRepo.fetchBatch(bId);
        Feedback feedback=new Feedback(batch.getFeedbackTemplate());
        feedback.setStudentPhoneNumber(studentPhoneNumber);

        ArrayList<Question> questionList=feedback.getQuestionList();
        for(int i=answerList.length-1;i>0;i--){
            Question question=questionList.get(i);
            question.setAnswer(answerList[i]);
        }

        batch.addFeedback(feedback);
    }


    public ArrayList<Feedback> showFeedbackOfStudent(String studentPhoneNumber) {
        Batch batch=batchRepo.fetchBatch(studentRepo.fetchStudent(studentPhoneNumber).getBatchId());
        ArrayList<Feedback> studentFeedbackList=new ArrayList<>();
        for(Feedback x: batch.getFeedbackList()){
            if(x.getStudentPhoneNumber().equals(studentPhoneNumber)){
                studentFeedbackList.add(x);
            }
        }
        return studentFeedbackList;
    }

    @Override
    public ArrayList<Feedback> showBatchFeedback(String bId) {
        Batch batch=batchRepo.fetchBatch(bId);
        return batch.getFeedbackList();
    }
}