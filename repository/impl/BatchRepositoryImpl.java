package feedbackManagementSystem.repository.impl;

import feedbackManagementSystem.entity.Batch;
import feedbackManagementSystem.entity.Student;
import feedbackManagementSystem.repository.BatchRepository;

public class BatchRepositoryImpl implements BatchRepository {
    @Override
    public void save(Batch batch) {
        batchList.add(batch);
    }

    public Batch fetchBatch(String bId){
        for(Batch x: batchList){
            if(x.getbId().equals(bId))
                return x;
        }
            return null;
    }

    @Override
    public void addStudentToBatch(Student student, String bId) {
        for(Batch x: batchList){
            if(x.getbId().equals(bId))
                x.addStudent(student);
        }
    }
}
