import java.io.File;

public class Ejercicio1{
    /*
     * Usando la API de la clase File, crea un programa que permita listar un directorio, mostrando en la consola si es un fichero o un directorio
     * */
    public static void main(String[] args) {
        String rutaDirectorio="/home/victor/DAM";
        File directorio = new File(rutaDirectorio);

        if(!directorio.exists()){
            System.out.println("Error: La ruta indicada no existe.");
            return;
        }

        if(!directorio.isDirectory()){
            System.out.println("Error: La ruta indicada no es un directorio");
            return;
        }

        File[] elementos = directorio.listFiles();

        if(elementos != null){
            System.out.println("Contenido de "+directorio);

            for(File elemento : elementos){
                if(elemento.isDirectory()){
                    System.out.println("[DIRECTORIO] "+elemento.getName());
                }else if(elemento.isFile()){
                    System.out.println("[FICHERO] "+elemento.getName());
                }else{
                    System.out.println("[DESCONOCIDO] "+elemento.getName());
                }
            }
        }else{
            System.out.println("no se ha podido acceder al contenido del directoio");
        }
    }
}

