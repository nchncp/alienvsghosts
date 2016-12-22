import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Video here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Video extends Actor
{
    /**
     * Act - do whatever the Video wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int i = 1;
    protected boolean checkSound = false;
    protected Game game;
    public void act() 
    {
        // Add your action code here.
    }    

    public void runVideo(String name , String lastName , int numImage,int delay,int switchMap){

        if( i>= 0 && i <= numImage ){

            setImage(name+i+lastName);
            i++;

        }
        else if( i >= numImage && i <= delay){
            checkSound = false;
            i++;
        }
        else{

            game = (Game) getWorld();

            game.clearMap();
            game.switchMap(switchMap);
        }

    }
}
