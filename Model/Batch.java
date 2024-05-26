package Model;

import java.util.ArrayList;
import java.util.List;

public class Batch {
    private String batchName;
    private String batchId;
    private Feedback obj;
    private List<Student> studentList = new ArrayList<>();
    private List<Feedback> feedbackList = new ArrayList<>();

    public Feedback getObj() {
        return obj;
    }

    public void setObj(Feedback obj) {
        this.obj = obj;
    }

    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
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
