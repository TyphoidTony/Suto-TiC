import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {

    public Game(){

            setSize(200,200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Suto-tic");
            setVisible(true);
            setResizable(false);
            setLocationRelativeTo(null);
            setLayout(new GridLayout(3,3));
            add(bOne());
            add(bTwo());
            add(bThree());
            add(bFour());
            add(bFive());
            add(bSix());
            add(bSeven());
            add(bEight());
            add(bNine());
            setLayout(new FlowLayout());
            add(turn());
    }


    private String gameState="x";
    private String board[][] = {{" "," "," "},{" "," "," "},{" "," "," "}};//initialized to make things easier.
    private JButton nOne = new JButton(" ");
    private JButton nTwo = new JButton(" ");
    private JButton nThree = new JButton(" ");
    private JButton nFour = new JButton(" ");
    private JButton nFive = new JButton(" ");
    private JButton nSix = new JButton(" ");
    private JButton nSeven = new JButton(" ");
    private JButton nEight = new JButton(" ");
    private JButton nNine = new JButton(" ");
    private JTextField turn= new JTextField(7);
    private int bCount =1;


private void changeGameState(String g){
    if(g.matches("x")){

        setGameState("o");

    }else if(g.matches("o")){

        setGameState("x");
    }
}

//is used within changeGameState don't use within actionListeners
private String getGameState(){
    return gameState;

}
    private void setGameState(String g){
        gameState =g;
    }



    private void winConditions(){



    //horizontal conditions
   if(board[0][0].matches("x") && board[0][1].matches("x") && board[0][2].matches("x") ||
           board[0][0].matches("o") && board[0][1].matches("o") && board[0][2].matches("x")){
            winPane();

      }else if(board[1][0].matches("x") && board[1][1].matches("x") && board[1][2].matches("x")||
                board[1][0].matches("o") && board[1][1].matches("o") && board[1][2].matches("o")){
                winPane();

       }else if(board[2][0].matches("x") && board[2][1].matches("x") && board[2][2].matches("x") ||
                     board[2][0].matches("o") && board[2][1].matches("o") && board[2][2].matches("o")){
                        winPane();
			
			    //start of vertical conditions
			    }else if(board[0][0].matches("x") && board[1][0].matches("x") && board[2][0].matches("x")||
				     board[0][0].matches("o") && board[1][0].matches("o") && board[2][0].matches("o")){
       winPane();

   }else if(board[0][1].matches("x") && board[1][1].matches("x") && board[2][1].matches("x") ||
                        board[0][1].matches("o") && board[1][1].matches("o") && board[2][1].matches("o")){
                                winPane();

                       }else if(board[0][2].matches("x") && board[1][2].matches("x") && board[2][2].matches("x") ||
                                board[0][2].matches("o") && board[1][2].matches("o") && board[2][2].matches("o")){
                                    winPane();

                              //diagonal condition
                             }else if(board[0][0].matches("x") && board[1][1].matches("x") && board[2][2]

                                    .matches("x")|| board[0][0].matches("o") && board[1][1].matches("o") && board[2][2]
                                            .matches("o")){
                                                        winPane();

                                 }else if(board[0][2].matches("x") && board[1][1].matches("x") && board[2][0]

                                       .matches("x")|| board[0][2].matches("o") && board[1][1].matches("o") && board[2][0]
                                                           .matches("o")){

                                                                  winPane();

                                             }else if(bCount ==9){

                                                        winPane();

   }

   }


    /**
     * @param cord for the row of the array
     * @param cord2 for the column of the array
     * @param bt passes a button for the actionListener to know which button should be changed to what state
     **/
    private void gameOptionsCall(int cord,int cord2, JButton bt){

        bt.setText(getGameState());
        setBoard(cord,cord2,getGameState());
        changeGameState(getGameState());
        changeTurn(getGameState());
        winConditions();

    }



    public void setBoard(int cord,int cord2,String gameState){
	board[cord][cord2]=gameState;

    }

    public JPanel bOne(){
        JPanel panel = new JPanel();
        nOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameOptionsCall(0,0,nOne);
                nOne.setEnabled(false);
                setbCount(1);
            }
        });
        panel.add(nOne);

        return panel;
    }

    public JPanel bTwo(){
        JPanel panel = new JPanel();
        nTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               gameOptionsCall(0,1,nTwo);
               nTwo.setEnabled(false);
                setbCount(1);
            }
        });
        panel.add(nTwo);
        return panel;
    }

    public JPanel bThree(){
        JPanel panel = new JPanel();
        nThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               gameOptionsCall(0,2,nThree);
               nThree.setEnabled(false);
                setbCount(1);
            }
        });
        panel.add(nThree);
        return panel;
    }

    public JPanel bFour(){
        JPanel panel = new JPanel();
        nFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameOptionsCall(1,0,nFour);
                nFour.setEnabled(false);
                setbCount(1);
            }
        });
        panel.add(nFour);
        return panel;
    }

    public JPanel bFive(){
        JPanel panel = new JPanel();
        nFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameOptionsCall(1,1,nFive);
                nFive.setEnabled(false);
                setbCount(1);
            }
        });
        panel.add(nFive);
        return panel;
    }

    public JPanel bSix(){
        JPanel panel = new JPanel();
        nSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameOptionsCall(1,2,nSix);
                nSix.setEnabled(false);
                setbCount(1);
            }
        });
        panel.add(nSix);
        return panel;
    }

    public JPanel bSeven(){
        JPanel panel = new JPanel();
        nSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameOptionsCall(2,0,nSeven);
                nSeven.setEnabled(false);
                setbCount(1);
            }
        });
        panel.add(nSeven);
        return panel;
    }

    public JPanel bEight(){
        JPanel panel = new JPanel();
        nEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameOptionsCall(2,1,nEight);
                nEight.setEnabled(false);
                setbCount(1);
            }
        });
        panel.add(nEight);
        return panel;
    }

    public JPanel bNine(){
        JPanel panel = new JPanel();
        nNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameOptionsCall(2,2,nNine);
                nNine.setEnabled(false);
                setbCount(1);
            }
        });
        panel.add(nNine);
        return panel;
    }

    public JPanel turn(){
        JPanel panel = new JPanel();
        panel.add(turn);
        turn.setEditable(false);
        turn.setText(getGameState()+"'s turn");
        return panel;
    }

    private void changeTurn(String t){
        turn.setText(t+"'s turn");
    }

    private void reset(){

        dispose();
        new Game();
    }


    private void winPane(){

        if(bCount==9){
            int op =  JOptionPane.showConfirmDialog(null,"Cats eye! No one wins  press okay to reset the game",
                    "Reset the game?",JOptionPane.OK_CANCEL_OPTION);

            if(op == JOptionPane.YES_OPTION){
                reset();
            }
        }else {

            int op = JOptionPane.showConfirmDialog(null, "The game is over! Press okay to reset the game",
                    "Reset the game?", JOptionPane.OK_CANCEL_OPTION);

            if (op == JOptionPane.YES_OPTION) {
                reset();
            }
        }
    }

    public void setbCount(int b) {
        System.out.println(bCount);
         bCount +=b;
    }

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Game();
            }
        });

    }
}
