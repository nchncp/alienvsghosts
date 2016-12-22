import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player3 extends Player
{
    /**
     * Act - do whatever the Pac wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    boolean canMoveUp;
    boolean canMoveDown;
    boolean canMoveLeft;
    boolean canMoveRight;
    boolean up=false;
    boolean down=false;
    boolean left=false;
    boolean right=false;
    boolean eatBoost = false;
    boolean atWorldEdge = false;
    private int hp = 1;
    private Counter c;
    private ArrayList<GreenfootImage> image1 = new ArrayList<GreenfootImage>();
    boolean die = false;
        private int time = 20;
        Game game;
    public Player3(Counter counter){
        c = counter;
    }

    public void act() 
    {
        //checkWall();
        checksKey();
        //canTurn();
        warb();
        eatBoost();
        eatCoin();
        die();
    }    
        public void die(){
        
        if(die){
            time--;
        }
        if(isTouching(Monster.class)){
            move(0);
            this.die = true;
        }

        if(time ==14){
            getImage().setTransparency(80);
        }else if(time == 7){
            getImage().setTransparency(50);
        }else if(time == 0){
           game = (Game) getWorld();
            getImage().setTransparency(20);
            getWorld().removeObject(this);
            Greenfoot.playSound("pacman_death.wav");
            game.addObject(new GameOver(),34,34);
            Greenfoot.stop();
        }
        
    }
    public void checksKey()
    {
        //เช็ควัตถุรอบๆตัว
        if(canControl()&& !die){
            if(canMove( getX(),getY()-2) && canMove(getX()-1,getY()-2) && canMove(getX()+1,getY()-2)) {
                canMoveUp = true;
            }else{
                canMoveUp = false;
            }
            if(canMove( getX(),getY()+2)&& canMove(getX()-1,getY()+2) && canMove(getX()+1,getY()+2) ) {
                canMoveDown = true;
            }else{
                canMoveDown = false;
            }
            if(canMove( getX()-2,getY()) && canMove( getX()-2,getY()+1) && canMove( getX()-2,getY()-1) ) {
                canMoveLeft = true;
            }else{
                canMoveLeft = false;
            }   
            if(canMove( getX()+2,getY()) && canMove( getX()+2,getY()+1) && canMove( getX()+2,getY()-1)) {
                canMoveRight = true;
            }else{
                canMoveRight = false;
            }

            if(speedIncrease <     maxSpeed){
                if ( Greenfoot.isKeyDown("up") ){       
                    if( canMoveUp){
                        //setRotation(270);
                        up=true;
                        down=left=right=false;
                    }
                }else if ( Greenfoot.isKeyDown("down") ){  
                    if(canMoveDown){
                        //setRotation(90); 
                        down=true;
                        up=left=right=false;
                    }
                }else if ( Greenfoot.isKeyDown("left") ){     
                    if( canMoveLeft){
                        //setRotation(180);    
                        left=true;
                        up=down=right=false;
                    }
                }else if ( Greenfoot.isKeyDown("right") ){    
                    if( canMoveRight){
                        //setRotation(0);       
                        right=true;
                        up=down=left=false;
                    }
                }

                if(canMoveUp && up){
                    setLocation(getX(), getY()-speed);
                    //move(speed);
                    switchImage("/P3/P3_back-" ,4,".png");
                }else if(canMoveDown && down){
                    setLocation(getX(), getY()+speed);
                    switchImage("/P3/P3_front-" ,4,".png");
                }else if(canMoveLeft && left){
                    setLocation(getX()-speed, getY());
                    switchImage("/P3/P3_left-" ,11,".png");
                }else if(canMoveRight && right){
                    setLocation(getX()+speed, getY());
                    switchImage("/P3/P3_right-" ,11,".png");
                }
                ++speedIncrease;
            }
            else{
                speedIncrease=0;
            }
        }
    }

    public void eatBoost(){
        if(canSee(SpeedBoost.class)&& !die){
            eat(SpeedBoost.class);
            speedUP();
        }
    }

    public void eatCoin(){
        if(canSee(Coin.class) && !die){
            c.add(100);
            eat(Coin.class);
            Greenfoot.playSound("coin.wav");
        }else{

        }
    }

    /*public void die(){
    if(canSee(Monster.class)){
    hp--;
    if(hp == 0){

    }
    }
    }*/

    public void speedUP(){
        maxSpeed += 1;
    }

    public int getSpeed(){
        return maxSpeed;
    }

    public void warb(){
        int a = 0;
        if(getRotation() == 180){// warb left
            a += 1;
        }else if(getRotation() == 90){//warb down
            a += 2;
        }else if(getRotation() == 0){//warb right
            a += 3;
        }else{//warb top
            a += 4;
        }

        if(isTouching(Warb.class) && left){
            setLocation(67,28);
        }else if(isTouching(Warb.class) && down){
            setLocation(34,4);
        }
        else if(isTouching(Warb.class)&& right){
            setLocation(4,28);
        }
        else if(isTouching(Warb.class) && up){
            setLocation(34,55);
        }
    }  
}
