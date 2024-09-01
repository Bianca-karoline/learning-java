package estruturaSequencial;

import java.util.Scanner;

public class Peca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código da peça: ");
        int cod1 = sc.nextInt();
        System.out.println("Digite o número de peças: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o valor da peça: ");
        double valor1 = sc.nextDouble();
        System.out.println();
        System.out.println("Digite o código da pessoa: ");
        int cod2 = sc.nextInt();
        System.out.println("Digite o número de peças: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o valor da peça: ");
        double valor2 = sc.nextDouble();

        double total = n1 * valor1 + n2 * valor2;

        System.out.println("VALOR A PAGAR: R$ " + total);

    }
}
