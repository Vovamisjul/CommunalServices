import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    private JPanel pnlMain;
    private JList listHouses;
    private JButton btnAddHouse;
    private JLabel lblDest;

    public Main() {
        btnAddHouse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                var frame = new JFrame("Adding house");
                frame.setContentPane(new HouseAdd().getPnlMain());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        var frame = new JFrame("Communal services");
        frame.setContentPane(new Main().pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
