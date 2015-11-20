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

    /**
     * @param gameBoard parameter that passes the gameBoard to this method
     * @param pX the players current X position on the board
     * @param pY the players current Y position on the board
     *
     *           Over all this method is going to be a somewhat brute force
     * and a somewhat simple attempt at trying to prevent the player from
     * winning the game. NOTE! THIS SHOULD NOT BE TRYING TO WIN THE GAME EVER!
     */
    public void search(String[][] gameBoard, int pX, int pY){

        if(gameBoard[1][1].equals("x")){
            rCorner();
        }

    }

    //Random corner square.
    private void rCorner(){
        Random rn = new Random();
       int roll = rn.nextInt(3);

        if(roll==0){
            setPos(0,0);
        }else if(roll==1){
            setPos(0,2);
        }else if(roll==2){
            setPos(2,0);
        }else if(roll==3){
            setPos(2,2);
        }
    }



}
