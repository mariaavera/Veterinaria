package app;

import model.Mascota;
import model.Veterinaria;
import javax.swing.*;

public class Aplicacion {
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria("Mi Veterinaria", "3127015459", "Cra.20 #21-52", "123456789");
        boolean continuar = true;

        while (continuar) {
            String opcion = JOptionPane.showInputDialog(
                    " Menú de Veterinaria\n" +
                            "1. Registrar mascota\n" +
                            "2. Buscar mascota\n" +
                            "3. Eliminar mascota\n" +
                            "4. Actualizar mascota\n" +
                            "5. Salir\n\n" +
                            "Ingrese una opción:"
            );

            switch (opcion) {
                case "1":
                    String codigo = JOptionPane.showInputDialog(null, "Ingrese el código de la mascota:");
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la mascota:");
                    String raza = JOptionPane.showInputDialog(null, "Ingrese la raza de la mascota:");
                    double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el peso de la mascota:"));
                    String color = JOptionPane.showInputDialog(null, "Ingrese el color de su mascota: ");
                    byte edad = Byte.valueOf(JOptionPane.showInputDialog(null, "Ingrese la edad de la mascota:"));
                    String especie = JOptionPane.showInputDialog(null, "Ingrese la especie de la mascota:");

                    String[] enfermedades = new String[5];
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(
                            null, "¿Cuántas enfermedades tiene " + nombre + "? (0 si no tiene, máximo 5):"
                    ));

                    if (cantidad == 0) {
                        enfermedades[0] = "No tiene";
                    } else {
                        if (cantidad > 5) {
                            JOptionPane.showMessageDialog(null, "Solo se registrarán 5 enfermedades.");
                            cantidad = 5;
                        }
                        for (int i = 0; i < cantidad; i++) {
                            enfermedades[i] = JOptionPane.showInputDialog(null, "Ingrese la enfermedad " + (i + 1) + ":");
                        }
                        for (int i = cantidad; i < enfermedades.length; i++) {
                            enfermedades[i] = "-";
                        }

                    }
                    var masc = new Mascota(codigo, nombre, raza, peso,color, edad, especie, enfermedades);
                    JOptionPane.showMessageDialog(null, vet.registrarMascota(masc));
                    break;

                case "2":
                    String codigoBuscar = JOptionPane.showInputDialog("Ingrese el código de la mascota a buscar:");
                    Mascota encontrada = vet.buscarMascota(codigoBuscar);
                    if (encontrada != null) {
                        JOptionPane.showMessageDialog(null, "Mascota encontrada:\n" + encontrada);
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe mascota con ese código.");
                    }
                    break;

                case "3":
                    String codigoEliminar = JOptionPane.showInputDialog("Ingrese el código de la mascota a eliminar:");
                    JOptionPane.showMessageDialog(null, vet.eliminarMascota(codigoEliminar));
                    break;
                case "4":
                    String codigoAct = JOptionPane.showInputDialog("Ingrese el código de la mascota a actualizar:");
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                    JOptionPane.showMessageDialog(null, vet.actualizarMascota(codigoAct, nuevoNombre));
                    break;
                case "5":
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios, vuelva pronto :)");
                    break;
            }
        }
    }
}
