import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Time here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Time extends Actor
{
    public static long startTime; 
    public static long currentTime; 
    public static long duration;
    
    Game game;
    SpeedBoost sb;
    
    /**
     * Act - do whatever the Time wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        addBoost();
    }    
    
    public void startCount(){
        this.startTime = System.currentTimeMillis();
    }
    
    
    
    public void setDuration(){
        this.duration = (System.currentTimeMillis() - this.startTime)/1000  ;
    }
    
    public long getDuration(){
        return this.duration;
    }
    
    public void addBoost(){
         this.game = (Game) getWorld();
        this.sb = new SpeedBoost();
        if((this.duration)%10 == 0){
            //System.out.println(System.currentTimeMillis());
            game.addObject(sb, 4, 4);
        }
    }
}
