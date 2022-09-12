package javaapplication_12_9_22;

import java.util.ArrayList;


public class JavaApplication_12_9_22 {
    
    
    public static void main(String[] args) {
        
        ArrayList<String> name = new ArrayList<String>();
        
        name.add("Shipon");
        name.add("Nayem");
        name.add("Foysal");
        name.add("Rijvy");
        
        ArrayList<Float> cgpa = new ArrayList<Float>();
        cgpa.add(3.5f);
        cgpa.add(2.5f);
        cgpa.add(3.6f);
        cgpa.add(3.7f);
        
        ArrayList<Integer> id = new ArrayList<Integer>();
        id.add(3);
        id.add(2);
        id.add(3);
        id.add(3);
        
        ArrayList<String> phone = new ArrayList<String>();
        phone.add("019000000");
        phone.add("013000000");
        phone.add("014000000");
        phone.add("017000000");
        //display(name,cgpa);
        
        Student student1 = new Student();
        student1.name="Shipon";
        student1.cgpa=3.5f;
        student1.id=2;
        student1.phone="0170000000";
        
        
        Student student2= new Student();
        student2.name = "Nayem";
        student2.cgpa = 3.4f;
        student2.id = 2;
        student2.phone = "018000000";
        
        Student student3 = new Student();
        student3.name = "Foysal";
        student3.cgpa = 3.6f;
        student3.phone = "019000000";
        student3.id = 3;
       
        Student student4 =new Student();
        student4.name = "Rijvy";
        student4.id = 3;
        student4.cgpa = 3.9f;
        student4.phone = "019000000";
        
        
        ArrayList<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        
        for(int i=0;i<students.size();i++){
            Student st = students.get(i);
            
            System.out.println(st.name+" "+st.id+" "+st.cgpa+" "+st.phone);
            
            
        }
              
        
        
        
        
        
    }
    static void display(ArrayList<String> name,ArrayList<Float> cgpa){
        for(int i=0;i<name.size();i++){
            System.out.println(name.get(i)+" "+cgpa.get(i));
        }
    }
    
}
