package com.company.aula;

public class Dado2 {
    public static void main(String[] args) {
        String nome,endereco,telefone,sexo,estado_civil;
        double salario;
        int idade;

        nome = "Julio Cesar Lacerda Da Silva Junior";
        endereco = "Rua da Maria";
        telefone = "(41) 9166-8712";
        sexo = "Masculino";
        estado_civil = "Solteiro";
        salario = 1500.00;
        idade = 20;

        System.out.println("Trabalhador "+nome+"\n do sexo "+sexo+"\nidade "+idade+"\nestado civil "+ estado_civil+ "\nencontra-se empregado neste estabelecimento.");
        System.out.println("salario = "+salario);
    }
}