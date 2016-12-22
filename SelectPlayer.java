import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectPlayer extends Actor
{
    /**
     * Act - do whatever the SelectPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Game game;
    protected int numPlayer = 0 ;
    GreenfootSound sound;
    public void act() 
    {
        
    }    
    public void setPlayer(int num){
        this.numPlayer = num;
        Game.playerNum = num;
    }

    public int getPlayer(){
        return this.numPlayer;
    }
        public void     switchPlayer(int player){
        game = (Game) getWorld();
        PlayerPage pp = new PlayerPage();
        switch (player){
            case 0 :        game.addObject(pp, 42, 14);
                            P1 p1 = new P1();
                            game.addObject(p1, 42, 16);
                            break;
            case 1 :        game.addObject(pp, 42, 14);
                            P2 p2 = new P2();
                            game.addObject(p2, 42, 16);
                            break;
            case 2 :        game.addObject(pp, 42, 14);
                            P3 p3 = new P3();
                            game.addObject(p3, 42, 16);
                            break;
        }


    }
        public void sound(String music){
        sound = new GreenfootSound (music);
        sound.play();
    }
}
    /*public void checkSwitchPlayer(){
        if( numPlayer == 1){
            switchMap = 7;
        }
        else if( numPlayer == 2){
            switchMap = 6;
        }
        else if( numPlayer == 3){
            switchMap = 4;
        }
        else if( numPlayer == 4){
            switchMap = 9;
        }
    }*/
