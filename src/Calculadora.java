import java.util.Scanner;

public class Calculadora {
    public static final int VALOR_MAXIMO = 99;

    public static final int VALOR_MINIMO = 10;
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 9;
    private static int numeroObjetivo;
    private static int numeroJugador;
    private static int numeroAnterior;

    /// ︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵
    /// ︵‿︵‿︵‿︵‿︵‿︵‿︵ M A I N ︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵
    public static void main(String[] args) {
        ///  I N I C I O

        boolean seguirJugando = true;

        while (seguirJugando) {

            int turnoActual = 0;
            int total = 0;

            /// ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ I N S T R U C I O N E S ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
            System.out.println("তততততততততততততততততততততততততততততততততততততততত");
            System.out.println("Bienvenidos al juego de: " +
                    "\n" +
                    "\nP A S A   L A   C A L C U L A D O R A " +
                    "\n" +
                    "\n          ᕙ_(•̀ ᗜ •́)_ᕗ " +
                    "\n" +
                    "\n" +
                    "\nতততততততততততততততততততততততততততততততততততততততত " +
                    "\n ░░░░░░░░░░░░ REGLAS DEL JUEGO ░░░░░░░░░░░░" +
                    "\n" +
                    "\n ☛ Un jugador establecerá el objetivo del juego, " +
                    "\n" +
                    "\n ☛ Una vez establecido el objetivo, los jugadores iran introduciendo " +
                    "\n y sumando numeros del 1 al 9" +
                    "\n" +
                    "\n ☛ El número introducido será válido cuando esté en la misma fila y columna que el anterior \n y sea diferente a éste.\n" +
                    "\n ☛ Gana el jugador que mas se acerque al numero objetivo sin pasarse o igualarlo" +
                    "\n " +
                    "\nতততততততততততততততততততততততততততততততততততততততত " +
                    "\n" +
                    "\n ░░░ QUE LA SUERTE TE ACOMPAÑE ░░░" +
                    "\n" +
                    "\n              ⚔\uFE0F⚔\uFE0F " +
                    "\n");


            System.out.println("তততততততততততততততততততততততততততততততততততততততত");

            /// ░░░░░I N T R O D U C E   N U M   O B J E T I V O ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░

            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" +
                    "\n Bueno, ya entenderías de que va el tema," +
                    "\n " +
                    "\n con que..." +
                    "\n" +
                    "\n introduce el numero objetivo, entre el 10 y el 99");
            numeroObjetivo = pedirNumeroObjetivo();

            /// IMPRIMIR TURNO
            turnoActual = siguienteTurno(turnoActual);

            System.out.println("------------- turno" + " " + turnoActual + " " + "---------------");

            /// IMPRIMIR NUM OBJ
            System.out.println("\n" +
                    "\n ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠\n       COMIENZA LA BATALLA! \n⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ " +
                    "\n" +
                    "\n" +
                    "\n " +
                    "\n ꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏ " +
                    "\n  El objetivo del juego es el número:" + "\n " + "  " + numeroObjetivo +
                    "\n ꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏꘏");

            /// C O M I E N Z A    L A    P A R T I D A
            System.out.println("\n\n Jugador nº1 introduce un número del 1 al 9");

            /// PEDIR NUM
            numeroJugador = pedirNumeroJugadorEnRango(MIN_RANGE, MAX_RANGE);
            total = total + numeroJugador;
            numeroAnterior = numeroJugador;

            turnoActual = siguienteTurno(turnoActual);
            System.out.println("------------- turno" + " " + turnoActual + " " + "---------------");

            ///░░░░░░░░░░░░░░░░░░░ H A S T A   C U A N D O    C O N T I N U A   E L   J U E G O ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
            while (!esGameOver(total, numeroObjetivo)) {
                System.out.println("Jugador" + " " + turnoJugador(turnoActual) + " " + " introduce un número del 1 al 9");
                numeroJugador = obtenerNValido();
                System.out.println("Número escogido:" + numeroJugador);
                total = numeroJugador + total;
                numeroAnterior = numeroJugador;

                System.out.println("El total es:" + " " + total);
                turnoActual = siguienteTurno(turnoActual);
                System.out.println("------------- turno" + " " + turnoActual + " " + "---------------");
                System.out.println("El objetivo es:" + " " + numeroObjetivo);
            }
            System.out.println("Jugador" + " " + turnoJugador(turnoActual - 1) + " " + "has perdido.");

            //acabamos la partida y le preguntamos al usuario si quiere jugar otra
            System.out.println("︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿ \n ░░░░░░░░GAME░OVER░░░░░░░░\n︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿︵‿  \nEsto se va a acabar así... \n \n O era una pequeña batalla de una Gran guerra? \n \n Otra más? \n si/no");
            Scanner sc = new Scanner(System.in);
            String respuesta = sc.next();

            while (true) {

                if (respuesta.equals("si")) {
                    seguirJugando = true;
                    break;
                }


                if (respuesta.equals("no")) {
                    seguirJugando = false;
                    break;


                } else {
                    System.err.println("Dime si si o si no ( ¬.¬)' ");
                    respuesta = sc.next();
                }
            }


        }

        System.out.println("                          ♪¸¸.•*¨*•.♪¸¸.•*¨*•.♪¸¸.•*¨*•. \n Gracias a quien triunfó por jugar a este juegazo," +
                "\n♪¸¸.•*¨*•.♪¸¸.•*¨*•." + " \n\n\n                 ┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈ \n  y a ti pues bueno... gracias por el intento supongo  \n-ˋˏ✄┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈\n\n\n");


    }


    /// NEXT TURN 2 jugadores********************************

    private static String turnoJugador(int turnoActual) {

        if (turnoActual % 2 == 0) {
            return "2";
        } else {
            return "1";
        }
    }


    private static boolean esGameOver(int total, int numeroObjetivo) {
        return total >= numeroObjetivo;
    }

    /// NUMERO VÁLIDO
    private static int obtenerNValido() {
        int numeroJugador = -1;
        boolean valido = false;
        while (!valido) {
            numeroJugador = pedirNumeroJugadorEnRango(MIN_RANGE, MAX_RANGE);
            valido = comprobarNumeroJugador(numeroJugador, numeroAnterior);
            if (!valido) {
                System.out.println(" ( ¬.¬)' un número de su misma fila o columna");
            }
        }
        return numeroJugador;
    }

    /// SIGUIENTE TURNO
    private static int siguienteTurno(int turnoactual) {
        turnoactual++;
        return turnoactual;
    }

    /// CHECK TURNO ==num
    private static boolean comprobarNumeroJugador(int numeroJugador, int numeroAnterior) {


        if (numeroJugador == 1) {
            if (numeroAnterior == 4 || numeroAnterior == 7 || numeroAnterior == 2 || numeroAnterior == 3) {

                return true;
            }
        }
        if (numeroJugador == 2) {
            if (numeroAnterior == 1 || numeroAnterior == 3 || numeroAnterior == 5 || numeroAnterior == 8) {
                return true;
            }
        }
        if (numeroJugador == 3) {
            if (numeroAnterior == 1 || numeroAnterior == 2 || numeroAnterior == 6 || numeroAnterior == 9) {
                return true;
            }
        }
        if (numeroJugador == 4) {
            if (numeroAnterior == 1 || numeroAnterior == 5 || numeroAnterior == 6 || numeroAnterior == 7) {
                return true;
            }
        }
        if (numeroJugador == 5) {
            if (numeroAnterior == 2 || numeroAnterior == 4 || numeroAnterior == 6 || numeroAnterior == 8) {
                return true;
            }
        }
        if (numeroJugador == 6) {
            if (numeroAnterior == 4 || numeroAnterior == 5 || numeroAnterior == 3 || numeroAnterior == 9) {
                return true;
            }
        }
        if (numeroJugador == 7) {
            if (numeroAnterior == 1 || numeroAnterior == 4 || numeroAnterior == 8 || numeroAnterior == 9) {
                return true;
            }
        }
        if (numeroJugador == 8) {
            if (numeroAnterior == 2 || numeroAnterior == 5 || numeroAnterior == 7 || numeroAnterior == 9) {
                return true;
            }
        }
        if (numeroJugador == 9) {
            return numeroAnterior == 3 || numeroAnterior == 6 || numeroAnterior == 7 || numeroAnterior == 8;

        }
        return false;

    }

    /// CHECK NUM 1-9
    /**
     * En esta función se recoge el siguiente número entero y luego comprueba si este está entre el numero 1 y 9.
     *
     * @return numeroJugador
     * .
     */
    private static int pedirNumeroJugadorEnRango(int rangoInferior, int rangoSuperior) {
        Scanner sc = new Scanner(System.in);
        numeroJugador = sc.nextInt();

        while (numeroJugador < rangoInferior || numeroJugador > rangoSuperior) {
            System.out.println(" Desafiando las reglas ehh? \n no me pongas a prueba (¬.¬) \n un numero válido entre 1 y 9\"");
            numeroJugador = sc.nextInt();


        }
        while (numeroJugador != numeroJugador) {
            numeroJugador = sc.nextInt();
        }

        return numeroJugador;

    }

    /**
     * CHECK NUM -1  || 10-99
     * En esta función se recoge el siguiente número entero. Si es -1, genera un numero random entre 10 y 99, y mientras esté fuera de ese rango devuelve un error.
     *
     * @return Numero objetivo o numero final del juego
     */
    public static int pedirNumeroObjetivo() {
        Scanner sc = new Scanner(System.in);
        numeroObjetivo = sc.nextInt();

        if (numeroObjetivo == -1) {
            numeroObjetivo = (int) (Math.random() * (VALOR_MAXIMO - VALOR_MINIMO + 1)) + VALOR_MINIMO;

        }

        while (numeroObjetivo < VALOR_MINIMO || numeroObjetivo > VALOR_MAXIMO) {
            System.out.println("\n ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ \n \n    NUMERO ERRONEO ⋆ (ꐦ ◣‸◢) \n\n ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠ ⚠");
            numeroObjetivo = sc.nextInt();
        }

        return numeroObjetivo;
    }

}