package Model;

import java.util.ArrayList;
import java.util.List;

public class Feedback {
    private String feedbackId;
    private  String studentPhoneNo;
    private List<Question> questionList = new ArrayList<>();
    public Feedback (String feedbackId, List<Question>questionList){
        this.feedbackId=feedbackId;
        this.questionList=questionList;
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

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
    public Feedback(Feedback obj){
        this.feedbackId= obj.feedbackId;
        this.questionList.addAll(questionList);
    }
}
