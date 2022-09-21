
package javaapplication_19_9_22;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int phone;
    private String password;
    private String confirmPassword;

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFullname(){
        return firstName+" "+lastName;
    }
    
    public void display(String firstName){
        System.out.println(firstName);
    }
    
    
     public void display(String firstName,String lastName){
        
        System.out.println(firstName+" "+lastName);
        
   
    }
      public void display(String firstName,int phone){
        
        System.out.println("Name : "+firstName+"\n Phone : "+phone);
        
   
    }
       public void display(String firstName,int phone,String lastName){
        
        System.out.println("Name : "+firstName+" "+lastName+"\n Phone : "+phone);
        
   
    }
    
   
    
}
