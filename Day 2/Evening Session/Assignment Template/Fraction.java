public class Fraction {
    
    private int numerator;
    private int denominator;

    public Fraction() {

    }

    public Fraction(int n , int d) {

    }

    public Fraction (String s) {
        String[] numbers = s.split("/");
        this.numerator = Integer.parseInt(numbers[0]);
        this.denominator = Integer.parseInt(numbers[1]);
    }

    public float getValue() {
        return 0;
    }
}