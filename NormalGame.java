import java.util.Random;

/**
 * Created on 10/26/2015.
 * Created by Anthony Soto
 * Going to attempt to make a pseudo AI for my tic tac toe game
 * This 'AI' won't ever actually try to win but rather it will try to just cause a cat's eye every game.
 * In real terms there are only 8 possible winning scenarios in tic tac toe
 */

public class NormalGame implements BasicGameLogic{

    private int x;
    private int y;


    @Override
    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX(){
        return x;
    }

    @Override
    public int getY(){
        return y;
    }

    @Override
    public void mkRand(){

        Random roll = new Random();
        int x = roll.nextInt(3);
        int y = roll.nextInt(3);
        setPos(x, y);
    }


    private void searchWin(){
        /**
         * Need to continue working on this.
         * My plan is to have it follow the player for the first 2
         * turns. Then see where that player's likely going to do based on their over
         * all position(s) on the game board.
         *
         */
    }


}
