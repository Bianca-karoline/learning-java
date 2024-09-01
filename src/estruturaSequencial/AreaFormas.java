package estruturaSequencial;

import java.util.Scanner;

public class AreaFormas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Digite o numero 1: ");
        a = sc.nextDouble();
        System.out.println("Digite o numero 2: ");
        b = sc.nextDouble();
        System.out.println("Digite o numero 3: ");
        c = sc.nextDouble();
        System.out.println("TRIANGULO: " + (a*c/2));
        System.out.println("CIRCULO: " + (3.14159 * Math.pow(c,2)));
        System.out.println("TRAPEZIO: " + ((a + b) * c /2));
        System.out.println("QUADRADO: "+ (b*b));
        System.out.println("RETANGULO: " + (a*b));
    }
}
