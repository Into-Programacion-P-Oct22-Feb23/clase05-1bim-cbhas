/*
 * Realizar un programa en java que permita determinar
 * si un estudiante ha pasado el ciclo
 * se ingresa el promedio del estudiante
 * - Un estudiante pasa el ciclo si tiene un promedio
 * mayor o igual a 7.5. Si el estudiante aprueba el ciclo, presentar
 * un mensaje como sigue, Estudiante aprobado con un promedio: 8.1 
 * CASO CONTRARIO presentar un mensaje con el siguiente texto, 
 * Estudiante reprobado con un promedio: 7.4 
 */
package ejemplo2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Condicionales compuestos
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2

        System.out.println("Ingrese la primera nota por favor");
        double primeranota = entrada.nextDouble();

        System.out.println("Ingrese la segunda nota por favor");
        double segundanota = entrada.nextDouble();

        double promedio = ((primeranota + segundanota) / 2);

        if (promedio >= 7.5) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio de: %.2f\n", promedio);
            System.out.printf("Siga así!!\n");
        } else {
            System.out.printf("Estudiante reprobado con un "
                    + "promedio de: %.2f\n", promedio);
            System.out.printf("Estudie y mejore para que su promedio sea mayor"
                    + " a 7.5 ♥\n");
        }
    }

}
      