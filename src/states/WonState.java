package states;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import entities.Text;
import main.Main;
import managers.SoundManager;

public class WonState extends BasicGameState {
	
	Text text;
	
	private int time;
	private String wonMessage = "YOU WON THIS TIME EARTHLING";
	private int currentLetter = 0;
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		text = new Text(wonMessage, -1, -1, 20, Color.white);
		text.setMessage("");
	}
	
	public void keyPressed(int key, char c) {
	}
	
	@Override
	public void enter(GameContainer gc, StateBasedGame sbg) {
		SoundManager.stopAll();
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		text.draw(g);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
		time += delta;
		
		if(time >= 200 && currentLetter + 1 <= wonMessage.length()) {
			text.setMessage(text.getMessage() + wonMessage.charAt(currentLetter++));
			time = 0;
		}
		
	}

	@Override
	public int getID() {
		return Main.STATE_WON;
	}

}