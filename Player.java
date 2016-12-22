import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int i = 1;
    protected boolean canMove;
    protected int speedIncrease, maxSpeed = 1,speed = 1;
    protected static GreenfootImage imagePac[] ;
    private Time time = new Time();
    protected boolean canPlay;
    private boolean setStart = false;
    /**
     * Act - do whatever the Char wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
     
    public boolean canMove(int x , int y){
        //search for particular wall
        ArrayList<Wall> wall = (ArrayList<Wall>) getWorld().getObjectsAt(x,y,Wall.class);  
        ArrayList<Ground> ground = (ArrayList<Ground>) getWorld().getObjectsAt(x,y,Ground.class);
        ArrayList<Box1> box1 = (ArrayList<Box1>) getWorld().getObjectsAt(x,y,Box1.class);
        ArrayList<Box2> box2 = (ArrayList<Box2>) getWorld().getObjectsAt(x,y,Box2.class);
        ArrayList<Box3> box3 = (ArrayList<Box3>) getWorld().getObjectsAt(x,y,Box3.class);
        ArrayList<Box3> walls = (ArrayList<Box3>) getWorld().getObjectsAt(x,y,Walls.class);
        ArrayList<Box3> ice = (ArrayList<Box3>) getWorld().getObjectsAt(x,y,Ice.class);
        
        //if there are walls can not move
        if(wall.size() != 0 || ground.size() !=0 || box1.size()!=0 || box2.size()!=0 || box3.size()!=0 || walls.size()!=0 || ice.size()!=0){
         canMove = false;
        }else{
         canMove = true;
        }
        return canMove;    
    }
    public boolean canSee(Class clss) {  
        return getOneObjectAtOffset(0, 0, clss) != null;  
    }  
    public void eat(Class clss) {  
        Actor actor = getOneObjectAtOffset(0, 0, clss);  
        if(actor != null) {  
        getWorld().removeObject(actor);  
        }  
    }
        public int getSpeed(){
        return speed;
    }
        public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
            return false;
    }
    public void switchImage(String name,int image,String last){
        if(i >=1 && i <=image){
            setImage(name+i+last);
            ++i;
        }else{
            i=1;
        }
    }
    
    public void setImagePlayer(String player){
        imagePac = new GreenfootImage[11];
        
        for(int i = 1;i<imagePac.length;i++){
            imagePac[i-1] = new GreenfootImage(player+i+".png");
        }
    }
        public boolean canControl(){
        if(!Timer.intro.isPlaying() && !Normal.intro.isPlaying()){  
         canPlay = true;
        }
        return canPlay;
    }
}
