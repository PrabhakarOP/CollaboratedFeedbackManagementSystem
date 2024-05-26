package CollaboratedFeedbackManagementSystem.repository.impl;


import CollaboratedFeedbackManagementSystem.model.Batch;
import CollaboratedFeedbackManagementSystem.model.Student;
import CollaboratedFeedbackManagementSystem.repository.BatchRepository;

public class BatchRepositoryImpl implements BatchRepository {
    @Override
    public void save(Batch batch) {
        batchList.add(batch);
    }

    public Batch fetchBatch(String bId){
        for(Batch x: batchList){
            if(x.getBatchId().equals(bId))
                return x;
        }
            return null;
    }

    @Override
    public void addStudentToBatch(Student student, String bId) {
        for(Batch x: batchList){
            if(x.getBatchId().equals(bId))
                x.addStudent(student);
        }
    }
}
