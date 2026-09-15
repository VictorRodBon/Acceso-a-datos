import java.io.File;

public class Ejercicio2 {
    /*
     * Dado un directorio, renombtrad los ficheros del directorio, indicando al final del nombre que permisos tiene.
     * */
    public static void main(String[] args) {
        String rutaDirectorio="/home/victor/DAM/prueba";
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
            for(File elemento : elementos){
                if(elemento.isFile()){
                    // obtener permisos
                    String permisos="";
                    if(elemento.canRead())permisos+="R";
                    if(elemento.canWrite())permisos+="W";
                    if(elemento.canExecute())permisos+="X";

                    // obtener nombre y extensión
                    String nombreCompleto = elemento.getName();
                    int ultimoPunto = nombreCompleto.lastIndexOf('.');

                    String nombre;
                    String extension;

                    if(ultimoPunto>0){
                        nombre = nombreCompleto.substring(0,ultimoPunto);
                        extension = nombreCompleto.substring(ultimoPunto);
                    }else{
                        nombre=nombreCompleto;
                        extension="";
                    }

                    // crear el nuevo nombre

                    String nuevoNombre=nombre+"_"+permisos+extension;

                    // crear el objeto File y renombrar

                    File nuevoFichero = new File(directorio+"/"+nuevoNombre);

                    if(elemento.renameTo(nuevoFichero)){
                        System.out.println("Nombre cambiado correctamente");
                    }else{
                        System.out.println("no se puedo renombrar");
                    }
                }

            }
        }else{
            System.out.println("no se ha podido acceder al contenido del directoio");
        }
    }
}

