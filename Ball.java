import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int randomX;
    private int randomY;
    public Ball(){
        getImage().scale(50,60);
        randomX();
        randomY();
    }
    public void act()
    {
      setLocation(getX()+randomX,getY()+randomY);
      turnBottom();
      turnTop();
      turnLeft();
      turnRight();
    } 
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void randomX(){
        randomX = Greenfoot.getRandomNumber(20)-Greenfoot.getRandomNumber(10);
    }
    public void randomY(){
        randomY = Greenfoot.getRandomNumber(20)-Greenfoot.getRandomNumber(10);
    }
    public void turnLeft(){
        if(getX()<=30){
            randomX= -(randomX);
        }
    }
    public void turnRight(){
        if(getX()>=569){
            randomX= -(randomX);
        }
    }
    public void turnTop(){
        if(getY()<=10){
            randomY= -(randomY);
        }
    }
    public void turnBottom(){
        if(getY()>=369){
            randomY= -(randomY);
        }
            
    }
    public boolean isAtLeft(){
        if(getX() <= 10){
            return true;
        }else{
            return false;
        }
    }
    public boolean isAtRight(){
        if(getX() <= 810){
            return true;
        }else{
            return false;
        }
    }
    public boolean isAtBottom(){
        if(getY() <= 10){
            return true;
        }else{
            return false;
        }
    }
    public boolean isAtTop(){
        if(getY() <= 610){
            return true;
        }else{
            return false;
        }
    }
  }

