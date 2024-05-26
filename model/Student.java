package CollaboratedFeedbackManagementSystem.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private String studentPhoneNumber;
    private String studentPassword;
    private String batchId;
    private String batchName;
    private String studentPhotoUrl;

    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }

    private List<Feedback> feedbackList = new ArrayList<>();

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getStudentPhotoUrl() {
        return studentPhotoUrl;
    }

    public void setStudentPhotoUrl(String studentPhotoUrl) {
        this.studentPhotoUrl = studentPhotoUrl;
    }

    public Student (String studentName, String studentPhoneNumber, String studentPassword){
        this.studentName=studentName;
        this.studentPhoneNumber=studentPhoneNumber;
        this.studentPassword=studentPassword;


    }
}
