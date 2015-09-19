package Entity;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import TileMap.TileMap;

public class FireBall extends MapObject {
	
	private boolean hit;
	private boolean remove;
	private BufferedImage[] sprites;
	private BufferedImage[] hitSprites;
	
	public FireBall(TileMap tm, boolean right) {
		
		super(tm);
		
		moveSpeed = 3.8;
		if(right) dx = moveSpeed;
		else dx = -moveSpeed;
		
		
		width = 30;
		height = 30;
		cwidth = 14;
		cheight = 14;
		
		// load sprites
		 try {
			 
			 BufferedImage spritesheet = ImageIO.read(
				getClass().getResourceAsStream("/Sprites/player/fireball.gif")	 
			);
			 
			 sprites = new BufferedImage[4];
			 for(int i = 0; i < sprites.length; i++){
				 sprites[i] = spritesheet.getSubimage(i * width, 0, width, height);
			 }
			 
			 hitSprites = new BufferedImage[3];
			 for( int i = 0; i < hitSprites.length; i++){
				 hitSprites[i] = spritesheet.getSubimage(i *width, height, width, height);
			 }
			 
			// animation = new Animation();
			 // animation.setFrames(sprites.getClass());
			 
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
	}

}
