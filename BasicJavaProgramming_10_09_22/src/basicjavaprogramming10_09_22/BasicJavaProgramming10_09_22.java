
package basicjavaprogramming10_09_22;

import java.util.ArrayList;

public class BasicJavaProgramming10_09_22 {
    static int a;
    static String name;

    public static void main(String[] args) {
        
  
        setValueA(10);
        
        int x=getValueA();
        setName("Shipon");
        
        System.out.println(x);
        System.out.println(getName());
        ///////////////////////////
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
      
        for(int i=0;i<numbers.size();i++){
                    System.out.println(numbers.get(i));

        }
        numbers.remove(1);
        System.out.println("After remove : ");
        for(int i=0;i<numbers.size();i++){
                    System.out.println(numbers.get(i));

        }
        
        
        
        
        
         

        
        
    }
    private static void setValueA(int value){
        a = value;
    }
    private static int getValueA(){
        return a;
    }
    
    private static void setName(String nam){
        name=nam;
    }
    private static String getName(){
        return name;
    }
    
    
}
