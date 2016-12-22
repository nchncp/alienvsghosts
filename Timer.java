import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Buttons
{
    /**
     * Act - do whatever the timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static GreenfootSound intro = new GreenfootSound("pacman_beginning.wav");
    public void act() 
    {
        // click to go to MapTimer
        // click then go to Normal Map
        if(Greenfoot.mouseClicked(this)){
            switchMap(4);
            sound("button.wav");
            intro.play();
            if(Game.background.isPlaying()){
                Game.background.stop();
            }
        }

    }    
}
