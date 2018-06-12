import java.io.*;

public class Driver {
    
    public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(
            new InputStreamReader(System.in));
        
        String carName = bfr.readLine();
        int fuelCapacity = Integer.parseInt(bfr.readLine());
        int distance = Integer.parseInt(bfr.readLine());

        Car car = new Car(fuelCapacity, carName);
        car.drive(distance);   
    }
}