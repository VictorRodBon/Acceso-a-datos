package org.educa;

import org.educa.entity.ClienteEntity;
import org.educa.service.ClienteService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();

        int opcion;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Elige una de las siguientes opciones:" +
                        "\n 1) Crear" +
                        "\n 2) Borrar" +
                        "\n 3) Actualizar" +
                        "\n 4) Salir");

                if (!sc.hasNextInt()) {
                    System.out.println("Introduce un número válido (1, 2, 3, 4).");
                    sc.next(); // descarta la entrada no numérica
                    opcion = 0; // asegura que continúe el bucle
                    continue;
                }

                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Crear");
                        crear(sc, clienteService);
                        break;
                    case 2:
                        System.out.println("Borrar");
                        delete(sc, clienteService);
                        break;
                    case 3:
                        System.out.println("Actualizar");
                        actualizar(sc, clienteService);
                        break;
                    case 4:
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("Introduce una opción válida (1, 2, 3, 4).");
                        break;
                }
            } while (opcion != 4);
        }
    }

    public static void actualizar(Scanner sc, ClienteService service) {
        System.out.println("Introduce el id del cliente a actualizar:");
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un id numérico válido:");
            sc.next();
        }
        int id = sc.nextInt();
        sc.nextLine(); // consume el '\n' tras leer el id

        System.out.println("Introduce el nuevo nombre del cliente:");
        String nombre = sc.nextLine().trim();

        service.update(id, nombre);
    }

    public static void delete(Scanner sc, ClienteService service) {
        System.out.print("Introduce el id del usuario a eliminar: ");
        int id = sc.nextInt();
        sc.nextLine(); // Limpia el salto de línea pendiente tras nextInt()

        ClienteEntity cliente = service.getById(id);
        if (cliente == null) {
            System.out.println("No se encontró ningún usuario con el ID: " + id);
            return;
        }

        System.out.println(cliente);

        String a;
        do {
            System.out.print("¿Seguro que quieres eliminar este usuario? (s/N): ");
            a = sc.nextLine().trim();

            if (a.equalsIgnoreCase("s")) {
                service.delete(cliente);
                System.out.println("Usuario eliminado correctamente.");
                return;
            } else if (a.equalsIgnoreCase("n") || a.isEmpty()) { // Por defecto 'N' al pulsar Enter
                System.out.println("Operación cancelada.");
                return;
            }
        } while (true);
    }


    public static void crear(Scanner sc, ClienteService service){
        sc.nextLine();
        System.out.println("dni: ");
        String dni = sc.nextLine();
        System.out.println("nombre: ");
        String nombre = sc.nextLine();
        System.out.println("p_apellido: ");
        String pApellido = sc.nextLine();
        System.out.println("s_apellido: ");
        String sApellido = sc.nextLine();
        System.out.println("email: ");
        String email = sc.nextLine();
        System.out.println("telefono: ");
        String telefono = sc.nextLine();

        ClienteEntity cliente = new ClienteEntity();
        cliente.setDni(dni);
        cliente.setNombre(nombre);
        cliente.setPApellido(pApellido);
        cliente.setSApellido(sApellido);
        cliente.setEmail(email);
        cliente.setTelefono(telefono);

        service.crear(cliente);
    }
}