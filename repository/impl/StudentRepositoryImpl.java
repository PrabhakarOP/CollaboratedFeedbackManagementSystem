<<<<<<< HEAD
package feedbackManagementSystem.repository.impl;

import feedbackManagementSystem.entity.Student;
import feedbackManagementSystem.repository.StudentRepository;

=======
package CollaboratedFeedbackManagementSystem.repository.impl;


import CollaboratedFeedbackManagementSystem.model.Student;
import CollaboratedFeedbackManagementSystem.repository.StudentRepository;
>>>>>>> main

public class StudentRepositoryImpl implements StudentRepository {

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public Student fetchStudent(String studentPhoneNumber) {
        for(Student x: studentList){
<<<<<<< HEAD
            if(x.getPhoneNumber().equals(studentPhoneNumber))
=======
            if(x.getStudentPhoneNumber().equals(studentPhoneNumber))
>>>>>>> main
                return x;
        }
        return null;
    }
}
