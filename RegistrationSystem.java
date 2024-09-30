/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountcreator;
import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class RegistrationSystem {
    

    private static String LastName;
    private static Object registeredPassword;
    private static String registeredUserName;
    private static String firstName;

   // Method to validate username

    /**
     *
     * @param username
     * @return
     */
    public static boolean  checkUsername(String username) {
        // Check if username is exactly 7 characters long and contains a hyphen
        return username.length() == 5 && username.contains("_");
    }

    // Method to validate password
    public static boolean checkPasswordComplexity(String password, String password1, String kyle, String smith) {
        // Regex to check if the password has at least 8 characters, contains one digit, one uppercase letter, and one special character.
        String passwordPattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
        return Pattern.matches(passwordPattern, password);
    }

   
    private String username;
    private String password;
    private String registeredUsername;
    private String lastName;
    
    public void AccountRegistration(String firstname, String Lastname, String username, String password){
       
        if (checkUsername( username)) {
            registeredUsername = username;
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return;
        } 

        if (checkPasswordComplexity(password, password, "Kyle", "Smith")) {
            registeredPassword = password;
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is incorrect, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
            
        }
     }
     public String registerUser(RegistrationSystem Username, RegistrationSystem Password,String username, String password) {
        if (checkUsername(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        if (checkPasswordComplexity(password, password, "Kyle", "Smith")) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        this.username = username;
        this.password = password;
        this.firstName =firstName;
        this.lastName = lastName;
        return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
     }
    // Login Logic
    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // Returning login status message
     public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "Login Successful";

        } else {
            return "Login Failed";
        }

   
    }
}
     

