package meujogo;//meu pacote

import javax.swing.JFrame;//biblioteca da intefacer grafica 

import meujogo.Modelo.Fase;//meu pacote

public class Container extends JFrame{//codigo para tela
	
	public Container() {//desenhador a tela
		add(new Fase());//adicionador a fase na tela
		setTitle("Meu jogo");//nome da janela
		setSize(1024,728);//tamanho da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//funçao para fechar a janela
		this.setResizable(false);//funçao vai inpredir usuario estica a tela
		setVisible(true);//fu
	}
	
	public static void main(String []args) {
		new Container();
	}
}
