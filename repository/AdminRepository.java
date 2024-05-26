package CollaboratedFeedbackManagementSystem.repository;



import CollaboratedFeedbackManagementSystem.model.Admin;

import java.util.ArrayList;

public interface AdminRepository {
    ArrayList<Admin> adminList=new ArrayList<>();

    void save(Admin admin);
    Admin fetchAdmin(String phoneNumber);
    boolean isAdmin(String phoneNumber);
}
