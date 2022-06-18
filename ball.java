import greenfoot.*;

/**
 * Write a description of class ball here.
 * 
 * @author (Muamar Zidan Tri Antoro) 
 * @version (trial)
 */
public class ball extends Actor
{ 
    int x=3;
    int y=3;
      /**
      * Act - do whatever the ball wants to do. This method is called whenever
      * the ’Act’ or ’Run’ button gets pressed in the environment.
      */
  public void act() 
  {
     // Add your action code here.
     gerak();
     kanan();
     kiri();
     atas();
     pemain();
  }
  public void gerak()
  {
     setLocation(getX()+x,getY()+y);
  }
  public void kanan()
  {
    if(getX()>=getWorld().getWidth()-getImage().getWidth()/2){ 
                                                            x=x-1;
                                                        }
  }
  public void kiri()
  {
  if(getX()<=getImage().getWidth()/2){
                                      x=x+1;
                                   }
  }
  public void atas()
  {
      Actor poin=getOneIntersectingObject(tembok.class); if(getY()<=getImage().getHeight()/2){
                                                                                               y=y+1;
                                                         }
      if(poin !=null){((bg)getWorld()).tambah(); //jika subclass ball menabrak tembok dan pecah, akan ditambahkan poinnya getWorld().removeObject(poin);
      }
  }
  public void pemain()
  {
    Actor box=getOneIntersectingObject(player.class);if(box !=null){
                                                                     y=y-1;
                                                     }
   if(getY()>=getWorld().getHeight()-getImage().getHeight()/2){
                                                              Greenfoot.stop();((bg)getWorld()).selesai(); //digunakan untuK memanggil method selesai yang berada di subclass bg (World classes)
   }
  }
}