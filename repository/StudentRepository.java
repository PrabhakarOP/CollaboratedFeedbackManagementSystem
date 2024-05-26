<<<<<<< HEAD
package feedbackManagementSystem.repository;

import feedbackManagementSystem.entity.Student;
=======
package CollaboratedFeedbackManagementSystem.repository;



import CollaboratedFeedbackManagementSystem.model.Student;
>>>>>>> main

import java.util.ArrayList;


public interface StudentRepository {

    ArrayList<Student>  studentList=new ArrayList<>();

    void save(Student student);
    Student fetchStudent(String studentPhoneNumber);
}
