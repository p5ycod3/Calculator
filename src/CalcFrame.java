import javax.swing.*;
import java.awt.*;

/**
 * Created by psycode on 11.08.15.
 */
public class CalcFrame extends JFrame {
    CalcFrame() {
        setBounds(300, 300, 300, 300);
        setLayout(new BorderLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalcFrame();

    }

}

