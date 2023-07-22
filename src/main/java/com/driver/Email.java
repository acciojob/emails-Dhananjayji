package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        String currentPassword = getPassword();

        if(oldPassword.equals(currentPassword)) {

            String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).{8,}$";

            if(newPassword.matches(passwordRegex)) {
                setPassword(newPassword);
                System.out.println("Password changed successfully");
            } else {
                System.out.println("New password must contain at least 8 characters, one uppercase letter, one lowercase letter, one digit, and one special character.");

            }

        }  else {
            System.out.println("Old password is incorrect. Password change failed.");

        }

    }
}
