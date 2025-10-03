import java.util.Scanner;

public class La_Calcu {
    static void main() {
        int n = introduceANum();


    }

    /// PEDIMOS UN NUMERO
    public static int askForANum() {
        System.out.println("Escribe un numero porfavó: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


    public static boolean checkNumber(int number) {
        return number > 10 && number < 99;
    }

    /// CONDICIONALES :D
    public static int introduceANum() {
        int n = askForANum();

        while (!checkNumber(n)) {
            System.err.println("El numero esta mal");
            n = askForANum();
        }
        return n;
    }
}
