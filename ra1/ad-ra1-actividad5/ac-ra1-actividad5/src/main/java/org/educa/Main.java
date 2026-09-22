package org.educa;

import org.educa.dao.FileDao;
import org.educa.dao.impl.FileDaoImpl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File archivo = new File("/home/victor/DAM/prueba/enteros.dat");

        if (!archivo.exists()) {
            System.out.println("El fichero 'enteros.dat' no existe.");
            return;
        }

        // Se usa try-with-resources para asegurar el cierre del DAO y del Scanner
        try (FileDao enteroDAO = new FileDaoImpl(archivo);
             Scanner sc = new Scanner(System.in)) {

            long totalEnteros = enteroDAO.contarEnteros();

            if (totalEnteros == 0) {
                System.out.println("El fichero está vacío o no contiene enteros completos.");
                return;
            }

            System.out.println("El fichero contiene " + totalEnteros + " entero(s).");

            // Validar posición
            int posicion = pedirPosicionValida(sc, totalEnteros);

            // Lectura con el DAO
            int valorActual = enteroDAO.obtenerPorPosicion(posicion);
            System.out.println("Valor actual en la posición " + posicion + ": " + valorActual);

            // Pedir nuevo valor
            System.out.print("Introduce el nuevo valor entero: ");
            while (!sc.hasNextInt()) {
                System.out.println("⚠️ Entrada no válida. Introduce un número entero:");
                sc.next();
            }
            int nuevoValor = sc.nextInt();

            // Escritura/Actualización con el DAO
            enteroDAO.actualizar(posicion, nuevoValor);

            System.out.println("✅ El valor de la posición " + posicion + " se ha actualizado a " + nuevoValor + " correctamente.");

        } catch (Exception e) {
            System.out.println("Error de E/S en la capa de datos: " + e.getMessage());
        }
    }

    private static int pedirPosicionValida(Scanner sc, long total) {
        int pos;
        while (true) {
            System.out.print("Introduce la posición a modificar (1 - " + total + "): ");
            if (sc.hasNextInt()) {
                pos = sc.nextInt();
                if (pos >= 1 && pos <= total) {
                    return pos;
                }
            } else {
                sc.next();
            }
            System.out.println("⚠️ Posición no válida. Debe estar entre 1 y " + total + ".");
        }
    }
}
