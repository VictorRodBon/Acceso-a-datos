import java.io.File;

public class Ejercicio1 {

    public static void main(String[] args) {
        String rutaDirectorio = "/home/victor/DAM";

        // Llamamos al metodo encargado de la lógica
        listarDirectorio(rutaDirectorio);
    }

    /**
     * Valida y lista el contenido de un directorio de forma segura.
     */
    public static void listarDirectorio(String ruta) {
        File directorio = new File(ruta);

        // 1. Validaciones previas limpias
        if (!directorio.exists()) {
            System.out.println("Error: La ruta indicada no existe.");
            return;
        }

        if (!directorio.isDirectory()) {
            System.out.println("Error: La ruta indicada no es un directorio.");
            return;
        }

        // 2. Captura del único riesgo real (Permisos del Sistema)
        try {
            File[] elementos = directorio.listFiles();

            if (elementos == null) {
                System.out.println("No se ha podido acceder al contenido (retornó null).");
                return;
            }

            System.out.println("Contenido de " + directorio.getAbsolutePath());

            for (File elemento : elementos) {
                if (elemento.isDirectory()) {
                    System.out.println("[DIRECTORIO] " + elemento.getName());
                } else if (elemento.isFile()) {
                    System.out.println("[FICHERO] " + elemento.getName());
                } else {
                    System.out.println("[DESCONOCIDO] " + elemento.getName());
                }
            }

        } catch (SecurityException e) {
            System.out.println("Error de seguridad: El sistema operativo denegó el acceso por falta de permisos.");
        }
    }
}
