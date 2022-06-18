import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

/**
 * Write a description of class skor here.
 * 
 * @author (Muamar Zidan Tri Antoro) 
 * @version (trial)
 */
public class skor extends Actor
{
    /**
     * Act - do whatever the skor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    
    /**
     * Create a score board with dummy result for testing.
     */
    public skor(){
                   this(25);
                }
    
    /**
     * Create a score board for the final result.
     */
    public skor(int score){
                            makeImage("Game Over", "Skor Anda : ", score);
    }
    
    /**
     * Make the score board image.
     */
    private void makeImage(String title, String prefix, int score){
                                                                     GreenfootImage image = new GreenfootImage(WIDTH,HEIGHT);
                                                                     image.setColor(new Color(14, 14, 89, 160));
                                                                     image.fillRect(0, 0, WIDTH, HEIGHT);
                                                                     image.setColor(new Color(255, 255, 255, 100));
                                                                     image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
                                                                     Font font = image.getFont();
                                                                     font = font.deriveFont(FONT_SIZE);
                                                                     image.setFont(font);
                                                                     image.setColor(Color.WHITE);
                                                                     image.drawString(title, 60, 100);
                                                                     image.drawString(prefix + score, 60, 200);
                                                                     setImage(image);
                                                                    }                                                                                                                                         
    public void act() 
    {
        // Add your action code here.
    }    
}
