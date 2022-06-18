import greenfoot.*;

/**
 * Write a description of class bg here.
 * 
 * @author (Muamar Zidan Tri Antoro) 
 * @version (trial)
 */
public class bg extends World
{
  Counter counter = new Counter("Nilai Skor Anda: ");
  skor skor = new skor();
  player player = new player();
  ball ball = new ball();
  tembok tembok = new tembok();
  tembok tembok1 = new tembok();
  tembok tembok2 = new tembok();
  tembok tembok3 = new tembok();
  tembok tembok4 = new tembok();

    /**
     * Constructor for objects of class bg.
     * 
     */
    public bg()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setPaintOrder(Counter.class, player.class, skor.class, tembok.class, ball.class);
        addObject(counter,155,380); //meletakkan posisi caption skor
        addObject(player,321,360); //meletakkan posisi tembok pemantul
        addObject(ball,320,335); //meletakkan posisi bola
        addObject(tembok,100,35); //meletakkan posisi tembok
        addObject(tembok1,170,75); //meletakkan posisi tembok
        addObject(tembok2,200,135); //meletakkan posisi tembok
        addObject(tembok3,400,135); //meletakkan posisi tembok
        addObject(tembok4,500,35); //meletakkan posisi tembok
        
        prepare();
    }
    public void act(){
        if(Greenfoot.getRandomNumber(1000)<4){
                                              addObject(new tembok(),Greenfoot.getRandomNumber(100),Greenfoot.getRandomNumber(170)); //menampilkan class tembok agar tampil secara acak
                                            }  
                                            
                                             if(Greenfoot.isKeyDown("space")){ //menggunakan tombol spasi untuk menghentikan sementara game
                                                Greenfoot.stop();
                                            }         
    }
    
    public void tambah(){
     counter.add(5);
    }
    /**
     * Called when game is up. Stop running and display 
     */
    public void selesai()
        {
         addObject(new skor(counter.getValue()), getWidth()/2,getHeight()/2); //menampilkan pesan "Game Over dan skor terakhir yang diperoleh"
        }
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
     private void prepare()
    {
    }
}