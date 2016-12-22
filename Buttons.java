import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootSound sound;
    private Game game;
     
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void switchMap(int map){
        game = (Game) getWorld();
        game.clearMap();
        game.switchMap(map);
    }
    
    public void sound(String music){
        sound = new GreenfootSound (music);
        sound.play();
    }
    

}
