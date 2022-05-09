package day26_30.exercises;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*
        79. Faça um algoritmo que leia a primeira letra do estado civil de uma pessoa e
        mostre uma mensagem com a sua descrição (Solteiro, Casado, Viúvo,
        Divorciado, Desquitado). Mostre uma mensagem de erro, se necessário.
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Solteiro - Casado - Viuvo - Divorciado ");
        String estadoCivil = entrada.next();

        switch ( estadoCivil.toUpperCase() ){
            case "S":
                System.out.println("Solteiro");
                break;
            case "C":
                System.out.println("Casado");
                break;
            case "V":
                System.out.println("Viuvo");
                break;
            case "D":
                System.out.println("Divorciado");
                break;
            default:
                System.out.println("indique um outro.");
        }
        entrada.close();
    }
}