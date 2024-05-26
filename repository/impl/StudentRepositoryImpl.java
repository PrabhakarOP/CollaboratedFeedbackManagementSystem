package feedbackManagementSystem.repository.impl;

import feedbackManagementSystem.entity.Student;
import feedbackManagementSystem.repository.StudentRepository;


public class StudentRepositoryImpl implements StudentRepository {

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public Student fetchStudent(String studentPhoneNumber) {
        for(Student x: studentList){
            if(x.getPhoneNumber().equals(studentPhoneNumber))
                return x;
        }
        return null;
    }
}
