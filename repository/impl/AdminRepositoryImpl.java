package repository.impl;

import model.Admin;
import repository.AdminRepository;

public class AdminRepositoryImpl implements AdminRepository {
    public boolean save(Admin admin) {
        adminList.add(admin);
        return true;
    }

    public boolean isAdmin(String phoneNumber) {
        Admin admin=fetchAdmin(phoneNumber);
        return admin!=null;
    }

    public Admin fetchAdmin(String phoneNumber) {

        for(Admin admin: adminList){
            if(admin.getPhoneNumber().equals(phoneNumber))
                return admin;

        }
        return null;
    }
}
