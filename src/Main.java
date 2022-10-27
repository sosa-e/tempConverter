import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        double celsius, fahrenheit, endNumC;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter the temperature in celsius: ");
        celsius = inputDevice.nextDouble();
        endNumC = celsius + 20;
        for (celsius = celsius; celsius <= endNumC; celsius++) {
            for (fahrenheit = (celsius * 1.8) + 32; fahrenheit <= fahrenheit; fahrenheit++) {
                System.out.println(celsius);
                System.out.println(fahrenheit);
                break;
            }
        }
    }
}