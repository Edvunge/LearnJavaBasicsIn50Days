package day26_30.exercises;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*
        81. Crie um algoritmo para ler uma letra do alfabeto e mostrar uma mensagem:
        se é vogal ou consoante.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("inidique uma letra do alfabeto.");
        String letraDoAlfabeto = input.next();

        switch (letraDoAlfabeto.toUpperCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("vogal");
            case "b": case "c": case "d": case "f":
            case "g": case "h": case "j": case "k":
            case "l": case "m": case "n": case "p":
            case "q": case "r": case "s": case "v":
            case "y": case "w": case "x": case "z":
                System.out.println("consoante");
            default:
                System.out.println("caractere invalido.");
        }

        input.close();
    }
}
