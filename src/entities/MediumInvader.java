package entities;

import org.newdawn.slick.Graphics;

import managers.TextureManager;
import states.GameState;

public class MediumInvader extends Invader {

	public MediumInvader(float x, float y) {
		super(x, y);
		deadTex = GameState.texMan.getTexture(TextureManager.INVADER_EXPLOSION);
		liveTex = GameState.texMan.getAnimatedTexture(TextureManager.MEDIUM_INVADER, GameState.animSpeed);
		
	}
	
	public void draw(Graphics g) {
		super.draw(g);
		if(isDead)
			g.drawImage(deadTex, x, y);
		else
			g.drawAnimation(liveTex, x, y);
	}
	
	public void update(int delta) {
		super.update(delta);
	}
	
}
