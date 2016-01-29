package Main;
import org.jsfml.graphics.Color;
import org.jsfml.graphics.RenderWindow;
import org.jsfml.system.Clock;
import org.jsfml.system.Time;
import org.jsfml.window.Keyboard;
import org.jsfml.window.VideoMode;
import org.jsfml.window.event.Event;

public class Game {
	
	public static final int WIDTH = 320;
	public static final int HEIGHT = 240;
	public static final int SCALE = 2;
	
	public static RenderWindow window = new RenderWindow(new VideoMode(WIDTH*SCALE,HEIGHT*SCALE), "GameTitle");
	public static ResManager res = new ResManager();
	public static Clock c = new Clock();
	
	public static void processInputs(){
		if(Keyboard.isKeyPressed(Keyboard.Key.ESCAPE)){
			window.close();
		}
	}
	
	public static void processEvents(){
		for(Event e: window.pollEvents()){
			if(e.type == Event.Type.CLOSED){
				window.close();
			}
		}
	}
	
	public static void tick(Time t){
		window.clear(Color.CYAN);
		window.display();
		
	}
	
	public static void draw(){
		
	}
	
	public static void main(String[] args) {
		
		while(window.isOpen()){
			processEvents();
			processInputs();
			tick(c.restart());
			draw();
		}
		
	}

}
