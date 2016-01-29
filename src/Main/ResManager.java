package Main;

import java.util.ArrayList;

import org.jsfml.graphics.Sprite;
import org.jsfml.graphics.Texture;

public class ResManager {
	public ArrayList<Texture> textures;
	public ArrayList<Animation>animations;
	
	public ArrayList<Platform>platform;
	public ArrayList<Player>player;
	
	public ArrayList<Text>text;
	public ArrayList<Button>button;
	
	public ResManager(){
		textures = new ArrayList<>();
		animations = new ArrayList<>();
		platform = new ArrayList<>();
		player = new ArrayList<>();
		text = new ArrayList<>();
		button = new ArrayList<>();
	}
}
