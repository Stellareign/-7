import java.util.Objects;
public class Service {
    // возведение в степень
    public static double quadrat(double x) {
        int j = 2;
        double quadratNumber = x;
        quadratNumber = Math.pow(quadratNumber, j);

        System.out.println(x + " в степени " + j + " равно " + quadratNumber);
        return quadratNumber;
    }
}
