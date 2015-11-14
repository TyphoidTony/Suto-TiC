import javax.swing.*;
/**
 * Created on 11/10/2015.
 * Created by Anthony Soto
 * Class is going to be used for initializing the pictures
 * from the assets directory to make the game look nicer
 * pictures from:
 * https://pixabay.com/en/users/OpenClipartVectors-30363/
 */
public class GraphicalAssets{

    public ImageIcon getLetterX(){
        ImageIcon icon =  new ImageIcon(getClass().getClassLoader()
                .getResource("assets/LetterX.PNG"));//TODO For learning purposes I should look into how this works
        return icon;
    }

    public ImageIcon getLetterO(){
        ImageIcon icon =  new ImageIcon(getClass().getClassLoader()
                .getResource("assets/LetterO.PNG"));
        return icon;
    }
}
