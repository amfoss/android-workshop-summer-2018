public class ExceptionExample {

    public static void main(String[] args) {
        
        int[] arr = new int[5]; // Size 5
        
        System.out.println("Statement 1");
        System.out.println("Statement 2");
        System.out.println("Statement 3");
         
        try{
            arr[6] = 10;                        // Handling Runtime Exception here,
        }catch(Exception e) {                   // to allow the program to run without 
            System.err.println(e);              // terminating mid-way
        }finally{
            System.out.println("Finally block");
        }

        System.out.println("Statement 4");
        System.out.println("Statement 5");
        System.out.println("Statement 6");
    }
}