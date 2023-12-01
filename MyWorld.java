import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super( 800,400, 1); 
        addObject(new flappybird(), 200, 200);
        addObject(new pipa(), 300, 150);
        addObject(new pipa(), 600, 150);
        addObject(new score(), 900, 100);
        
    }
}
