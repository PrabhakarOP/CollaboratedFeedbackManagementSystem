package Model;

public class Admin {
    private String  adminName;
    private String adminPhoneNumber;
    private String adminPassword;
    private String adminPhotoUrl;

    public String getAdminName() {
        return adminName;
    }

    public String getAdminadminPhoneNumber() {
        return adminPhoneNumber;
    }

    public void setAdminadminPhoneNumber(String adminadminPhoneNumber) {
        this.adminPhoneNumber = adminadminPhoneNumber;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminPhotoUrl() {
        return adminPhotoUrl;
    }

    public void setAdminPhotoUrl(String adminPhotoUrl) {
        this.adminPhotoUrl = adminPhotoUrl;
    }
    public Admin(String adminName, String adminadminPhoneNumber, String adminPassword){
        this.adminName=adminName;
        this.adminPhoneNumber=adminPhoneNumber;
        this.adminPassword=adminPassword;
    }
}
