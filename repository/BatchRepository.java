package feedbackManagementSystem.repository;

import feedbackManagementSystem.entity.Batch;
import feedbackManagementSystem.entity.Student;

import java.util.ArrayList;

public interface BatchRepository {
    ArrayList<Batch> batchList=new ArrayList<>();

    void save(Batch batch);
    Batch fetchBatch(String bId);
    void addStudentToBatch(Student student,String bId);
}
