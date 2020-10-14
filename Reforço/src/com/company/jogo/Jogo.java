package com.company.jogo;
import java.util.Scanner;
public class Jogo {
    public static void main(String[] args) {
        String [][] tela = new String[3][3];
        String [] nome = new String[2];
        Scanner leia = new Scanner(System.in);
        //for(int i = 0;i < 2;i++){
        //    System.out.println("informe seu nome jogador "+i+":");
          //  nome[i] = leia;
        //}

        int partida = 1;
        int vez = 1;
        int cont = 1;
        tela[0][0] = "1";
        tela[0][1] = "2";
        tela[0][2] = "3";
        tela[1][0] = "4";
        tela[1][1] = "5";
        tela[1][2] = "6";
        tela[2][0] = "7";
        tela[2][1] = "8";
        tela[2][2] = "9";

        do{

            if(vez > 2){
                vez = 1;
            }

            for(int i = 0;i < 3;i++){
                for(int j = 0;j < 3;j++){
                    System.out.print("|"+tela[i][j]);
                    System.out.print("|");
                }
                System.out.print("\n");
            }

            System.out.println("Escolha um numero:");
            int numero;

            numero = leia.nextInt();

            if(numero > 9 ||  numero < 1){
                System.out.println("Numero invalido");
            }else{

                if(numero == 1){

                    if(tela[0][0] == "X" || tela[0][0] == "O") {

                    }else{
                        if(vez == 1){
                            tela[0][0] = "X";
                        }else{
                            tela[0][0] = "0";
                        }

                        vez = vez + 1;
                        cont = cont + 1;
                    }
                }else if(numero == 2) {

                    if (tela[0][1] == "X" || tela[0][1] == "O") {

                    } else {
                        if (vez == 1) {
                            tela[0][1] = "X";
                        } else {
                            tela[0][1] = "O";
                        }

                        vez = vez + 1;
                        cont = cont + 1;
                    }
                }else if(numero == 3) {

                    if (tela[0][2] == "X" || tela[0][2] == "O") {

                    } else {
                        if (vez == 1) {
                            tela[0][2] = "X";
                        }else{
                            tela[0][2] = "O";
                        }

                        vez = vez + 1;
                        cont = cont + 1;
                    }
                }else if(numero == 4){

                    if(tela[1][0] == "X" || tela[1][0] == "O"){

                    }else{
                        if(vez == 1){
                            tela[1][0] = "X";
                        }else{
                            tela[1][0] = "O";
                        }

                        vez = vez + 1;
                        cont = cont + 1;
                    }
                }else if(numero == 5){

                    if(tela[1][1] == "X" || tela[1][1] == "O"){

                    }else{
                        if(vez == 1){
                            tela[1][1] = "X";
                        }else{
                            tela[1][1] = "O";
                        }

                        vez = vez + 1;
                        cont = cont + 1;
                    }
                }else if(numero == 6){

                    if(tela[1][2] == "X" || tela[1][2] == "O"){

                    }else{
                        if(vez == 1){
                            tela[1][2] = "X";
                        }else{
                            tela[1][2] = "O";
                        }

                        vez = vez + 1;
                        cont = cont + 1;
                    }
                }else if(numero == 7){

                    if(tela[2][0] == "X" || tela[2][0] == "O"){

                    }else{
                        if(vez == 1){
                            tela[2][0] = "X";
                        }else{
                            tela[2][0] = "O";
                        }
                        vez = vez + 1;
                        cont = cont + 1;
                    }
                }else if(numero == 8){

                    if(tela[2][1] == "X" || tela[2][1] == "O"){

                    }else{
                        if(vez == 1){
                            tela[2][1] = "X";
                        }else{
                            tela[2][1] = "O";
                        }

                        vez = vez + 1;
                        cont = cont + 1;
                    }
                }else if(numero == 9){

                    if(tela[2][2] == "X" || tela[2][2] == "O"){

                    }else{
                        if(vez == 1){
                            tela[2][2] = "X";
                        }else{
                            tela[2][2] = "O";
                        }
                        vez = vez + 1;
                        cont = cont + 1;
                    }
                }
            }

            if((tela[0][0] == "X" && tela[0][1] == "X" && tela[0][2] == "X")||(tela[1][0] == "X" && tela[1][1] == "X" && tela[1][2] == "X")||
              (tela[2][0] == "X" && tela[2][1] == "X" && tela[2][2] == "X")||(tela[0][0] == "X" && tela[1][0] == "X" && tela[2][0] == "X")||
              (tela[0][1] == "X" && tela[1][1] == "X" && tela[2][1] == "X")||(tela[0][2] == "X" && tela[1][2] == "X" && tela[2][2] == "X")||
              (tela[0][0] == "X" && tela[1][1] == "X" && tela[2][2] == "X")|| (tela[0][2] == "X" && tela[1][1] == "X" && tela[2][0] == "X")){
                vez = 1;
                partida = 0;
            }else if((tela[0][0] == "O" && tela[0][1] == "O" && tela[0][2] == "O")||(tela[1][0] == "O" && tela[1][1] == "O" && tela[1][2] == "O")||
                    (tela[2][0] == "O" && tela[2][1] == "O" && tela[2][2] == "O")||(tela[0][0] == "O" && tela[1][0] == "O" && tela[2][0] == "O")||
                    (tela[0][1] == "O" && tela[1][1] == "O" && tela[2][1] == "O")||(tela[0][2] == "O" && tela[1][2] == "O" && tela[2][2] == "O")||
                    (tela[0][0] == "O" && tela[1][1] == "O" && tela[2][2] == "O")|| (tela[0][2] == "O" && tela[1][1] == "O" && tela[2][0] == "O")) {
                vez = 2;
                partida = 0;
            }else if(cont >= 10){
                partida = 0;
                System.out.printf("Velha!");
            }
        }while(partida == 1);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.printf("|"+tela[i][j]);
            }
            System.out.printf("|\n");
        }
    }
}
