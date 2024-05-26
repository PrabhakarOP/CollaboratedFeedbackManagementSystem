package feedbackManagementSystem.service;


import feedbackManagementSystem.entity.Feedback;
import feedbackManagementSystem.entity.Question;
import feedbackManagementSystem.repository.impl.AdminRepositoryImpl;
import feedbackManagementSystem.repository.impl.BatchRepositoryImpl;
import feedbackManagementSystem.repository.impl.StudentRepositoryImpl;

import java.util.ArrayList;

public interface Service {
    StudentRepositoryImpl studentRepo=new StudentRepositoryImpl();
    AdminRepositoryImpl adminRepo=new AdminRepositoryImpl();
    BatchRepositoryImpl batchRepo=new BatchRepositoryImpl();


    void signup(String name,String phoneNumber,String password,String role);
    boolean signin(String phoneNumber,String password,String role);
    void createBatch(String adminPhoneNumber,String batchName,String bId);
    void assignBatch(String adminPhoneNumber,String studentPhoneNumber,String bId);
    void createFeedback(String fId, String bId, ArrayList<Question> questionList);
    void editQuestion(String bId,int questionNumber,String editedQuestion);
    void deleteQuestion(String bId,int questionNumber);
    ArrayList<Feedback> showMyBatchFeedbacks(String studentPhoneNumber);
    void submitFeedback(String studentPhoneNumber,String bId,String[] answerList);
    ArrayList<Feedback> showFeedbackOfStudent(String studentPhoneNumber);
    ArrayList<Feedback> showBatchFeedback(String bId);
}
