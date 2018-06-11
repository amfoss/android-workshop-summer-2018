import java.io.*;

public class CarOutOfFuelException extends IOException {

    public CarOutOfFuelException(String message) {
        super(message);
    } 
}