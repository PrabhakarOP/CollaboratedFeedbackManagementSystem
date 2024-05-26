package CollaboratedFeedbackManagementSystem.model;

import java.util.ArrayList;
import java.util.List;

public class Batch {
    private String batchName;
    private String batchId;
    private Feedback feedbackTemplate;
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Feedback> feedbackList = new ArrayList<>();

    public Feedback getFeedbackTemplate() {
        return feedbackTemplate;
    }

    public void setFeedbackTemplate(Feedback feedbackTemplate) {
        this.feedbackTemplate = feedbackTemplate;
    }

    public ArrayList<Feedback> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(ArrayList<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    public Batch(String batchName, String batchId){
        this.batchName=batchName;
        this.batchId=batchId;
    }
    public void addStudent (Student student){
        studentList.add(student);
    }
    public void addFeedback (Feedback feedback){
        feedbackList.add(feedback);
    }
}
