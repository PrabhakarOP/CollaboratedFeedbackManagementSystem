package feedbackManagementSystem.repository;

import feedbackManagementSystem.entity.Admin;
import feedbackManagementSystem.entity.Student;

import java.util.ArrayList;

public interface AdminRepository {
    ArrayList<Admin> adminList=new ArrayList<>();

    void save(Admin admin);
    Admin fetchAdmin(String phoneNumber);
    boolean isAdmin(String phoneNumber);
}
