package movingsquare.squares;

import processing.core.PApplet;
import processing.core.PImage;

public class Tank extends Square{
    private PImage img;
    boolean isalive;

    int Damage_accout = 0;
    public Tank(PImage img,int x, int y, int width, int height, int[] velocity) {
        super(x, y, width, height, velocity);
        this.img = img;
        isalive = true;
    }

    public int[] getlocation(){
        return new int[]{x,y};
    }

    public int getDamage_accout(){
        return this.Damage_accout;
    }
    public void setDamage_accout(int damage){
        Damage_accout += damage;
        System.out.println("---------------------------------------------------");
        if(Damage_accout > 2){
            Damage_accout =3;
            this.setislive(false);
        }
        System.out.println("be attacked-- HP :"+ (3- Damage_accout));

    }


    public boolean islive(){
        return  this.isalive;
    }
    public void setislive(boolean isalive){
        this.isalive = isalive;
    }


    public void move(int i) {
        this.x += i*velocity[0];
        if (this.x<180){
            this.x = 180;
        }else if(this.x>438){
            this.x = 438;
        };
    }


    @Override
    public void draw(PApplet app) {
        app.image(img, x, y, width, height);
    }
}
