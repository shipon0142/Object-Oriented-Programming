
package myfirstjavaapplication;

public class BasicJavaProgramming {

    public static void main(String[] args) {
        
        int a = 100;
        //displayWithNewLine(a);
        //displayWithoutNewLine(500);
        
       
       // displayWithoutNewLine("Mayesha");
       
     //   displayWithNewLine("Kazi");
      
      //  displayWithNewLine(sum(10, 25));
      
     
        print(50, 100);
             
        
    }
    public static void print(int a, int b){
        int s=0;
        for(int i=a;i<=b;i++){        
            s=sum(s,i);
        }
        displayWithNewLine(s);
        
    }
    
    public static int sum(int num1,int num2){
        return num1+num2;
    }
    
    public static void displayWithoutNewLine(int value){
        System.out.print(value);
    }
    public static void displayWithoutNewLine(String value){
        System.out.print(value);
    }
    
     public static void displayWithNewLine(int value){
        System.out.println(value);
    }
     
     public static void displayWithNewLine(String value){
        System.out.println(value);
    }
    
}
