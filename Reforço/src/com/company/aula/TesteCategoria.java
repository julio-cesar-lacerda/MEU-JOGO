package com.company.aula;

public class TesteCategoria {
    public static void main(String[] args) {
        int idade = 18;
        String categoria;
        System.out.println("Teste categoria");

        if(idade <= 16){
            categoria = "Infantil";
        }else if(idade < 18){
            categoria = "juvenil";
        }else {
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}