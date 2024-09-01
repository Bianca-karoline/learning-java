package estruturaSequencial;

import java.util.Scanner;

public class Diferença {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diferenca;
        System.out.println("Digite o numero 1: ");
        a = sc.nextInt();
        System.out.println("Digite o numero 2: ");
        b = sc.nextInt();
        System.out.println("Digite o numero 3: ");
        c = sc.nextInt();
        System.out.println("Digite o numero 4: ");
        d = sc.nextInt();
        diferenca = a * b - c * d;
        System.out.println("DIFERENCA = " + diferenca);
    }
}
