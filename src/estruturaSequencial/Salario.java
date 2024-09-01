package estruturaSequencial;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do funcionario: ");
        int num = sc.nextInt();
        System.out.println("Digite o numero de horas: ");
        int horas = sc.nextInt();
        System.out.println("Digite o valor da hora de trabalho: ");
        double valor = sc.nextDouble();

        System.out.println("NUMBER = " + num);
        System.out.println("SALARY = " + (horas * valor));

    }
}
