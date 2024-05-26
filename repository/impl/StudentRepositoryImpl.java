package CollaboratedFeedbackManagementSystem.repository.impl;


import CollaboratedFeedbackManagementSystem.model.Student;
import CollaboratedFeedbackManagementSystem.repository.StudentRepository;

public class StudentRepositoryImpl implements StudentRepository {

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public Student fetchStudent(String studentPhoneNumber) {
        for(Student x: studentList){
            if(x.getStudentPhoneNumber().equals(studentPhoneNumber))
                return x;
        }
        return null;
    }
}
