package estruturaCondicional;

import java.util.Scanner;

public class HorasDeJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, duracao;
        inicio = sc.nextInt();
        fim = sc.nextInt();

        if (inicio < fim){
            duracao = fim - inicio;
        } else if (inicio == fim) {
            duracao = 24;
        }else {
            duracao = (fim + 24) - inicio;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
