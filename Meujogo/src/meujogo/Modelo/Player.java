package meujogo.Modelo;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.List;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Player implements ActionListener{
	
	private int x,y;
	private int dx,dy;
	private Image imagem;
	private int altura,largura;
	private List <Tiro> tiros;
	private boolean isVisivel,isTurbo;
	private Timer timer;
	
	public Player() {
		this.x = 100;
		this.y = 100;
		isVisivel = true;
		isTurbo = false;
		
		tiros = new ArrayList<Tiro>();
		timer = new Timer(5, this);
		timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
	}
	
	public void load() {
		
		ImageIcon referencia = new ImageIcon("res//PS2.jpg");
		imagem = referencia.getImage();
		altura =  imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void update() {
		x += dx;
		y += dy;
	}
	
	public void tiroSimples() {
		this.tiros.add(new Tiro(x + largura,y + (altura / 2)));
	}
	
	public void turbo() {
		isTurbo = true;
		ImageIcon referencia = new ImageIcon("res//PS2.jpg");
		imagem = referencia.getImage();
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,largura,altura);
	}
	
	public List<Tiro> getTiros() {
		return tiros;
	}

	public void keyPressed(KeyEvent tecla) {

		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_A) {
			tiroSimples();
		}
		
		if(codigo == KeyEvent.VK_UP) {
			dy = -1;
		}
		
		if(codigo == KeyEvent.VK_DOWN) {
			dy = 1;
		}
		
		if(codigo == KeyEvent.VK_LEFT) {
			dx = -1;
		}
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dx = 1;
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
	
	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
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
///VAI