import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flappybird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flappybird extends Actor
{
    private double g = 1;
    private int y = 200;
    private boolean haspressed = false;
    private boolean isalive = true;
    private boolean isacross = false;
    private boolean hasaddscore = false;
    public flappybird()
    {
        GreenfootImage myImage = getImage();
        int myNewMeight = (int)myImage.getHeight()/8;
        int myNewWidth = (int)myImage.getWidth()/8;
        myImage.scale(myNewWidth, myNewMeight);
    }
    /**
     * Act - do whatever the flapptbird wants to do. This method is colled when
     * the 'Act' or 'run' button gets pressed in the environment.
     */
    public void act()
    {
        //jika tekan spasi, koordinat y akan berkurang dan terbang ke atas
        if(spacePressed()){
            g = -2;
        }
        g +=0.1;//nilai g meningkat 0.1 setiap saat
        y +=g;//nilai y tidak berubah dengan kecepatan konstan
        setLocation(getX(), (int)(y));
        //jika menabrak pipa maka flappybird mati
        if(isTouchpipa()){
            isalive = false;
        }
        //pemberian suara saat game over
        if(isTouchpipa()){
            isalive = false;
        }
        //setelah jatuh atau menabrak pipa maka flappybird hilang
        if (!isalive){
            getWorld().addObject(new gameover(), 400, 170);
            getWorld().removeObject(this);
        }
        //penambahan skor setelah memlewati pipa dan pemberian suara
        if(!hasaddscore && isacross && isalive){
            
            score.add(1);
            
        }
        hasaddscore = isacross;
    }
    public boolean spacePressed(){
        boolean pressed = false;
        if (Greenfoot.isKeyDown("space")){
            if(!haspressed){//pemberian suara
                
                pressed = true;
            }
                haspressed = true;
            }else{
                haspressed = false;
            }
            return pressed;
        }
        //pemberian suara ketika menabrak pipa dan jatuh
    public boolean isTouchpipa(){ 
        isacross = false;
        for(pipa pipa : getWorld().getObjects(pipa.class)){
            if(Math.abs(pipa.getX() - getX()) < 69){
            if(Math.abs(pipa.getY() + 30 - getY()) > 37){
                
                isalive = false ;
            }
            isacross = true;
        
        }        
        
    }
    return !isalive;
 }
 }