package repaso;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota1=-1;
        int nota2;
        int nota3;
        do {
            System.out.println("Introduce la primera nota");
            nota1 = scanner.nextInt();
        }while (nota1<0 || nota1>10);
        do {
            System.out.println("Introduce la segunda nota");
            nota2 = scanner.nextInt();
        }while (nota2<0 || nota2>10);
        do {
            System.out.println("Introduce la tercera nota");
            nota3 = scanner.nextInt();
        }while (nota3<0 || nota3>10);

        scanner.close();

        float media=(nota1+nota2+nota3)/3.0f;

        System.out.println((media * 100.0f)/100.0f);

        if(media<5){
            System.out.println("Suspenso");
        } else if (media<7) {
            System.out.println("Aprobado");
        } else if (media<9) {
            System.out.println("Notable");
        }else if (media<10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("se han introdducido notas erroneas");
        }
    }
}
