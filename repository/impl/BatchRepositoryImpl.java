<<<<<<< HEAD
package feedbackManagementSystem.repository.impl;

import feedbackManagementSystem.entity.Batch;
import feedbackManagementSystem.entity.Student;
import feedbackManagementSystem.repository.BatchRepository;
=======
package CollaboratedFeedbackManagementSystem.repository.impl;


import CollaboratedFeedbackManagementSystem.model.Batch;
import CollaboratedFeedbackManagementSystem.model.Student;
import CollaboratedFeedbackManagementSystem.repository.BatchRepository;
>>>>>>> main

public class BatchRepositoryImpl implements BatchRepository {
    @Override
    public void save(Batch batch) {
        batchList.add(batch);
    }

    public Batch fetchBatch(String bId){
        for(Batch x: batchList){
<<<<<<< HEAD
            if(x.getbId().equals(bId))
=======
            if(x.getBatchId().equals(bId))
>>>>>>> main
                return x;
        }
            return null;
    }

    @Override
    public void addStudentToBatch(Student student, String bId) {
        for(Batch x: batchList){
<<<<<<< HEAD
            if(x.getbId().equals(bId))
=======
            if(x.getBatchId().equals(bId))
>>>>>>> main
                x.addStudent(student);
        }
    }
}
