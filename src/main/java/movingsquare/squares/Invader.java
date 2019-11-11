package movingsquare.squares;

import processing.core.PApplet;
import processing.core.PImage;

import javax.swing.*;

public class Invader extends Square {

    private PImage[] img;
    private int damage;
    private int blood;
    private int photo_index;
    private int type; // normal : 0; high attacked 1; high blood 2;
    private boolean isalive;
    public Invader(PImage[] img,int x, int y, int width, int height,int blood, int damage, int type,int[] velocity) {
        super(x, y, width, height, velocity);
        this.img = img;
        this.isalive = true;
        this.blood = blood;
        this.damage = damage;
        this.type = type;
        this.photo_index = 0;
    }

    public int getType(){
        return this.type;
    }


    public void getattacked(){
        this.blood -= 1;
        System.out.println("now blood is :" + this.blood);
        if (this.blood <=0 ){
            this.isalive = false;
            this.blood = 0;
        }
    }


    public int getDamage(){
        return this.damage;
    }

    public int getY(){
        return this.y;
    }
    public int[] getLocation(){
        return new int[]{x,y};
    }
    public void setAlive(boolean islive){
        this.isalive = islive;
    }

    public boolean isAlive(){
        return this.isalive;
    }

    public void automove(int hor_move,int down_move){
        this.x += hor_move*velocity[0];
        this.y += down_move*velocity[1];

    }

    public void setImgindex(int i){
        this.photo_index = i;
    }

    @Override
    public void draw(PApplet app) {
        app.image(img[photo_index], x, y, width, height);

    }
}
