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
import java.util.Scanner;
import java.lang.Math;

public class Preguntas {

    //public static String[][][] preguntas = new String[QuienQuiereSerMillonario.niveles][5][5];
    public static String[][] preguntas = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaA = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaB = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaC = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaD = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] correcta = new String[QuienQuiereSerMillonario.niveles][5];

    // Guarda en preguntas y respuestas las que se van a jugar en una partida
    // Aleatoriamente una de cada nivel
    // Comprueba si la respuesta introducida es la correcta
    // Generamos las preguntas (aleatorias) y respuestas de cada nivel

    // Generamos las preguntas que van a aparecer al usuario
    public static void generarPreguntasPartida(String[][] pregunta, String[][] respuestaA, String[][] respuestaB, String[][] respuestaC, String[][] respuestaD) {

        //Creamos un número random para que no nos salga siempre la misma pregunta en cada nivel en cada partida
        int rnd = (int) (0 + Math.random() * 5);

        for (int i = 0; i < QuienQuiereSerMillonario.niveles; i++) {
            for (int j = 0; j < 1; j++) {

                System.out.println((i + 1) + ". " + preguntas[i][rnd]);
                System.out.println("a. " + respuestaA[i][rnd] + "\t" + "b. " + respuestaB[i][rnd]
                        + "\n" + "c. " + respuestaC[i][rnd] + "\t" + "d. " + respuestaD[i][rnd] + "\n");
            }

            boolean repuesta = comprobarRespuesta(i, rnd);

            if (repuesta == true && i != 11) {
                System.out.println("¡¡Respuesta correcta!!");
                System.out.print("Dinero acumulado: ");
                Dinero.dineroGanado(i + 1);
            } else if (repuesta == true && i == 11) {
                System.out.println("!!Has ganado el concurso¡¡");
                System.out.print("Dinero final: ");
                Dinero.dineroGanado(i + 1);
            } else {
                System.out.println("Respuesta incorrecta :(");
                System.out.print("Dinero final: ");
                Dinero.dineroSeguro(i);
                break;
            }
        }
    }

    // Guardamos la respuesta del usuario
    public static String pedirRespuesta() {

        Scanner in = new Scanner(System.in);

        String resp = in.next();

        return resp.toLowerCase();
    }

    public static boolean comprobarRespuesta(int nivel, int numPregunta) {

        String respCorrecta = correcta[nivel][numPregunta];

        if (pedirRespuesta().equalsIgnoreCase(respCorrecta)) {

            return true;

        } else {

            return false;

        }
        /* // Vector donde guardaremos las posiciones encontradas
        int[] vpos = new int[MAX];
        // Nº de posiciones encontradas
        int npos = 0;
        
        // Recorremos 'vector' buscando el texto 'buscar' en sus posiciones
        // Guardaremos en 'vpos' las posiciones que contengan 'buscar'
        for (int i = 0; i < contar; i++) {
            if (vector[i].toUpperCase().contains(buscar.toUpperCase())) {
                vpos[npos] = i;
                npos++;
            }
        }
        
        // Reducimod el tamaño de 'vpos' al mínimo y lo devolvemos
        vpos = Arrays.copyOf(vpos, npos);
        
        return vpos; */
    }

    /*public static void main(String[] args) {
        int[][] matrizNumeros = new int[5][5];
        inicializar(matrizNumeros);
        visualizar(matrizNumeros);
    }
 
    static void inicializar(int[][] matriz){
         Random r = new Random();
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = r.nextInt(25) + 1; 
            }
        }
    }
     
    static void visualizar(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }*/
    public static void generarBancoPreguntas(String[][] pregunta) {

        //Nivel 1
        preguntas[0][0] = "¿Cuál es la capital de Portugal?";
        preguntas[0][1] = "¿Cuál es el símbolo químico de la plata?";
        preguntas[0][2] = "¿El director de cine Frank Capra, famoso por ‘It's a Wonderful Life’, nació ¿en qué país mediterráneo?";
        preguntas[0][3] = "¿Cuál es el nombre de la banda con los siguientes miembros: John Deacon, Brian May, Freddie Mercury, Roger Taylor?";
        preguntas[0][4] = "¿En que país se encuentra situada la Estatua de la Libertad?";

        respuestaA[0][0] = "Lisboa";
        respuestaA[0][1] = "Pl";
        respuestaA[0][2] = "Italia";
        respuestaA[0][3] = "Queen";
        respuestaA[0][4] = "Estados Unidos";

        respuestaB[0][0] = "Dublín";
        respuestaB[0][1] = "Ag";
        respuestaB[0][2] = "España";
        respuestaB[0][3] = "The Beatles";
        respuestaB[0][4] = "Inglaterra";

        respuestaC[0][0] = "Madrid";
        respuestaC[0][1] = "P";
        respuestaC[0][2] = "Francia";
        respuestaC[0][3] = "The Rolling Stones";
        respuestaC[0][4] = "Canadá";

        respuestaD[0][0] = "París";
        respuestaD[0][1] = "Al";
        respuestaD[0][2] = "Chipre";
        respuestaD[0][3] = "AC/DC";
        respuestaD[0][4] = "Francia";

        correcta[0][0] = "a";
        correcta[0][1] = "b";
        correcta[0][2] = "a";
        correcta[0][3] = "a";
        correcta[0][4] = "a";

        //Nivel 2
        preguntas[1][0] = "¿En que año fue el descubrimiento de América?";
        preguntas[1][1] = "¿Qué cantante fue conocido, entre otras cosas, como 'El rey del pop' y 'El guante'?";
        preguntas[1][2] = "¿Qué tipo de animal son las ranas?";
        preguntas[1][3] = "¿Qué número puede ser un día o dos años?";
        preguntas[1][4] = "¿Qué actor ganó el Oscar al mejor actor por las películas Philadelphia (1993) y Forrest Gump (1994)?";

        respuestaA[1][0] = "1492";
        respuestaA[1][1] = "Prince";
        respuestaA[1][2] = "Anfibios";
        respuestaA[1][3] = "12";
        respuestaA[1][4] = "Tom Hanks";

        respuestaB[1][0] = "1592";
        respuestaB[1][1] = "Elvis Presley";
        respuestaB[1][2] = "Mamíferos";
        respuestaB[1][3] = "24";
        respuestaB[1][4] = "Tom Holland";

        respuestaC[1][0] = "1942";
        respuestaC[1][1] = "Michael Jackson";
        respuestaC[1][2] = "Reptíles";
        respuestaC[1][3] = "36";
        respuestaC[1][4] = "Tom Ellis";

        respuestaD[1][0] = "1490";
        respuestaD[1][1] = "Freddie Mercury";
        respuestaD[1][2] = "Peces";
        respuestaD[1][3] = "48";
        respuestaD[1][4] = "Tom Cruise";

        correcta[1][0] = "a";
        correcta[1][1] = "c";
        correcta[1][2] = "a";
        correcta[1][3] = "b";
        correcta[1][4] = "a";

        //Nivel 3
        preguntas[2][0] = "¿Qué estrella del pop tuvo éxito en las listas de 2015 con los sencillos 'Sorry' y 'Love Yourself'?";
        preguntas[2][1] = "¿Qué actriz interpretó a Mary Poppins en la película de 1964 Mary Poppins?";
        preguntas[2][2] = "¿En qué parte del mundo se exhibe la Mona Lisa de Leonardo da Vinci?";
        preguntas[2][3] = "¿Qué se comía Lolita en una de sus canciones?";
        preguntas[2][4] = "¿Cómo sigue la frase de Bruce Lee: ‘Be water…’?";

        respuestaA[2][0] = "Bruno Mars";
        respuestaA[2][1] = "Julie Andrews";
        respuestaA[2][2] = "Francia";
        respuestaA[2][3] = "Un arroz con bacalao";
        respuestaA[2][4] = "My love";

        respuestaB[2][0] = "Jason Derulo";
        respuestaB[2][1] = "Vivien Leigh";
        respuestaB[2][2] = "Italia";
        respuestaB[2][3] = "Unos churros";
        respuestaB[2][4] = "My son";

        respuestaC[2][0] = "Justin Bieber";
        respuestaC[2][1] = "Julia Roberts";
        respuestaC[2][2] = "España";
        respuestaC[2][3] = "Las uñas";
        respuestaC[2][4] = "My friend";

        respuestaD[2][0] = "Drake";
        respuestaD[2][1] = "Judy Garland";
        respuestaD[2][2] = "Alemania";
        respuestaD[2][3] = "La cabeza";
        respuestaD[2][4] = "My boss";

        correcta[2][0] = "c";
        correcta[2][1] = "b";
        correcta[2][2] = "a";
        correcta[2][3] = "a";
        correcta[2][4] = "c";

        //Nivel 4
        preguntas[3][0] = "¿Cuántos corazones tiene un pulpo?";
        preguntas[3][1] = "¿De quién es la célebre frase: ‘Que te pego, leche’?";
        preguntas[3][2] = "¿Cuál de estos artistas participó en la composición de ‘La mordidita’, de Ricky Martin?";
        preguntas[3][3] = "¿En que año acabó la Primera Guerra Mundial?";
        preguntas[3][4] = "¿Qué tiene de curioso el caso de Benjamin Button?";

        respuestaA[3][0] = "Tres";
        respuestaA[3][1] = "José Maria Ruiz-Mateos";
        respuestaA[3][2] = "Pablo Puyol";
        respuestaA[3][3] = "1918";
        respuestaA[3][4] = "Está en varios sitios a la vez";

        respuestaB[3][0] = "Dos";
        respuestaB[3][1] = "Jesús Gil";
        respuestaB[3][2] = "Beatriz Luengo";
        respuestaB[3][3] = "1920";
        respuestaB[3][4] = "Cada vez es más joven";

        respuestaC[3][0] = "Cuatro";
        respuestaC[3][1] = "Hugo Chávez";
        respuestaC[3][2] = "Mónica Cruz";
        respuestaC[3][3] = "1915";
        respuestaC[3][4] = "Conoce su propio futuro";

        respuestaD[3][0] = "Uno";
        respuestaD[3][1] = "Antonio Tejero";
        respuestaD[3][2] = "Dafne Fernández";
        respuestaD[3][3] = "1917";
        respuestaD[3][4] = "Un cuadro guarda su vejez";

        correcta[3][0] = "a";
        correcta[3][1] = "a";
        correcta[3][2] = "b";
        correcta[3][3] = "a";
        correcta[3][4] = "b";

        //Nivel 5
        preguntas[4][0] = "Al último clasificado del torneo Seis Naciones de rugby se le entrega…";
        preguntas[4][1] = "¿En qué deporte se destacó Neil Adams?";
        preguntas[4][2] = "¿De qué nacionalidad era el artista Henri Matisse?";
        preguntas[4][3] = "¿Qué fruto da el olmo?";
        preguntas[4][4] = "Hormona que libera nuestro cuerpo como respuesta a una situación de estrés:";

        respuestaA[4][0] = "Una cuchara de madera";
        respuestaA[4][1] = "Jiu Jitsu";
        respuestaA[4][2] = "Suizo";
        respuestaA[4][3] = "Bellota";
        respuestaA[4][4] = "Oxitocina";

        respuestaB[4][0] = "Una medalla de madera";
        respuestaB[4][1] = "Karate";
        respuestaB[4][2] = "Francés";
        respuestaB[4][3] = "Dátil";
        respuestaB[4][4] = "Cortisol";

        respuestaC[4][0] = "La copa de perdedores";
        respuestaC[4][1] = "Taekwondo";
        respuestaC[4][2] = "Canadiense";
        respuestaC[4][3] = "Sámara";
        respuestaC[4][4] = "Serotonina";

        respuestaD[4][0] = "Una urna con cenizas";
        respuestaD[4][1] = "Judo";
        respuestaD[4][2] = "Belga";
        respuestaD[4][3] = "Nuez";
        respuestaD[4][4] = "Vallado";

        correcta[4][0] = "a";
        correcta[4][1] = "d";
        correcta[4][2] = "b";
        correcta[4][3] = "c";
        correcta[4][4] = "b";

        //Nivel 6
        preguntas[5][0] = "En 1935, Federico García Lorca publicó un libro de seis poemas escritos en…";
        preguntas[5][1] = "¿Cuántos gramos de sal (cloruro de sodio) hay en un litro de agua de mar típica?";
        preguntas[5][2] = "¿Cuál de estas ciudades no está en la costa oeste de EEUU?";
        preguntas[5][3] = "Johann Sebastian Bach es un compositor...";
        preguntas[5][4] = "Uno de estos animales no tiene dientes.";

        respuestaA[5][0] = "Francés";
        respuestaA[5][1] = "Ninguno";
        respuestaA[5][2] = "Malibú";
        respuestaA[5][3] = "Renacentista";
        respuestaA[5][4] = "El pingüino";

        respuestaB[5][0] = "Catalán";
        respuestaB[5][1] = "Tres";
        respuestaB[5][2] = "Sacramento";
        respuestaB[5][3] = "Barroco";
        respuestaB[5][4] = "El delfín";

        respuestaC[5][0] = "Inglés";
        respuestaC[5][1] = "Uno";
        respuestaC[5][2] = "Denver";
        respuestaC[5][3] = "Clásico";
        respuestaC[5][4] = "La serpiente";

        respuestaD[5][0] = "Gallego";
        respuestaD[5][1] = "Dos";
        respuestaD[5][2] = "San Francisco";
        respuestaD[5][3] = "Romántico";
        respuestaD[5][4] = "La orca";

        correcta[5][0] = "d";
        correcta[5][1] = "a";
        correcta[5][2] = "c";
        correcta[5][3] = "b";
        correcta[5][4] = "a";

        //Nivel 7
        preguntas[6][0] = "¿De qué nacionalidad fue el escultor Alberto Giacometti?";
        preguntas[6][1] = "Las flores de Bach son un remedio para…";
        preguntas[6][2] = "¿Qué rey montado a caballo puedes observar en la Plaza Mayor de Madrid?";
        preguntas[6][3] = "¿Qué es la anosmia?";
        preguntas[6][4] = "¿De qué murió el compositor Chopin?";

        respuestaA[6][0] = "Suizo";
        respuestaA[6][1] = "Las arrugas";
        respuestaA[6][2] = "Felipe III";
        respuestaA[6][3] = "Pérdida de orina";
        respuestaA[6][4] = "De un ataque al corazón";

        respuestaB[6][0] = "Francés";
        respuestaB[6][1] = "Las manchas solares";
        respuestaB[6][2] = "Carlos II";
        respuestaB[6][3] = "Pérdida del olfato";
        respuestaB[6][4] = "De insuficiencia renal aguda";

        respuestaC[6][0] = "Belga";
        respuestaC[6][1] = "Los problemas emocionales";
        respuestaC[6][2] = "Fernando VII";
        respuestaC[6][3] = "Pérdida del apetito";
        respuestaC[6][4] = "De un cáncer estomacal";

        respuestaD[6][0] = "Italiano";
        respuestaD[6][1] = "Las ojeras";
        respuestaD[6][2] = "Alfonso XIII";
        respuestaD[6][3] = "Pérdida de la libido";
        respuestaD[6][4] = "De tuberculosis";

        correcta[6][0] = "a";
        correcta[6][1] = "c";
        correcta[6][2] = "a";
        correcta[6][3] = "b";
        correcta[6][4] = "d";

        //Nivel 8
        preguntas[7][0] = "'Future Nostalgia' que contiene el single 'Don't Start Now' es el segundo álbum de estudio ¿de qué cantante inglés?";
        preguntas[7][1] = "No es una postura de yoga";
        preguntas[7][2] = "¿Quién fue el último monarca que vivió de forma estable en el Palacio Real de Madrid?";
        preguntas[7][3] = "¿Cuál de los siguientes hombres no tiene un elemento químico llamado como él?";
        preguntas[7][4] = "¿En qué película pudiste emocionarte escuchando la célebre frase:’¡Oh, capitán, mi capitán!’?";

        respuestaA[7][0] = "Madonna";
        respuestaA[7][1] = "El guerrero";
        respuestaA[7][2] = "Alfonso XII";
        respuestaA[7][3] = "Isaac Newton";
        respuestaA[7][4] = "La tormenta perfecta";

        respuestaB[7][0] = "Dua Lipa";
        respuestaB[7][1] = "El niño";
        respuestaB[7][2] = "Alfonso XIII";
        respuestaB[7][3] = "Albert Einstein";
        respuestaB[7][4] = "Capitán América";

        respuestaC[7][0] = "Adele";
        respuestaC[7][1] = "La bailarina";
        respuestaC[7][2] = "Juan Carlos I";
        respuestaC[7][3] = "Niels Bohr";
        respuestaC[7][4] = "El club de los poetas muertos";

        respuestaD[7][0] = "Marilyn Manson";
        respuestaD[7][1] = "La abuela";
        respuestaD[7][2] = "Carlos III";
        respuestaD[7][3] = "Enrico Fermi";
        respuestaD[7][4] = "Titanic";

        correcta[7][0] = "b";
        correcta[7][1] = "d";
        correcta[7][2] = "b";
        correcta[7][3] = "a";
        correcta[7][4] = "c";

        //Nivel 9
        preguntas[8][0] = "¿En que país se encuentra situada la Torre Juche?";
        preguntas[8][1] = "¿Qué pieza del motor de un coche transforma el movimiento vertical de los pistones en circular?";
        preguntas[8][2] = "Wimbledon 2017 fue ganado por la 14ta semilla que sorprendentemente derrotó a Venus Williams en la final. ¿Quien es ella?";
        preguntas[8][3] = "No es una película de David Fincher:";
        preguntas[8][4] = "En la tabla periódica de los elementos, ¿hay cuatro elementos diferentes cuyos nombres se basan en…?";

        respuestaA[8][0] = "Corea del Norte";
        respuestaA[8][1] = "El alternador";
        respuestaA[8][2] = "Garbiñe Muguruza";
        respuestaA[8][3] = "El club de la lucha";
        respuestaA[8][4] = "En el gato mascota de Antoine Lavoisier";

        respuestaB[8][0] = "Corea del Sur";
        respuestaB[8][1] = "El cárter";
        respuestaB[8][2] = "María Sharápova";
        respuestaB[8][3] = "Perdida";
        respuestaB[8][4] = "En una aldea minera sueca";

        respuestaC[8][0] = "Japón";
        respuestaC[8][1] = "El cigüeñal";
        respuestaC[8][2] = "Serena Williams";
        respuestaC[8][3] = "Seven";
        respuestaC[8][4] = "En la luna de Neptuno";

        respuestaD[8][0] = "China";
        respuestaD[8][1] = "La culata";
        respuestaD[8][2] = "Petra Kvitová";
        respuestaD[8][3] = "El indomable Will Hunting";
        respuestaD[8][4] = "En el nombre de soltera de Marie Curie";

        correcta[8][0] = "a";
        correcta[8][1] = "c";
        correcta[8][2] = "a";
        correcta[8][3] = "d";
        correcta[8][4] = "b";

        //Nivel 10
        preguntas[9][0] = "¿Qué juego deportivo inventó James Naismith en 1891?";
        preguntas[9][1] = "¿Qué artista pintó 'The Water-Lily Pond' en 1899?";
        preguntas[9][2] = "Posición de ballet en la que se coloca el peso en una pierna y la otra está estirada hacia atrás.";
        preguntas[9][3] = "¿Qué artista es famoso por pintar bailarinas?";
        preguntas[9][4] = "Existen tres ciudades europeas que preservan manuscritos originales de la civilización maya. ¿Cuál de estas ciudades no los tiene?";

        respuestaA[9][0] = "Fútbol";
        respuestaA[9][1] = "Claude Monet";
        respuestaA[9][2] = "Adagio";
        respuestaA[9][3] = "Paul Cézanne";
        respuestaA[9][4] = "Madrid";

        respuestaB[9][0] = "Baloncesto";
        respuestaB[9][1] = "Vincent van Gogh";
        respuestaB[9][2] = "Arabesque";
        respuestaB[9][3] = "Paul Gauguin";
        respuestaB[9][4] = "Dresden";

        respuestaC[9][0] = "Balonmano";
        respuestaC[9][1] = "Pablo Picasso";
        respuestaC[9][2] = "Ballonné Pas";
        respuestaC[9][3] = "Edgar Degas";
        respuestaC[9][4] = "París";

        respuestaD[9][0] = "Tenis";
        respuestaD[9][1] = "Salvador Dalí";
        respuestaD[9][2] = "Battu";
        respuestaD[9][3] = "Claude Monet";
        respuestaD[9][4] = "Roma";

        correcta[9][0] = "b";
        correcta[9][1] = "a";
        correcta[9][2] = "b";
        correcta[9][3] = "c";
        correcta[9][4] = "d";

        //Nivel 11
        preguntas[10][0] = "¿Junto a qué río se levanta el Taj Mahal?";
        preguntas[10][1] = "El canadiense Connor McDavid es una estrella en ascenso en qué deporte.";
        preguntas[10][2] = "¿Qué famoso vino italiano procede de la Toscana?";
        preguntas[10][3] = "¿Cuál de estas películas de los 80 se estrenó primero?";
        preguntas[10][4] = "¿Cuál de estos personajes jamás apareció en la revista Time como 'Hombre del Año'?";

        respuestaA[10][0] = "Indo";
        respuestaA[10][1] = "Hockey sobre hielo";
        respuestaA[10][2] = "Prosecco";
        respuestaA[10][3] = "Cocodrilo Dundee";
        respuestaA[10][4] = "Adolf Hitler";

        respuestaB[10][0] = "Ganges";
        respuestaB[10][1] = "Balonmano";
        respuestaB[10][2] = "Vinho verde";
        respuestaB[10][3] = "Entre pillos anda el juego";
        respuestaB[10][4] = "Ayatolá Jomeiní";

        respuestaC[10][0] = "Yamuna";
        respuestaC[10][1] = "Voleyball";
        respuestaC[10][2] = "Chianti";
        respuestaC[10][3] = "Arma letal";
        respuestaC[10][4] = "Joseph Stalin";

        respuestaD[10][0] = "Meghna";
        respuestaD[10][1] = "Baloncesto";
        respuestaD[10][2] = "Chardonnay";
        respuestaD[10][3] = "Regreso al futuro";
        respuestaD[10][4] = "Mao Zedong";

        correcta[10][0] = "c";
        correcta[10][1] = "a";
        correcta[10][2] = "c";
        correcta[10][3] = "b";
        correcta[10][4] = "d";

        //Nivel 12
        preguntas[11][0] = "¿Cuántos girasoles había en la tercera versión de Van Gogh de la pintura 'Girasoles'?";
        preguntas[11][1] = "¿Cuántas latas puedes contar en la obra ‘Latas de sopa Campbell’, de Andy Warhol?";
        preguntas[11][2] = "¿Cuántos poemas acompañan a la ‘canción desesperada’ que escribió Neruda?";
        preguntas[11][3] = "¿En la corte de qué rey pasó Leonardo Da Vinci los dos últimos años de su vida?";
        preguntas[11][4] = "¿Quién fue el primer hombre en viajar dos veces al espacio?";

        respuestaA[11][0] = "10";
        respuestaA[11][1] = "8";
        respuestaA[11][2] = "Cinco";
        respuestaA[11][3] = "Francisco I";
        respuestaA[11][4] = "Vladimir Titov";

        respuestaB[11][0] = "12";
        respuestaB[11][1] = "16";
        respuestaB[11][2] = "Diez";
        respuestaB[11][3] = "Enrique IV";
        respuestaB[11][4] = "Michael Collins";

        respuestaC[11][0] = "11";
        respuestaC[11][1] = "32";
        respuestaC[11][2] = "Quince";
        respuestaC[11][3] = "Carlos III";
        respuestaC[11][4] = "Yuri Gagarin";

        respuestaD[11][0] = "13";
        respuestaD[11][1] = "64";
        respuestaD[11][2] = "Veinte";
        respuestaD[11][3] = "Luis XII";
        respuestaD[11][4] = "Gus Grissom";

        correcta[11][0] = "b";
        correcta[11][1] = "c";
        correcta[11][2] = "d";
        correcta[11][3] = "a";
        correcta[11][4] = "d";

    }

}
