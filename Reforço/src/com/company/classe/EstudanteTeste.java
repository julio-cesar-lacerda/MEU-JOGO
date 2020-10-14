package com.company.classe;
public class EstudanteTeste {

    public static void main(String[] args) {
        Estudante julio = new Estudante();
        julio.nome = "julio";
        julio.sala = "Tads19";
        julio.idade = 20;

        System.out.println("Nome do estudante: "+julio.nome);
        System.out.println("Sala: "+julio.sala);
        System.out.println("Idade: "+julio.idade);
    }
}
