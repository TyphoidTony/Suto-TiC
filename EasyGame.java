import java.util.Random;

/**
 * Created on 10/26/2015.
 * Created by Anthony Soto
 */

public class EasyGame {

    private int xPos;
    private int yPos;


    public void rolls(){
        Random roll = new Random();
        int x = roll.nextInt(3);
        int y = roll.nextInt(3);
        setPos(x, y);
    }

    public int getXPos(){
        return xPos;
    }

    public int getyPos(){
        return yPos;
    }

    public void setPos(int x, int y){
        xPos = x;
        yPos = y;
    }

}
