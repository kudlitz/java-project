import javax.swing.*;

public class GameWindow extends JFrame {

    public GameWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400, 400);
        setVisible(true);
        add(new Field());
    }

    public static void main(String[] args){
        GameWindow game = new GameWindow();
    }
}
