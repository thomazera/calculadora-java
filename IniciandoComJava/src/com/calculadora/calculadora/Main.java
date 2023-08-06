package com.calculadora.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); //input numeros digitados
        System.out.println("Bem-vindo a minha primeira calculadora, vamos testa-lá");

        System.out.println("Digite o primeiro número");
        Double numero1 = reader.nextDouble();
        System.out.println("Digite o segundo número");
        Double numero2 = reader.nextDouble();

        System.out.printf("Selecione qual metodo matematico voce prefere:\n 1. Soma \n 2. Subtração \n 3. Multiplicação \n 4. Divisão \n");
        Integer numero3 = reader.nextInt();

        if (numero3 == 1) {
            System.out.println("A soma dos numeros é: " + sum(numero1,numero2));
        } else if (numero3 == 2) {
            System.out.println("A subtração dos numeros é: " + sub(numero1,numero2));
        } else if (numero3 == 3) {
            System.out.println("A multiplicação dos numeros é: " + mult(numero1, numero2));
        } else if (numero3 == 4) {
            System.out.println("A divisão dos numeros é: " + div(numero1, numero2));
        }

        System.out.println("Obrigado por usar a calculadora");


    }


    public static Double sum (Double num1, Double num2) {
        return num1 + num2;
    }

    public static Double sub (Double num1, Double num2) {
        return num1 - num2;
    }

    public static Double mult (Double num1, Double num2) {
        return num1 * num2;
    }

    public static Double div (Double num1, Double num2) {
        return num1 / num2;
    }






}
