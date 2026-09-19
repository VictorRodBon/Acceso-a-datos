import java.io.File;

public class Ejercicio2 {
    /**
     * Dado un directorio, renombrad los ficheros del directorio, indicando al final del nombre que
     * permisos tiene.
     */
    public static void main(String[] args) {
        String rutaDirectorio = "/home/victor/DAM/prueba";
        File directorio = new File(rutaDirectorio);

        if (!directorio.exists()) {
            System.out.println("Error: La ruta indicada no existe.");
            return;
        }

        if (!directorio.isDirectory()) {
            System.out.println("Error: La ruta indicada no es un directorio");
            return;
        }

        File[] elementos = directorio.listFiles();

        if (elementos != null) {
            for (File elemento : elementos) {
                if (elemento.isFile()) {
                    // obtener permisos
                    String permisos = "";
                    if (elemento.canRead()) permisos += "R";
                    if (elemento.canWrite()) permisos += "W";
                    if (elemento.canExecute()) permisos += "X";

                    // obtener nombre y extensión
                    String nombreCompleto = elemento.getName();
                    int ultimoPunto = nombreCompleto.lastIndexOf('.');

                    String nombre;
                    String extension;

                    if (ultimoPunto > 0) {
                        nombre = nombreCompleto.substring(0, ultimoPunto);
                        extension = nombreCompleto.substring(ultimoPunto);
                    } else {
                        nombre = nombreCompleto;
                        extension = "";
                    }

                    // crear el nuevo nombre
                    String nuevoNombre = nombre + "_" + permisos + extension;

                    // crear el objeto File con una ruta segura e independiente del sistema operativo
                    File nuevoFichero = new File(directorio, nuevoNombre);

                    // Protegemos la acción de renombrado con un bloque try-catch
                    try {
                        if (elemento.renameTo(nuevoFichero)) {
                            System.out.println("Renombrado con éxito: " + nombreCompleto + " -> " + nuevoNombre);
                        } else {
                            System.out.println("No se pudo renombrar el archivo: " + nombreCompleto +
                                    " (Comprueba que el archivo de destino no exista ya o no esté en uso)");
                        }
                    } catch (SecurityException e) {
                        System.out.println("Error de seguridad: Sin permisos del sistema para renombrar el archivo " + nombreCompleto);
                    } catch (Exception e) {
                        System.out.println("Error inesperado al renombrar: " + e.getMessage());
                    }
                }
            }
        } else {
            System.out.println("No se ha podido acceder al contenido del directorio");
        }
    }
}
