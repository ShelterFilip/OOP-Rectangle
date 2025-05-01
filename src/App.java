import java.util.Locale;
import java.util.Scanner;

import Entities.Rectangle;

public class App {
    public static void main(String[] args)  throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle r = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        r.width = sc.nextDouble();
        r.height = sc.nextDouble();

        System.out.printf("AREA : %.2f%n" , r.area());
        System.out.printf("PERIMETER : %.2f%n" , r.perimeter());
        System.out.printf("DIAGONAL : %.2f" , r.diagonal());
        sc.close();
    }
}

