import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normal extends Buttons
{
    public static GreenfootSound intro = new GreenfootSound("pacman_beginning.wav");
    
    /**
     * Act - do whatever the normal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // click then go to Normal Map
        if(Greenfoot.mouseClicked(this)){
            /*MapNormal game = new MapNormal();
            Greenfoot.setWorld(game);
                        sound("button.wav");*/
            switchMap(3);
            sound("button.wav");
            //if(!canPlay){
            //Greenfoot.playSound("pacman_beginning.wav");
            intro.play();
            if(Game.background.isPlaying()){
                            Game.background.stop();
                        }
                        
        //}
        }
    }    
}
