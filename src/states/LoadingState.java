package states;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import entities.Text;
import main.Main;

public class LoadingState extends BasicGameState {
	
	Text text;
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		text = new Text("LOADING ..", -1, -1, 20, Color.white);
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		text.draw(g);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		sbg.enterState(Main.STATE_SPLASH);
	}

	@Override
	public int getID() {
		return Main.STATE_LOADING;
	}

}