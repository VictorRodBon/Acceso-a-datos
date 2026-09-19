package repaso;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int intentos=0;
        int maxIntentos=7;
        int usuario;
        boolean acertado=false;
        int random = (int) (Math.random()*100+1);

        System.out.println(random);

        do{
            System.out.println("introduce un número entero:");
            usuario = scanner.nextInt();

            if(usuario == random){
                acertado=true;
            }else if (usuario < random){
                System.out.println("el numero a adivinar es mayor que "+usuario);
            }else{
                System.out.println("el numero a adivinar es menor que "+usuario);
            }
            intentos ++;
        }while(!acertado && maxIntentos>intentos);

        if(acertado){
            System.out.println("Has acertado en "+intentos+" intentos");
        }else {
            System.out.println("El número era "+random);
        }
    }
}
