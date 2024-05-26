package feedbackManagementSystem.repository.impl;

import feedbackManagementSystem.entity.Admin;
import feedbackManagementSystem.repository.AdminRepository;

public class AdminRepositoryImpl implements AdminRepository {


    @Override
    public void save(Admin admin) {
        adminList.add(admin);
    }

    @Override
    public Admin fetchAdmin(String phoneNumber) {
        for(Admin x: adminList){
            if(x.getPhoneNumber().equals(phoneNumber))
                return x;
        }
        return null;
    }

    @Override
    public boolean isAdmin(String phoneNumber) {
        for(Admin x: adminList){
            if(x.getPhoneNumber().equals(phoneNumber))
                return true;
        }
        return false;
    }
}
