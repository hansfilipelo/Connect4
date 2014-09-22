package connect4;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConnectGui extends JPanel {
	private static final long serialVersionUID = 0L;
	
	private static final int TYPE_RED = 1;
	private static final int TYPE_BLACK = 2;
	private static final int TYPE_EMPTY = 0;
	private static final int BOARD_START_X = 51;
	private static final int BOARD_START_Y = 51;
	private static final int TILE_OFFSET_X = 60;
	private static final int TILE_OFFSET_Y = 60;
	

	private int gameState = GAME_STATE_RED;
	static final int GAME_STATE_RED = 1;
	static final int GAME_STATE_BLACK = 2;
	
	private List<Square> squares = new ArrayList<Square>();
	
	public ConnectGui (){
		for(int j = 0; j < 7; j++) {
			for(int i = 0; i < 6; i++) {
				createAndAddPiece(TYPE_EMPTY,BOARD_START_X+j*TILE_OFFSET_X,BOARD_START_Y+i*TILE_OFFSET_Y);
			}
		}
		
		ClickListener listener = new ClickListener(this.squares,this);
		this.addMouseListener(listener);
		this.addMouseMotionListener(listener);
		
		JFrame f = new JFrame ();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(this);
		f.setResizable(false);
		f.setSize(600,600);
	}
	
	private void createAndAddPiece(int type, int x, int y){
		Image img = this.getImageForSquare(type);
		//TILE_OFFSET_X = img.getWidth(null);
		Square square = new Square(img,x,y, type);
		this.squares.add(square);
	}
	
	private Image getImageForSquare(int type){
		String filename = "";
		switch (type){
		case TYPE_EMPTY:
			filename += "E";
			break;
		case TYPE_RED:
			filename += "R";
			break;
		case TYPE_BLACK:
			filename += "B";
			break;
		}
		filename += ".png";
		
		URL urlPieceImg = getClass().getResource("/images/" + filename);
		return new ImageIcon(urlPieceImg).getImage();
	}
	
	protected void paintComponent (Graphics g){
		for (Square square : this.squares){
			g.drawImage(square.getImage(), square.getX(), square.getY(), null);
		}
	}
	public static void main(String[] args) {
		new ConnectGui();
	}
	
	public void changeGameState() {
		switch (this.gameState) {
			case GAME_STATE_BLACK:
				this.gameState = GAME_STATE_RED;
				break;
			case GAME_STATE_RED:
				this.gameState = GAME_STATE_BLACK;
				break;
			default:
				throw new IllegalStateException("unknown game state:" + this.gameState);
		}
	}
	public int getGameState(){
		return gameState;
	}
}
