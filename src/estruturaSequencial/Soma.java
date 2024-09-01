package estruturaSequencial;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = sc.nextInt();
        System.out.println("Digite um número: ");
        num2 = sc.nextInt();

        System.out.println("SOMA = " + (num1+num2));
    }
}
