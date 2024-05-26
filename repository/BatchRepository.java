<<<<<<< HEAD
package feedbackManagementSystem.repository;

import feedbackManagementSystem.entity.Batch;
import feedbackManagementSystem.entity.Student;
=======
package CollaboratedFeedbackManagementSystem.repository;



import CollaboratedFeedbackManagementSystem.model.Batch;
import CollaboratedFeedbackManagementSystem.model.Student;
>>>>>>> main

import java.util.ArrayList;

public interface BatchRepository {
    ArrayList<Batch> batchList=new ArrayList<>();

    void save(Batch batch);
    Batch fetchBatch(String bId);
<<<<<<< HEAD
    void addStudentToBatch(Student student,String bId);
=======
    void addStudentToBatch(Student student, String bId);
>>>>>>> main
}
