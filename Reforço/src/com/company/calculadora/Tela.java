package com.company.calculadora;

import java.util.Scanner;

public class Tela{

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Numero dado = new Numero();
        System.out.println("Informe dois numero:");
        dado.numero[0] = leia.nextInt();
        dado.numero[1] = leia.nextInt();

        System.out.println("Primeiro numero: = "+dado.numero[0]);
        System.out.println("Segundo numero: = "+dado.numero[1]);

        for(int i = 0;i < dado.numero.length;i++){
            System.out.println(i);
        }
    }
}
