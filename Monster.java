import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Player
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int i =0;
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

    public void act() 
    {
        //checkWall();
        checksKey();
        //canTurn();
        warb();

        //eatBoost();
    }    

    
    public void checksKey()
    {
        //เช็ควัตถุรอบๆตัว
        if(canControl()){
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
                i++;
                i=i%6;
                if(i == 0){
                    randomMove();
                }
                if(canMoveUp && up){
                    setLocation(getX(),getY()-speed);
                    switchImage("/Monster/ghost_back-" ,1,".png");
                }else if(canMoveDown && down){
                    setLocation(getX(), getY()+speed); 
                    switchImage("/Monster/ghost_front-" ,2,".png");
                }else if(canMoveLeft && left){
                    setLocation(getX()-speed, getY());   
                    switchImage("/Monster/ghost_left-" ,2,".png");
                }else if(canMoveRight && right){
                    setLocation(getX()+speed, getY());   
                    switchImage("/Monster/ghost_right-" ,2,".png");
                }
                ++speedIncrease;
            }
            else{
                speedIncrease=0;
            }
        }
    }

    public void randomMove(){
        int direction=0;
        if ( canMoveUp && canMoveDown && canMoveLeft && canMoveRight&& up){       
            int num = (int)((Math.random()*3));
            switch (num){
                case 0 : direction = 0; break;
                //case 1 : direction = 1; break;
                case 1 : direction = 2; break;
                case 2 : direction = 3; break;
            }
        }else if( canMoveUp && canMoveDown && canMoveLeft && canMoveRight&& down){       
            int num = (int)((Math.random()*3));
            switch (num){
                //case 0 : direction = 0; break;
                case 1 : direction = 1; break;
                case 2 : direction = 2; break;
                case 3 : direction = 3; break;
            }
        }else if( canMoveUp && canMoveDown && canMoveLeft && canMoveRight&& left){       
            int num = (int)((Math.random()*3));
            switch (num){
                case 0 : direction = 0; break;
                case 1 : direction = 1; break;
                case 2 : direction = 2; break;
                //case 3 : direction = 3; break;
            }

        }else if( canMoveUp && canMoveDown && canMoveLeft && canMoveRight&& right){       
            int num = (int)((Math.random()*3));
            switch (num){
                case 0 : direction = 0; break;
                //case 1 : direction = 1; break;
                case 1 : direction = 2; break;
                case 2 : direction = 3; break;
            }

        }

        else if (canMoveUp && canMoveLeft && canMoveRight && up){  
            int num = (int)((Math.random()*3));
            switch (num){
                case 0 : direction = 0;break;
                case 1 :  direction = 2;break;
                case 2 : direction = 3;break;
            }
        }
        else if (canMoveUp && canMoveLeft && canMoveRight && left){  
            int num = (int)((Math.random()*2));
            switch (num){
                case 0 : direction = 0;break;
                case 1 :  direction = 2;break;
                //case 2 : direction = 3;break;
            }
        }
        else if(canMoveUp && canMoveLeft && canMoveRight && right){
            int num = (int)((Math.random()*2));
            switch (num){
                case 0 : direction = 0;break;
                case 1 : direction = 3;break;
            }
        }

        else if ( canMoveUp && canMoveDown && canMoveRight && up){     
            int num = (int)((Math.random()*2));
            switch (num){
                case 0 : direction = 0;break;
                case 1 : direction = 3;break;
            }
        } 
        else if ( canMoveUp && canMoveDown && canMoveRight && down){     
            int num = (int)((Math.random()*2));
            switch (num){
                case 0 : direction = 1;break;
                case 1  : direction = 3;break;
            }
        } 
        else if ( canMoveUp && canMoveDown && canMoveRight && right){     
            int num = (int)((Math.random()*3));
            switch (num){
                case 0 : direction = 0;break;
                case 1 : direction = 1;break;
                case 2 : direction = 3;break;
            }
        }

        else if ( canMoveUp && canMoveDown && canMoveLeft && up){    
            int num = (int)((Math.random()*2));
            switch (num){
                case 0 : direction = 1;break;
                case 1 :  direction = 2;break;
            }
        }
        else if ( canMoveUp && canMoveDown && canMoveLeft && down){    
            int num = (int)((Math.random()*2));
            switch (num){
                case 0 : direction = 1;break;
                case 1 :  direction = 2;break;
            }
        }
        else if ( canMoveUp && canMoveDown && canMoveLeft && left){    
            int num = (int)((Math.random()*3));
            switch (num){
                case 0 : direction = 0;break;
                case 1 : direction = 1;break;
                case 2 :  direction = 2;break;
            }
        }

        else if( canMoveDown && canMoveLeft && canMoveRight && down){
            int num = (int)((Math.random()*3));
            switch (num){
                case 0 : direction = 3;break;
                case 1 : direction = 1;break;
                case 2 :  direction = 2;break;
            }
        }else if( canMoveDown && canMoveLeft && canMoveRight && left){
            int num = (int)((Math.random()*2));
            switch (num){
                case 0 : direction = 1;break;
                case 1 :  direction = 2;break;
            }
        }else if( canMoveDown && canMoveLeft && canMoveRight && right){
            int num = (int)((Math.random()*2));
            switch (num){
                case 0 : direction = 1;break;
                case 1 : direction = 3;break;
            }

        }

        else if( canMoveLeft && canMoveRight && left){  
            direction = 2;
        }
        else if( canMoveLeft && canMoveRight && right){
            direction = 3;
        }
        else if( canMoveDown && canMoveRight&& down){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 : direction = 1;break;
                case 1 :direction = 3;break;
            }   
        }else if( canMoveDown && canMoveRight&& right){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 : direction = 1;break;
                case 1 :direction = 3;break;
            }
        }
        else if( canMoveDown && canMoveRight&& up){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 : direction = 1;break;
                case 1 :direction = 3;break;
            }
        }
        else if( canMoveDown && canMoveRight&& left){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 : direction = 1;break;
                case 1 :direction = 3;break;
            }
        }
        else if( canMoveDown && canMoveLeft && down){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 : direction = 2;break;
                case 1 : direction = 1;break;
            }
        }
        else if( canMoveDown && canMoveLeft && right){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 : direction = 2;break;
                case 1 : direction = 1;break;
            }
        }
        else if( canMoveDown && canMoveLeft && left){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 : direction = 2;break;
                case 1 : direction = 1;break;
            }    
        }        else if( canMoveDown && canMoveLeft && up){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 : direction = 2;break;
                case 1 : direction = 1;break;
            }    
        }

        else if( canMoveRight && canMoveUp && right){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 :direction = 3;break;
                case 1 : direction = 0;break;
            }
        }
        else if( canMoveRight && canMoveUp && up){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 :direction = 3;break;
                case 1 : direction = 0;break;
            }

        }        else if( canMoveRight && canMoveUp && down){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 :direction = 3;break;
                case 1 : direction = 0;break;
            }
        }        else if( canMoveRight && canMoveUp && left){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 :direction = 3;break;
                case 1 : direction = 0;break;
            }
        }
        else if( canMoveLeft && canMoveUp && left){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 :  direction = 2;break;
                case 1 : direction = 0;break;
            }
        }else if( canMoveLeft && canMoveUp && up){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 :  direction = 2;break;
                case 1 : direction = 0;break;
            }
        }
        else if( canMoveLeft && canMoveUp && right){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 :  direction = 2;break;
                case 1 : direction = 0;break;
            }
        }
        else if( canMoveLeft && canMoveUp && down){
            int num = (int)((Math.random()*2)); 
            switch (num){
                case 0 :  direction = 2;break;
                case 1 : direction = 0;break;
            }
        }
        else if ( canMoveUp && up){    
            direction = 0;
        }
        else if ( canMoveUp && right){    
            direction = 0;
        }
        else if ( canMoveUp && down){    
            direction = 0;
        }
        else if ( canMoveUp && left){    
            direction = 0;
        }
        else if (canMoveDown && down){    
            direction = 1;
        }
        else if (canMoveDown && left){    
            direction = 1;
        }
        else if (canMoveDown && right){    
            direction = 1;
        }
        else if (canMoveDown && up){    
            direction = 1;
        }
        else if (canMoveLeft && left ){    
            direction = 2;
        }
        else if (canMoveLeft && right ){    
            direction = 2;
        }
        else if (canMoveLeft && up ){    
            direction = 2;
        }
        else if (canMoveLeft && down ){    
            direction = 2;
        }
        else{
            direction = 3;
        }

        switch (direction){
            case 0 :  up = true; down=left=right=false;break;
            case 1 : down = true; up=left=right=false;break;
            case 2 : left = true; up=down=right=false;break;
            case 3 :  right = true; up=left=down=false; break;

            /*case 0 : setRotation(270); up = true; down=left=right=false;break;
            case 1 : setRotation(90); down = true; up=left=right=false;break;
            case 2 : setRotation(180); left = true; up=down=right=false;break;
            case 3 : setRotation(0); right = true; up=left=down=false; break;*/
        }
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

