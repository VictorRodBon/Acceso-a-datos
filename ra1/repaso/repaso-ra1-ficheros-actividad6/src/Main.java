/*
Crea un programa que cree un fichero de texto que guarde el listado de ficheros que hay en la carpeta
pasada por parámetro al programa. Con la siguiente estructura NombreFichero;F/D;[R/W/X];Tamaño;
 */

import services.FileService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileService fs = new FileService();
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la ruta de la que quieres obtener la información");
        String path = "/home/victor/Documents";
        if(fs.escribirInformacion(path)){
            System.out.println("se ha escrito en /home/victor/DAM/fichero.txt");
        }else{
            System.err.println("error");
        }

        // leer fichero resultante
        System.out.println("========RASULTADO=======");
        System.out.println(fs.leerInformacion());
    }
}