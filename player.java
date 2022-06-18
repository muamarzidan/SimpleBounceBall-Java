import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

/**
 * Write a description of class player here.
 * 
 * @author (Muamar Zidan Tri Antoro) 
 * @version (trial)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   public player()
   {
    GreenfootImage img=getImage();img.scale(img.getWidth()+30,img.getHeight()-60); // mengatur skala image subclass player setImage(img);
   }
   
   public void act()
  {
    // Untuk menggerakkan player
    if(Greenfoot.isKeyDown("left")){move(-3); //menggerakkan subclass player ke kiri
    }
    if(Greenfoot.isKeyDown("right")){move(3); //menggerakkan subclass player ke kanan
    }
    if(Greenfoot.mouseMoved(null)){
                                    MouseInfo mouse = Greenfoot.getMouseInfo(); 
                                    setLocation(mouse.getX(), 360); //menggerakkan player dengan mouse ke kanan atau ke kiri
                                }
    
  }
}