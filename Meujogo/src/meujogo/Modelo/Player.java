package meujogo.Modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
	
	private int x,y;
	private int dx,dy;
	private Image imagem;
	private int altura,largura;
	
	public Player() {
		this.x = 10;
		this.y = 10;
	}
	
	public void load() {
		
		ImageIcon referencia = new ImageIcon("res//PS1.jpg");
		imagem = referencia.getImage();
		
		altura =  imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void update() {
		x = getX() + dx;
		y = getY() + dy;
	}
	
	public void keyPressed(KeyEvent tecla) {

		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP) {
			dy = +2;
		}
		
		if(codigo == KeyEvent.VK_DOWN) {
			dy = 2;
		}
		
		if(codigo == KeyEvent.VK_LEFT) {
			dx = -2;
		}
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dx = 2;
		}
	}
	
	public void keyReleased(KeyEvent tecla) {
		
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP) {
			dy = 0;
		}
		
		if(codigo == KeyEvent.VK_DOWN) {
			dy = 0;
		}
		
		if(codigo == KeyEvent.VK_LEFT) {
			dx = 0;
		}
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Image getImagem() {
		return imagem;
	}
}
