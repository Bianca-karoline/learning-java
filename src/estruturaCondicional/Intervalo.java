package estruturaCondicional;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float intervalo = sc.nextFloat();
        if (intervalo < 0 || intervalo > 100){
            System.out.println("Fora de intervalo");
        } else if (intervalo <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (intervalo <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (intervalo <= 75) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }
    }
}
