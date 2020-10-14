package com.company.aula;

public class Matriz {
    public static void main(String[] args) {
        String [][] nome = new  String[2][2];

        nome[0][0] = "julio";
        nome[0][1] = "cesar";
        nome[1][0] = "jully";
        nome[1][1] = "maria";

        for (int i = 0; i < nome.length; i++) {
            for (int j = 0; j < nome.length; j++) {
                System.out.println(i+" e "+ j +" = "+nome[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
