/*
  Method overloading example using student data :
  Number of methods with same name but different parameters
  Different numbers of parameter or different types of parameters
*/

public class MethodOverloading {
    
    void display(String name){
        System.out.println("Student Name : " + name);
    }

    void display(String name, int id){
        System.out.println("Student Name : " + name);
        System.out.println("Student ID : " + id);
    }

    void display(String name, int id, String city){
        System.out.println("String Name : " + name);
        System.out.println("String ID : " + id);
        System.out.println("String city : " + city);
    }

    public static void main (String args[]){
        MethodOverloading s = new MethodOverloading();
        
        s.display("Vaishnavi");
        System.out.println();

        s.display("Vaishnavi" , 1);
        System.out.println();

        s.display("Vaishnavi", 1, "Pune");
        System.out.println();

    }

} 
