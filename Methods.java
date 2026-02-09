class Methods {
     static int add(int a ,int b){
     return a+b;    //Method with primitive parameters and return type
     }
    
     static void displayMessage (String name){
     
        System.out.println("Hello, "+ name);   //Method with void return type and and object parameters
     }

     public void displayCity(){
        System.out.println("City = jaipur");  ///Methods with no parameter
     }

    public static void main(String[] args) {
        
        int sum = add(5, 100);
        System.out.println("Sum = " + sum);  //calling methd with primitive parameters

        displayMessage("Vaishnavi");   //calling method with object parameters

        Methods obj = new Methods();    //calling method with no parameters
        obj.displayCity();
    }

}