import java.util.Random;

/**
 * Created on 10/26/2015.
 * Created by Anthony Soto
 */

public class EasyGame implements BasicGameLogic {

    private int x;
    private int y;

    @Override
    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void mkRand(){
        Random roll = new Random();
        int x = roll.nextInt(3);
        int y = roll.nextInt(3);
        setPos(x, y);
    }

}
