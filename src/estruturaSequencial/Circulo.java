package estruturaSequencial;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio de um circulo: ");
        int raio = sc.nextInt();
        double circulo =  3.14159 * Math.pow(raio,2);
        System.out.println("A = " + circulo);
    }
}
