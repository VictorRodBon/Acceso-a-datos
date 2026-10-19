package services;

import dao.FileDao;
import dao.FileDaoImp;
import java.io.File;

public class FileService {
    FileDao daoImp = new FileDaoImp();

    /**
     * Llama a un dao que genera un fichero con la información referente a los ficheros y directorios de la ruta que se le pasa por parámetro a la función
     * @param directoryPath Obtenemos la ruta de la que queremos obtener la información
     * @return TRUE si se ha cerado el fichero, FALSE si ha fallado en alguna parte
     */
    public boolean escribirInformacion(String directoryPath) {
        File path = new File(directoryPath);

        // Veerificar si se ha pasado un directorio, en caso contrario se retorna FALSE
        if (!path.isDirectory()) {
            return false;
        }

        File[] ficheros = path.listFiles();
        if (ficheros == null) {
            return false;
        }

        // Se recorren los ficheros para almacenar la información referente en el stringBuilder, que luego se pasa como parámetro al dao
        StringBuilder contenido = new StringBuilder();
        for (File fichero : ficheros) {
            contenido.append(fichero.getName()).append(";")
                    .append(fichero.isDirectory() ? "D" : "F").append(";")
                    .append(obtenerPermisos(fichero))
                    .append(fichero.length()).append("\n");
        }

        // Delegamos directamente el resultado booleano del DAO
        return daoImp.createFile(contenido.toString());
    }

    private String obtenerPermisos(File f) {
        return String.format("[%s/%s/%s];",
                f.canRead() ? "R" : "-",
                f.canWrite() ? "W" : "-",
                f.canExecute() ? "X" : "-"
        );
    }
}