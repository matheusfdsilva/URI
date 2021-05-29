package URI;
import java.util.Scanner;

public class URI_1043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();  
        
        if (A < B + C && B < A + C && C < B + A) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } 
        else {
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
        }        
        sc.close();
    }
} 