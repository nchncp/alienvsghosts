import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Previous here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Previous extends SelectPlayer
{

    /**
     * Act - do whatever the Previous wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Game choice;
    public void act() 
    {
     switchPlayer();
    }    
    public void switchPlayer(){
       choice = (Game) getWorld();
        if(Greenfoot.mouseClicked(this)){
            //setImage("previous.png");
            int back = (getPlayer()-1)%3;
            setPlayer(back);
            switchPlayer(Math.abs(back));
           // choice.setChoicePlayer(choice.getChoicePlayer()-1);
            sound("button.wav");
        }
    }
}
