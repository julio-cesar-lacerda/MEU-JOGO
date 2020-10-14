package com.company.aula;
//O que são tipos de dados primitivos?
//Nos algoritmos criados para realizar tarefas na computação utilizamos variáveis para manipular dados,
// por exemplo: nome, idade, altura, peso, data de nascimento, sexo, saldo, etc.
// Para otimizar a utilização da memória, cada variável armazena apenas um tipo de dados.
// QUAIS SÃO OS TIPOS DE DADOS PRIMITIVOS?
//Em computação existem apenas 4 tipos de dados primitivos, algumas linguagens subdividem esses tipos de dados em outros
// de acordo com a capacidade de memória necessária para a variável.
// Mas de modo geral, os tipos de dados primitivos são:INTEIRO,REAL,LÓGICO,TEXTO.
//
//INTEIRO: Representa valores numéricos negativo ou positivo sem casa decimal, ou seja, valores inteiros.
//REAL: Representa valores numéricos negativo ou positivo com casa decimal, ou seja, valores reais. Também são chamados de ponto flutuante.
//LÓGICO: Representa valores booleanos, assumindo apenas dois estados, VERDADEIRO ou FALSO. Pode ser representado apenas um bit (que aceita apenas 1 ou 0).
//TEXTO: Representa uma sequencia de um ou mais de caracteres, colocamos os valores do tipo TEXTO entre " " (aspas duplas).
//Algumas linguagens de programação, dividem esses tipos primitivos de acordo com o espaço necessário para os valores
//daquela variável.
// Na linguagem Java por exemplo, o tipo de dados inteiro é dividido em 4 tipos primitivos:
// byte, short, int e long. A capacidade de armazenamento de cada um deles é diferente.
//
//byte: é capaz de armazenar valores entre -128 até 127.
//short: é capaz de armazenar valores entre – 32768 até 32767.
//int: é capaz de armazenar valores entre –2147483648 até 2147483647.
//long: é capaz de armazenar valores entre –9223372036854775808 até 9223372036854775807.
//Mas essa divisão é uma particularidade da linguagem de programação que está sendo utilizada.
// O objetivo é otimizar a utilização da memória.
// Em algumas linguagens de programação não é necessário especificar o tipo de dados da variável, eles são identificados
// dinamicamente. Porém, é necessário informar o tipo de dados de cada variável em algoritmos.

public class TipoPrimitivo {

    public static void main(String[] args) {
        int a = 41;//A e uma variavel do tipo interio;
        char b = 's';//A e uma variavel do tipo TEXTO;
        String c = "julio";//c e uma variavel do tipo TEXTO
        double d = 5.6;//d e uma variavel do tipo REAL
        float e = 5;//d e uma variavel do tipo REAL
        boolean f = false;//LÓGICO: Representa valores booleanos
        boolean g = true;//LÓGICO: Representa valores booleanos
        long h = 100L;//numero grande
        short i = 12121;//é capaz de armazenar real

        //System.out.print("a = "+a);//nao pula linha
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("d = "+e);
        System.out.println("f = "+f);
        System.out.println("g = "+g);
        System.out.println("f = "+h);
        System.out.println("g = "+i);

    }
}