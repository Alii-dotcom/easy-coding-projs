package org.example.easycodingprojs;
import java.util.Scanner; // mi permette di interagire con l'utente

public class Calcolatrice {
    // creando una calcolatrice 4 operazioni
    // 4 casi : + - * /

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserire primo numero: ");
        double num1 = input.nextDouble();

        // L'operatore
        char operatore;
        while (true) {
            System.out.println("Inserire operatore (+, -, * o /)");
            String opIn = input.next(); // l'operatore inserirà una stringa

            if (opIn.length() != 1 || "+-*/".indexOf(opIn.charAt(0)) == -1) {
                System.out.println("Non è un operatore valido");
                continue;
            } else {
                operatore = opIn.charAt(0);
                break;
            }

        }

        System.out.println("Inserire secondo numero: ");
        double num2 = input.nextDouble();

        // tocca fare la vera operazione
        boolean error = false;
        double ris = 0;

        // if, else if e else

        switch (operatore) {
            case '+':
                ris = num1 + num2;
                break;
            case '-':
                ris = num1 - num2;
                break;
            case '*':
                ris = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Non puoi dividere un numero per 0");
                    error = true;
                } else {
                    ris = num1 / num2;
                }
                break;
        }

        if (!error) {
            System.out.println("Risultato = " + ris);
        }

        input.close();
    }
}
