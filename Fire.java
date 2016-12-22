import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Objects
{
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int delay = 1;
    private ArrayList<GreenfootImage> image1 = new ArrayList<GreenfootImage>();
    private int frame = 1;
    public Fire(){
        image1.add(new GreenfootImage("images/Fire/fire1.png"));
        image1.add(new GreenfootImage("images/Fire/fire2.png"));
        image1.add(new GreenfootImage("images/Fire/fire3.png"));
        image1.add(new GreenfootImage("images/Fire/fire4.png"));
        image1.add(new GreenfootImage("images/Fire/fire5.png"));
        image1.add(new GreenfootImage("images/Fire/fire6.png"));
        image1.add(new GreenfootImage("images/Fire/fire7.png"));
        image1.add(new GreenfootImage("images/Fire/fire8.png"));
        image1.add(new GreenfootImage("images/Fire/fire9.png"));
        image1.add(new GreenfootImage("images/Fire/fire10.png"));
        image1.add(new GreenfootImage("images/Fire/fire11.png"));
        image1.add(new GreenfootImage("images/Fire/fire12.png"));
        image1.add(new GreenfootImage("images/Fire/fire13.png"));
        image1.add(new GreenfootImage("images/Fire/fire14.png"));
        image1.add(new GreenfootImage("images/Fire/fire15.png"));
        image1.add(new GreenfootImage("images/Fire/fire16.png"));
        image1.add(new GreenfootImage("images/Fire/fire17.png"));
        image1.add(new GreenfootImage("images/Fire/fire18.png"));
        image1.add(new GreenfootImage("images/Fire/fire19.png"));
        image1.add(new GreenfootImage("images/Fire/fire20.png"));
        image1.add(new GreenfootImage("images/Fire/fire21.png"));
        image1.add(new GreenfootImage("images/Fire/fire22.png"));
        image1.add(new GreenfootImage("images/Fire/fire23.png"));
        image1.add(new GreenfootImage("images/Fire/fire24.png"));
        image1.add(new GreenfootImage("images/Fire/fire25.png"));
        image1.add(new GreenfootImage("images/Fire/fire26.png"));
        image1.add(new GreenfootImage("images/Fire/fire27.png"));
        image1.add(new GreenfootImage("images/Fire/fire28.png"));
        image1.add(new GreenfootImage("images/Fire/fire29.png"));
        image1.add(new GreenfootImage("images/Fire/fire30.png"));
        image1.add(new GreenfootImage("images/Fire/fire31.png"));
        image1.add(new GreenfootImage("images/Fire/fire32.png"));
        image1.add(new GreenfootImage("images/Fire/fire33.png"));
        image1.add(new GreenfootImage("images/Fire/fire34.png"));
        image1.add(new GreenfootImage("images/Fire/fire35.png"));
        image1.add(new GreenfootImage("images/Fire/fire36.png"));
        image1.add(new GreenfootImage("images/Fire/fire37.png"));
        image1.add(new GreenfootImage("images/Fire/fire38.png"));
        image1.add(new GreenfootImage("images/Fire/fire39.png"));
        image1.add(new GreenfootImage("images/Fire/fire40.png"));
        image1.add(new GreenfootImage("images/Fire/fire41.png"));
        image1.add(new GreenfootImage("images/Fire/fire42.png"));
        image1.add(new GreenfootImage("images/Fire/fire43.png"));
        image1.add(new GreenfootImage("images/Fire/fire44.png"));
        image1.add(new GreenfootImage("images/Fire/fire45.png"));
        image1.add(new GreenfootImage("images/Fire/fire46.png"));
        image1.add(new GreenfootImage("images/Fire/fire47.png"));
        image1.add(new GreenfootImage("images/Fire/fire48.png"));
        image1.add(new GreenfootImage("images/Fire/fire49.png"));
        setImage("images/Fire/fire1.png");
    }
    public void act() 
    {
        animate();
        timer();
    }    
    public void animate(){
        if(frame <= 48){
            setImage(image1.get(delay/3));
            frame++;
        }else{
            frame = 1;
        }

    }
    public void timer(){
        if(delay >= 144){
            delay =0;
        }else{
            delay++;
        }
    }
}
