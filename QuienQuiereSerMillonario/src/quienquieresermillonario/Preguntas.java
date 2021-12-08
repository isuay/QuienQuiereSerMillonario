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

    // Matrices de las preguntas, respuestas y la correcta de cada nivel
    public static String[][] preguntas = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaA = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaB = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaC = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] respuestaD = new String[QuienQuiereSerMillonario.niveles][5];
    public static String[][] correcta = new String[QuienQuiereSerMillonario.niveles][5];

    // Variable que indica si hemos usado el comodín
    public static boolean comodin = false;

    // Generamos las preguntas que van a aparecer al usuario
    public static void generarPreguntasPartida(String[][] pregunta, String[][] respuestaA, String[][] respuestaB, String[][] respuestaC, String[][] respuestaD) {

        //Creamos un número random para que no nos salga siempre la misma pregunta en cada nivel en cada partida
        int rnd = (int) (0 + Math.random() * 5);

        // Inicializamos bucle con el que vamos a mostrar las preguntas y respuestas de cada nivel
        for (int i = 0; i < QuienQuiereSerMillonario.niveles; i++) {
            for (int j = 0; j < 1; j++) {
                // Mostramos las preguntas y respuestas aleatorias de cada nivel
                System.out.println((i + 1) + ". " + preguntas[i][rnd]);
                System.out.println(respuestaA[i][rnd] + "\t" + respuestaB[i][rnd]
                        + "\n" + respuestaC[i][rnd] + "\t" + respuestaD[i][rnd] + "\n");
            }

            // Comprobamos si ha usado el comodín, si no, le preguntamos si lo quiere usar y lo usamos o no según respuesta
            if (comodin == false) {
                Comodín.usarComodin(comodin, i, rnd);
            }

            // Le pedimos la respuesta a la pregunta del nivel correspondiente
            System.out.print("Respuesta: ");
            boolean repuesta = comprobarRespuesta(i, rnd); //Comprobamos si la respuesta es la correcta

            //Si es correcta y no estamos en el último nivel mostramos:
            if (repuesta == true && i != 11) {
                System.out.println("\n¡¡Respuesta correcta!!");
                System.out.print("Dinero acumulado: ");
                Dinero.dineroGanado(i + 1);
            }
            // Si es correcta y estamos en el último nivel mostramos:
            else if (repuesta == true && i == 11) {
                Dinero.dineroGanado(i + 1);
            } 
            // Si no es correcta mostramos:
            else {
                System.out.println("\nRespuesta incorrecta :(");
                System.out.print("Dinero final: ");
                Dinero.dineroSeguro(i + 1);
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

    // Comprobamos si la respuesta es correcta
    public static boolean comprobarRespuesta(int nivel, int numPregunta) {

        String respCorrecta = correcta[nivel][numPregunta];

        // Comparamos su respuesta con la respuesta correcta de esa pregunta
        if (pedirRespuesta().equalsIgnoreCase(respCorrecta)) {
            return true;
        } 
        else {
            return false;
        }
    }

    // Generamos el banco de preguntas y respuestas de cada nivel
    public static void generarBancoPreguntas(String[][] pregunta) {

        //Nivel 1
        preguntas[0][0] = "¿Cuál es la capital de Portugal?";
        preguntas[0][1] = "¿Cuál es el símbolo químico de la plata?";
        preguntas[0][2] = "¿El director de cine Frank Capra, famoso por ‘It's a Wonderful Life’, nació ¿en qué país mediterráneo?";
        preguntas[0][3] = "¿Cuál es el nombre de la banda con los siguientes miembros: John Deacon, Brian May, Freddie Mercury, Roger Taylor?";
        preguntas[0][4] = "¿En que país se encuentra situada la Estatua de la Libertad?";

        respuestaA[0][0] = "a. Lisboa";
        respuestaA[0][1] = "a. Pl";
        respuestaA[0][2] = "a. Italia";
        respuestaA[0][3] = "a. Queen";
        respuestaA[0][4] = "a. Estados Unidos";

        respuestaB[0][0] = "b. Dublín";
        respuestaB[0][1] = "b. Ag";
        respuestaB[0][2] = "b. España";
        respuestaB[0][3] = "b. The Beatles";
        respuestaB[0][4] = "b. Inglaterra";

        respuestaC[0][0] = "c. Madrid";
        respuestaC[0][1] = "c. P";
        respuestaC[0][2] = "c. Francia";
        respuestaC[0][3] = "c. The Rolling Stones";
        respuestaC[0][4] = "c. Canadá";

        respuestaD[0][0] = "d. París";
        respuestaD[0][1] = "d. Al";
        respuestaD[0][2] = "d. Chipre";
        respuestaD[0][3] = "d. AC/DC";
        respuestaD[0][4] = "d. Francia";

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

        respuestaA[1][0] = "a. 1492";
        respuestaA[1][1] = "a. Prince";
        respuestaA[1][2] = "a. Anfibios";
        respuestaA[1][3] = "a. 12";
        respuestaA[1][4] = "a. Tom Hanks";

        respuestaB[1][0] = "b. 1592";
        respuestaB[1][1] = "b. Elvis Presley";
        respuestaB[1][2] = "b. Mamíferos";
        respuestaB[1][3] = "b. 24";
        respuestaB[1][4] = "b. Tom Holland";

        respuestaC[1][0] = "c. 1942";
        respuestaC[1][1] = "c. Michael Jackson";
        respuestaC[1][2] = "c. Reptíles";
        respuestaC[1][3] = "c. 36";
        respuestaC[1][4] = "c. Tom Ellis";

        respuestaD[1][0] = "d. 1490";
        respuestaD[1][1] = "d. Freddie Mercury";
        respuestaD[1][2] = "d. Peces";
        respuestaD[1][3] = "d. 48";
        respuestaD[1][4] = "d. Tom Cruise";

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

        respuestaA[2][0] = "a. Bruno Mars";
        respuestaA[2][1] = "a. Vivien Leigh";
        respuestaA[2][2] = "a. Francia";
        respuestaA[2][3] = "a. Un arroz con bacalao";
        respuestaA[2][4] = "a. My love";

        respuestaB[2][0] = "b. Jason Derulo";
        respuestaB[2][1] = "b. Julie Andrews";
        respuestaB[2][2] = "b. Italia";
        respuestaB[2][3] = "b. Unos churros";
        respuestaB[2][4] = "b. My son";

        respuestaC[2][0] = "c. Justin Bieber";
        respuestaC[2][1] = "c. Julia Roberts";
        respuestaC[2][2] = "c. España";
        respuestaC[2][3] = "c. Las uñas";
        respuestaC[2][4] = "c. My friend";

        respuestaD[2][0] = "d. Drake";
        respuestaD[2][1] = "d. Judy Garland";
        respuestaD[2][2] = "d. Alemania";
        respuestaD[2][3] = "d. La cabeza";
        respuestaD[2][4] = "d. My boss";

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

        respuestaA[3][0] = "a. Tres";
        respuestaA[3][1] = "a. José Maria Ruiz-Mateos";
        respuestaA[3][2] = "a. Pablo Puyol";
        respuestaA[3][3] = "a. 1918";
        respuestaA[3][4] = "a. Está en varios sitios a la vez";

        respuestaB[3][0] = "b. Dos";
        respuestaB[3][1] = "b. Jesús Gil";
        respuestaB[3][2] = "b. Beatriz Luengo";
        respuestaB[3][3] = "b. 1920";
        respuestaB[3][4] = "b. Cada vez es más joven";

        respuestaC[3][0] = "c. Cuatro";
        respuestaC[3][1] = "c. Hugo Chávez";
        respuestaC[3][2] = "c. Mónica Cruz";
        respuestaC[3][3] = "c. 1915";
        respuestaC[3][4] = "c. Conoce su propio futuro";

        respuestaD[3][0] = "d. Uno";
        respuestaD[3][1] = "d. Antonio Tejero";
        respuestaD[3][2] = "d. Dafne Fernández";
        respuestaD[3][3] = "d. 1917";
        respuestaD[3][4] = "d. Un cuadro guarda su vejez";

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

        respuestaA[4][0] = "a. Una cuchara de madera";
        respuestaA[4][1] = "a. Jiu Jitsu";
        respuestaA[4][2] = "a. Suizo";
        respuestaA[4][3] = "a. Bellota";
        respuestaA[4][4] = "a. Oxitocina";

        respuestaB[4][0] = "b. Una medalla de madera";
        respuestaB[4][1] = "b. Karate";
        respuestaB[4][2] = "b. Francés";
        respuestaB[4][3] = "b. Dátil";
        respuestaB[4][4] = "b. Cortisol";

        respuestaC[4][0] = "c. La copa de perdedores";
        respuestaC[4][1] = "c. Taekwondo";
        respuestaC[4][2] = "c. Canadiense";
        respuestaC[4][3] = "c. Sámara";
        respuestaC[4][4] = "c. Serotonina";

        respuestaD[4][0] = "d. Una urna con cenizas";
        respuestaD[4][1] = "d. Judo";
        respuestaD[4][2] = "d. Belga";
        respuestaD[4][3] = "d. Nuez";
        respuestaD[4][4] = "d. Vallado";

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

        respuestaA[5][0] = "a. Francés";
        respuestaA[5][1] = "a. Ninguno";
        respuestaA[5][2] = "a. Malibú";
        respuestaA[5][3] = "a. Renacentista";
        respuestaA[5][4] = "a. El pingüino";

        respuestaB[5][0] = "b. Catalán";
        respuestaB[5][1] = "b. Tres";
        respuestaB[5][2] = "b. Sacramento";
        respuestaB[5][3] = "b. Barroco";
        respuestaB[5][4] = "b. El delfín";

        respuestaC[5][0] = "c. Inglés";
        respuestaC[5][1] = "c. Uno";
        respuestaC[5][2] = "c. Denver";
        respuestaC[5][3] = "c. Clásico";
        respuestaC[5][4] = "c. La serpiente";

        respuestaD[5][0] = "d. Gallego";
        respuestaD[5][1] = "d. Dos";
        respuestaD[5][2] = "d. San Francisco";
        respuestaD[5][3] = "d. Romántico";
        respuestaD[5][4] = "d. La orca";

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

        respuestaA[6][0] = "a. Suizo";
        respuestaA[6][1] = "a. Las arrugas";
        respuestaA[6][2] = "a. Felipe III";
        respuestaA[6][3] = "a. Pérdida de orina";
        respuestaA[6][4] = "a. De un ataque al corazón";

        respuestaB[6][0] = "b. Francés";
        respuestaB[6][1] = "b. Las manchas solares";
        respuestaB[6][2] = "b. Carlos II";
        respuestaB[6][3] = "b. Pérdida del olfato";
        respuestaB[6][4] = "b. De insuficiencia renal aguda";

        respuestaC[6][0] = "c. Belga";
        respuestaC[6][1] = "c. Los problemas emocionales";
        respuestaC[6][2] = "c. Fernando VII";
        respuestaC[6][3] = "c. Pérdida del apetito";
        respuestaC[6][4] = "c. De un cáncer estomacal";

        respuestaD[6][0] = "d. Italiano";
        respuestaD[6][1] = "d. Las ojeras";
        respuestaD[6][2] = "d. Alfonso XIII";
        respuestaD[6][3] = "d. Pérdida de la libido";
        respuestaD[6][4] = "d. De tuberculosis";

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

        respuestaA[7][0] = "a. Madonna";
        respuestaA[7][1] = "a. El guerrero";
        respuestaA[7][2] = "a. Alfonso XII";
        respuestaA[7][3] = "a. Isaac Newton";
        respuestaA[7][4] = "a. La tormenta perfecta";

        respuestaB[7][0] = "b. Dua Lipa";
        respuestaB[7][1] = "b. El niño";
        respuestaB[7][2] = "b. Alfonso XIII";
        respuestaB[7][3] = "b. Albert Einstein";
        respuestaB[7][4] = "b. Capitán América";

        respuestaC[7][0] = "c. Adele";
        respuestaC[7][1] = "c. La bailarina";
        respuestaC[7][2] = "c. Juan Carlos I";
        respuestaC[7][3] = "c. Niels Bohr";
        respuestaC[7][4] = "c. El club de los poetas muertos";

        respuestaD[7][0] = "d. Marilyn Manson";
        respuestaD[7][1] = "d. La abuela";
        respuestaD[7][2] = "d. Carlos III";
        respuestaD[7][3] = "d. Enrico Fermi";
        respuestaD[7][4] = "d. Titanic";

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

        respuestaA[8][0] = "a. Corea del Norte";
        respuestaA[8][1] = "a. El alternador";
        respuestaA[8][2] = "a. Garbiñe Muguruza";
        respuestaA[8][3] = "a. El club de la lucha";
        respuestaA[8][4] = "a. En el gato mascota de Antoine Lavoisier";

        respuestaB[8][0] = "b. Corea del Sur";
        respuestaB[8][1] = "b. El cárter";
        respuestaB[8][2] = "b. María Sharápova";
        respuestaB[8][3] = "b. Perdida";
        respuestaB[8][4] = "b. En una aldea minera sueca";

        respuestaC[8][0] = "c. Japón";
        respuestaC[8][1] = "c. El cigüeñal";
        respuestaC[8][2] = "c. Serena Williams";
        respuestaC[8][3] = "c. Seven";
        respuestaC[8][4] = "c. En la luna de Neptuno";

        respuestaD[8][0] = "d. China";
        respuestaD[8][1] = "d. La culata";
        respuestaD[8][2] = "d. Petra Kvitová";
        respuestaD[8][3] = "d. El indomable Will Hunting";
        respuestaD[8][4] = "d. En el nombre de soltera de Marie Curie";

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

        respuestaA[9][0] = "a. Fútbol";
        respuestaA[9][1] = "a. Claude Monet";
        respuestaA[9][2] = "a. Adagio";
        respuestaA[9][3] = "a. Paul Cézanne";
        respuestaA[9][4] = "a. Madrid";

        respuestaB[9][0] = "b. Baloncesto";
        respuestaB[9][1] = "b. Vincent van Gogh";
        respuestaB[9][2] = "b. Arabesque";
        respuestaB[9][3] = "b. Paul Gauguin";
        respuestaB[9][4] = "b. Dresden";

        respuestaC[9][0] = "c. Balonmano";
        respuestaC[9][1] = "c. Pablo Picasso";
        respuestaC[9][2] = "c. Ballonné Pas";
        respuestaC[9][3] = "c. Edgar Degas";
        respuestaC[9][4] = "c. París";

        respuestaD[9][0] = "d. Tenis";
        respuestaD[9][1] = "d. Salvador Dalí";
        respuestaD[9][2] = "d. Battu";
        respuestaD[9][3] = "d. Claude Monet";
        respuestaD[9][4] = "d. Roma";

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

        respuestaA[10][0] = "a. Indo";
        respuestaA[10][1] = "a. Hockey sobre hielo";
        respuestaA[10][2] = "a. Prosecco";
        respuestaA[10][3] = "a. Cocodrilo Dundee";
        respuestaA[10][4] = "a. Adolf Hitler";

        respuestaB[10][0] = "b. Ganges";
        respuestaB[10][1] = "b. Balonmano";
        respuestaB[10][2] = "b. Vinho verde";
        respuestaB[10][3] = "b. Entre pillos anda el juego";
        respuestaB[10][4] = "b. Ayatolá Jomeiní";

        respuestaC[10][0] = "c. Yamuna";
        respuestaC[10][1] = "c. Voleyball";
        respuestaC[10][2] = "c. Chianti";
        respuestaC[10][3] = "c. Arma letal";
        respuestaC[10][4] = "c. Joseph Stalin";

        respuestaD[10][0] = "d. Meghna";
        respuestaD[10][1] = "d. Baloncesto";
        respuestaD[10][2] = "d. Chardonnay";
        respuestaD[10][3] = "d. Regreso al futuro";
        respuestaD[10][4] = "d. Mao Zedong";

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

        respuestaA[11][0] = "a. 10";
        respuestaA[11][1] = "a. 8";
        respuestaA[11][2] = "a. Cinco";
        respuestaA[11][3] = "a. Francisco I";
        respuestaA[11][4] = "a. Vladimir Titov";

        respuestaB[11][0] = "b. 12";
        respuestaB[11][1] = "b. 16";
        respuestaB[11][2] = "b. Diez";
        respuestaB[11][3] = "b. Enrique IV";
        respuestaB[11][4] = "b. Michael Collins";

        respuestaC[11][0] = "c. 11";
        respuestaC[11][1] = "c. 32";
        respuestaC[11][2] = "c. Quince";
        respuestaC[11][3] = "c. Carlos III";
        respuestaC[11][4] = "c. Yuri Gagarin";

        respuestaD[11][0] = "d. 13";
        respuestaD[11][1] = "d. 64";
        respuestaD[11][2] = "d. Veinte";
        respuestaD[11][3] = "d. Luis XII";
        respuestaD[11][4] = "d. Gus Grissom";

        correcta[11][0] = "b";
        correcta[11][1] = "c";
        correcta[11][2] = "d";
        correcta[11][3] = "a";
        correcta[11][4] = "d";
    }
}
