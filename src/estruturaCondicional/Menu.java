package estruturaCondicional;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod, qtd;
        cod = sc.nextInt();
        qtd = sc.nextInt();
        double valor = 0;
        switch (cod){
            case 1:
                valor = qtd * 4;
                break;
            case 2:
                valor = qtd * 4.5;
                break;
            case 3:
                valor = qtd * 5;
                break;
            case 4:
                valor = qtd * 2;
                break;
            case 5:
                valor = qtd * 1.5;
                break;
        }
        System.out.println("Total: R$ " + valor);
    }
}
