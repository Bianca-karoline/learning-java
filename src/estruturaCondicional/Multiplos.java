package estruturaCondicional;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println("SAO MULTIPLOS");
        }else {
            System.out.println("NAO SAO MULTIPLOS");
        }
    }
}
