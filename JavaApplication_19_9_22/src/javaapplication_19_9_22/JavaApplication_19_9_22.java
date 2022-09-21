package javaapplication_19_9_22;

public class JavaApplication_19_9_22 {

    public static void main(String[] args) {
            User user = new User();
            user.setFirstName("Shipon");
            user.setLastName("Sarder");
            user.setPhone(72131);
            
            
            
            user.display(user.getFirstName());
            user.display(user.getFirstName(),user.getLastName());
            user.display(user.getFirstName(),user.getPhone());
            user.display(user.getFirstName(),user.getPhone(),user.getLastName());
            
            
            Student st=new Student();
            st.setName("Shipon");
            st.phone = 98239;
            st.address ="Khulna";
            st.semester ="2";
            st.studentId="3";
            
            
            
            
        
        
    }
    
}
