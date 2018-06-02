import java.util.Scanner;

public class TestFractions {
    public static void main(String[] args) {
        Scanner scan = new Scanner("8/3 1/2 1/5 5/4 5/6 6/7 1/2 2/3 8/5");
        Fraction[][] fractions = new Fraction[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; ++j) {
                fractions[i][j] = new Fraction(scan.next());
            }
        }
        System.out.println(fractions[0][0].getValue());
        scan.close();
    }
}