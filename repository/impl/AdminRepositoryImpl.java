<<<<<<< HEAD
package feedbackManagementSystem.repository.impl;

import feedbackManagementSystem.entity.Admin;
import feedbackManagementSystem.repository.AdminRepository;
=======
package CollaboratedFeedbackManagementSystem.repository.impl;


import CollaboratedFeedbackManagementSystem.model.Admin;
import CollaboratedFeedbackManagementSystem.repository.AdminRepository;
>>>>>>> main

public class AdminRepositoryImpl implements AdminRepository {


    @Override
    public void save(Admin admin) {
        adminList.add(admin);
    }

    @Override
    public Admin fetchAdmin(String phoneNumber) {
        for(Admin x: adminList){
<<<<<<< HEAD
            if(x.getPhoneNumber().equals(phoneNumber))
=======
//            System.out.println(x.getAdminadminPhoneNumber()+"  "+phoneNumber+"/n");
            if(x.getAdminadminPhoneNumber().equals(phoneNumber))
>>>>>>> main
                return x;
        }
        return null;
    }

    @Override
    public boolean isAdmin(String phoneNumber) {
        for(Admin x: adminList){
<<<<<<< HEAD
            if(x.getPhoneNumber().equals(phoneNumber))
=======
            if(x.getAdminadminPhoneNumber().equals(phoneNumber))
>>>>>>> main
                return true;
        }
        return false;
    }
}
