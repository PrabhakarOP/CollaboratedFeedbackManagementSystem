package CollaboratedFeedbackManagementSystem.model;

import java.util.ArrayList;
import java.util.List;

public class Feedback {
    private String feedbackId;
    private  String studentPhoneNo;
    private ArrayList<Question> questionList = new ArrayList<>();
    public Feedback (String feedbackId, ArrayList<Question>questionList){
        this.feedbackId=feedbackId;
        this.questionList.addAll(questionList);
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getStudentPhoneNo() {
        return studentPhoneNo;
    }

    public void setStudentPhoneNo(String studentPhoneNo) {
        this.studentPhoneNo = studentPhoneNo;
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<Question> questionList) {
        this.questionList.addAll(questionList);
    }
    public Feedback(Feedback obj){
        this.feedbackId= obj.feedbackId;
        this.questionList.addAll(obj.questionList);
    }
}
