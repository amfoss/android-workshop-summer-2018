public class Car {

    private String carName;
    private int fuelCapacity;

    public Car(int fuelCapacity, String carName) {
        this.carName = carName;
        this.fuelCapacity = fuelCapacity;
    }

    public void drive(int distace) throws CarOutOfFuelException{
        if(fuelCapacity > 0 && fuelCapacity > distace) {
            System.out.println("Yay, I am driving a "+carName);
        }else {
            throw new CarOutOfFuelException("Not enough fuel :( ");
        }
        fuelCapacity -= distace;
    }

}