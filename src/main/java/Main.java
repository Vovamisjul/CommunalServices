import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        super("Communal services");
        InitializeComponents();
    }

    public void InitializeComponents() {
        setBounds(100, 100, 200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
