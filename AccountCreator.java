/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accountcreator;
import static accountcreator.RegistrationSystem.checkPasswordComplexity;
import static accountcreator.RegistrationSystem.checkUsername;
import java.util.Scanner;


/**
 *
 * @author RC_Student_lab
 */
public class AccountCreator {

    private static String registeredUserName;
    private static String registeredPassword;
    private static String lastName;
    private static String firstName;
    private static Object registeredUsername;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        
     // Create a Scanner object to read input
     Scanner scanner = new Scanner(System.in);
     RegistrationSystem registrationSystem = new RegistrationSystem(); 
        
      System.out.println("=== Registration ===");

     // Capturing user's first and last name
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.println("Enter Username: ");
        String Username = scanner.nextLine();

        System.out.println("Enter Password: ");
        String Password = scanner.nextLine();

        
      //checking if the username and password contain the need chars, letters and numbers for registration 
        if(checkUsername(Username) && checkPasswordComplexity(Password, Password, "Kyle", "Smith")){

                      System.out.println("Registration successful!");
       }
       else{
           System.out.println("Registration not successful!!!");
       }
          
          System.out.println("=== Login ===");

    
       //  login prompts
        System.out.print("Enter your Username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter your Password: ");
        String loginPassword = scanner.nextLine();
        
        System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again.");


        boolean loginSuccess = AccountCreator.loginUser(loginUsername, loginPassword);
        System.out.println(AccountCreator.returnLoginStatus(loginSuccess));
        
        if(checkUsername(Username) && checkPasswordComplexity(Password, Password, "Kyle", "Smith")){

                      System.out.println("Login successful!");
       }
       else{
           System.out.println("Login not successful!!!");
       }
    }
    
    public static boolean loginUser(String username, String password) {
        //login logic
        return true; // Placeholder return
    }

    public static String returnLoginStatus(boolean success) {
        return success ? "" : "Login failed. Please check your credentials.";
        

    }

}

    
    

 

    
  
   
   

       
    
    

