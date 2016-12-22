import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Objects
{
    /**
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time = 120;
    public void act() 
    {
        time--;
         if(time ==75){
         getImage().setTransparency(80);
        }else if(time == 50){
          getImage().setTransparency(60);
        }
        else if(time == 25){
            getImage().setTransparency(40);
        }else if(time == 0){
            getImage().setTransparency(20);
            getWorld().removeObject(this);
        }
    }
}