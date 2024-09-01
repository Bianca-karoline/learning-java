package estruturaCondicional;

import java.util.Scanner;

public class NegativoOuNao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if(num >= 0){
            System.out.println("NAO NEGATIVO");
        }else {
            System.out.println("NEGATIVO");
        }
    }
}
