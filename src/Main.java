/*
Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone
il messaggio.
 */
public class Main {
    public static void main(String[] args) {
        try {
            division(6, 0);
        }catch (ArithmeticException e){
            System.out.println(e + " il programma non può eseguire divisioni per 0");
        }
    }

    public static void division(int num1, int num2){
        System.out.println(num1 / num2);
    }
}

