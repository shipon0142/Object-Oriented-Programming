
package javaapplication_14_9_22;

import java.util.Scanner;


public class JavaApplication_14_9_22 {


    public static void main(String[] args) {
        User user = new User();
        Scanner sc=new Scanner(System.in);
        while(true){
           display("Enter First Name : ");
           String firstName;
           firstName=sc.nextLine();
           user.setFirstName(firstName);
           if(firstName.length()==0){
               displayln("    Please enter valid first name");
           }else{
               break;
           }
        }
        
        while(true){
         display("Enter Last Name : ");
         String lastName;
         lastName=sc.nextLine();
         user.setLastName(lastName);
         if(lastName.length()==0){
               displayln("    Please enter valid last name");
           }else{
               break;
           }
        }
        
        while(true){
        display("Enter Email : ");
        String email;
        email=sc.nextLine();
        user.setEmail(email);
       
        if(email.length()>0 && email.contains("@") && email.contains(".com")){
              break;
            }else{
              displayln("    Please enter valid email");  
           }
        }
        while (true) {            
           
        display("Enter Phone : ");
        String phone;
        phone=sc.nextLine();
        user.setPhone(phone);
         if(phone.length()==11 && (phone.contains("017") || phone.contains("019"))){
             break;
         }else{
             displayln("    Please enter valid phone");  
         }
        }
        
        
        display("Enter Password : ");
        String password;
        password=sc.nextLine();
        user.setPassword(password);
        while(true){
        display("Enter Confirm Password : ");
        String cPassword;
        cPassword=sc.nextLine();
        user.setConfirmPassword(cPassword);
             if(!password.equals(cPassword)){
                displayln("    Password does not match");    
             }else{
                break;
             }
        }
        
      
        
        successDisplay(user);

    }
    private static void display(String text){
        System.out.print(text);
        
    }
    private static void displayln(String text){
        System.out.println(text);
        
    }
     private static void successDisplay(User user){
         System.out.println("\n\n\n");
         System.out.println("Name : "+user.getFullname());
         System.out.println("Phone : "+user.getPhone());
         System.out.println("Email : "+user.getPhone());
         System.out.println("Registration Successful");
         
        
        
    }
    
}
