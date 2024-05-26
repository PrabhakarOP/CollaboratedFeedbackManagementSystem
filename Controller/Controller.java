package Controller;

public class feedbackSystemController {
    ServiceImpl serviceImpl = new ServiceImpl();
    void signUp(String name , String phoneNumber , String password , String role){
        serviceImpl.signUp(name,phoneNumber,password,role);
    }
    boolean signIn( String phoneNumber , String password ){
       return serviceImpl.sigInp(phoneNumber,password);
    }
    void createBatch(String adminPhoneNumber , String batchName , String batchId){
        serviceImpl.createBatch(adminPhoneNumber,batchName,batchId);
    }
    void assignBatch(String adminPhoneNumber , String studentPhoneNumber, String batchId){
        serviceImpl.ssignBatch(adminPhoneNumber,studentPhoneNumber,batchId);
    }
    public ArrayList<Feedback> viewBatchFeedbacks(String studentPhoneNumber){
        return serviceImpl.viewBatchFeedbacks(studentPhoneNumber);
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

