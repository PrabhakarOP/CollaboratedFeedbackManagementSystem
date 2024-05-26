package CollaboratedFeedbackManagementSystem.controller;
import CollaboratedFeedbackManagementSystem.model.Feedback;
import CollaboratedFeedbackManagementSystem.model.Question;
import CollaboratedFeedbackManagementSystem.service.impl.ServiceImpl;

import java.util.ArrayList;

public class Controller {
    ServiceImpl serviceImpl = new ServiceImpl();
    public void signup(String name , String phoneNumber , String password , String role){
        serviceImpl.signup(name,phoneNumber,password,role);
    }
    public boolean signin( String phoneNumber , String password,String role ){
       return serviceImpl.signin(phoneNumber,password,role);
    }
    public void createBatch(String adminPhoneNumber , String batchName , String batchId){
        serviceImpl.createBatch(adminPhoneNumber,batchName,batchId);
    }
    public void assignBatch(String adminPhoneNumber , String studentPhoneNumber, String batchId){
        serviceImpl.assignBatch(adminPhoneNumber,studentPhoneNumber,batchId);
    }
   public void createFeedback(String fId, String bId, ArrayList<Question> questionList){
        serviceImpl.createFeedback(fId,bId,questionList);
   }

    public void editFeedbackQuestion(String bId,int questionNumber,String editedQuestion){
        serviceImpl.editQuestion(bId,questionNumber,editedQuestion);
    }

    public void deleteQuestion(String bId,int questionNumber){
        serviceImpl.deleteQuestion(bId,questionNumber);
    }

     public ArrayList<Feedback> showMyBatchFeedbacks(String studentPhoneNumber){
        return serviceImpl.showMyBatchFeedbacks(studentPhoneNumber);
    }

    public void submitFeedback(String studentPhoneNumber,String batchId,String[] answerList){
        serviceImpl.submitFeedback(studentPhoneNumber,batchId,answerList);
    }

    public ArrayList<Feedback> showFeedbackOfStudent(String studentPhoneNumber){
        return serviceImpl.showFeedbackOfStudent(studentPhoneNumber);
    }

    public ArrayList<Feedback> showBatchFeedback(String bId){
        return serviceImpl.showBatchFeedback(bId);
}
}

