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
 * @date 29 nov. 2021 21:25:50
 */
public class Preguntas {

    public static String[][] preguntas = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaA = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaB = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaC = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaD = new String[QuienQuiereSerMillonario.niveles][5];
    
    // Guarda en preguntas y respuestas las que se van a jugar en una partida
    // Aleatoriamente una de cada nivel
    
    public static void generarPreguntasPartida(String[] preguntas, String[] respuestaA, String[] respuestaB, String[] respuestaC, String[] respuestaD) {
        
    }
    
    public static void generarPreguntas() {
        
        //Nivel 1
        preguntas[0][0] = "...";
        preguntas[0][1] = "...";
        preguntas[0][2] = "...";
        preguntas[0][3] = "...";
        preguntas[0][4] = "...";
        
        respuestaA[0][0] = "...";
        respuestaA[0][1] = "...";
        respuestaA[0][2] = "...";
        respuestaA[0][3] = "...";
        respuestaA[0][4] = "...";
        
        respuestaB[0][0] = "...";
        respuestaB[0][1] = "...";
        respuestaB[0][2] = "...";
        respuestaB[0][3] = "...";
        respuestaB[0][4] = "...";
        
        respuestaC[0][0] = "...";
        respuestaC[0][1] = "...";
        respuestaC[0][2] = "...";
        respuestaC[0][3] = "...";
        respuestaC[0][4] = "...";
        
        respuestaD[0][0] = "...";
        respuestaD[0][1] = "...";
        respuestaD[0][2] = "...";
        respuestaD[0][3] = "...";
        respuestaD[0][4] = "...";
        
    }

    
}
