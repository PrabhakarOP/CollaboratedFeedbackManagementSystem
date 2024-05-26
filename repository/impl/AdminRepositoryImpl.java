package CollaboratedFeedbackManagementSystem.repository.impl;


import CollaboratedFeedbackManagementSystem.model.Admin;
import CollaboratedFeedbackManagementSystem.repository.AdminRepository;

public class AdminRepositoryImpl implements AdminRepository {


    @Override
    public void save(Admin admin) {
        adminList.add(admin);
    }

    @Override
    public Admin fetchAdmin(String phoneNumber) {
        for(Admin x: adminList){
//            System.out.println(x.getAdminadminPhoneNumber()+"  "+phoneNumber+"/n");
            if(x.getAdminadminPhoneNumber().equals(phoneNumber))
                return x;
        }
        return null;
    }

    @Override
    public boolean isAdmin(String phoneNumber) {
        for(Admin x: adminList){
            if(x.getAdminadminPhoneNumber().equals(phoneNumber))
                return true;
        }
        return false;
    }
}
