/*
 * Proyecto QuienQuiereSerMillonario - Archivo Preguntas.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package quienquieresermillonario;

/**
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 30 nov. 2021 23:17:42
 */

public class Dinero {

    // Definimos el dinero de cada nivel y lo vamos mostrando cada vez que gana o cuando pierde
    public static void dineroGanado(int nivel) {

        int dinero;

        switch (nivel) {

            case 1:
                dinero = 100;
                System.out.println(dinero + "€\n");
                break;
            case 2:
                dinero = 500;
                System.out.println(dinero + "€\n");
                break;
            case 3:
                dinero = 1000;
                System.out.println(dinero + "€\n");
                break;
            case 4:
                dinero = 1500;
                System.out.println(dinero + "€\n");
                break;
            case 5:
                dinero = 2500;
                System.out.println(dinero + "€\n");
                break;
            case 6:
                dinero = 5000;
                System.out.println(dinero + "€\n");
                break;
            case 7:
                dinero = 10000;
                System.out.println(dinero + "€\n");
                break;
            case 8:
                dinero = 20000;
                System.out.println(dinero + "€\n");
                break;
            case 9:
                dinero = 50000;
                System.out.println(dinero + "€\n");
                break;
            case 10:
                dinero = 100000;
                System.out.println(dinero + "€\n");
                break;
            case 11:
                dinero = 300000;
                System.out.println(dinero + "€\n");
                break;
            case 12:
                dinero = 1000000;
                System.out.println("\nEnhorabuena, !!has ganado el concurso¡¡\n"
                        + "Premio final: " + dinero + "€\n");
                break;
            default:
                dinero = 0;
                System.out.println(dinero + "€\n");
                break;
        }
    }

    // Definimos el dinero que va a tener seguro si pasa las zonas seguras
    public static void dineroSeguro(int nivel) {

        // Variables de las zonas seguras
        int zonaSegura1 = 4;
        int zonaSegura2 = 8;

        // Si fallamos entre los niveles 5 y 8 aseguramos el premio del nivel 4
        if (nivel > zonaSegura1 && nivel <= zonaSegura2) {
            dineroGanado(zonaSegura1);
        } 
        // Si fallamos entre los niveles 9 y 11 aseguramos el precio del nivel 8
        else if (nivel > zonaSegura2 && nivel <= 12) {
            dineroGanado(zonaSegura2);
        }
        // Si fallamos en cualquier otro no aseguramos nada
        else {
            dineroGanado(0);
        }
    }
}
