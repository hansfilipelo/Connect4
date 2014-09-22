package connect4;

import java.awt.Image;

public class Square {
	private Image img;
	private int x;
	private int y;
	private int type;
	
	public Square(Image img, int x, int y, int type){
		this.img = img;
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public Image getImage() {
		return img;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	public int getWidth() {
		return img.getWidth(null);
	}
	public int getHeight() {
		return img.getHeight(null);
	}
	public int getType(){
		return type;
	}
}
