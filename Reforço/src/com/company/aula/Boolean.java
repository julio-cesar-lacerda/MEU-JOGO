package com.company.aula;

public class Boolean {
    public static void main(String[] args) {

        boolean dezMaioqueVinte = 10 < 20;
        System.out.println(dezMaioqueVinte);
        int idade = 16;
        float salario = 1500;
        System.out.println(idade > 16 || salario > 1500);

        //forma de reduz linha de codigo

        String resultado;//Resultado vai ser uma valor caracter vai aparece uma mensagem na tela com comando booleno

        //                                               SIM          Não
        resultado = idade <= 16 || salario <= 1500 ? "Nao e maio" : "E maio";
        System.out.println(resultado);
    }
}
