import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exist extends Buttons
{
    /**
     * Act - do whatever the Exist wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            sound("button.wav");
        }
    }    
}
