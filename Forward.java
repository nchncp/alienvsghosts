import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forward extends SelectPlayer
{
    /**
     * Act - do whatever the Next wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Game choice ;
    public void act() 
    {
        switchPlayer();
    }    
       public void switchPlayer(){
         choice = (Game) getWorld();
        if(Greenfoot.mouseClicked(this)){
            setImage("forward.png");
            int next = (getPlayer()+1)%3;
            setPlayer(next);
            switchPlayer(Math.abs(next));
            //Ichoice.setChoicePlayer(choice.getChoicePlayer()+1);
            //setPlayer(getPlayer()+1);
            sound("button.wav");
        }
    }
}
