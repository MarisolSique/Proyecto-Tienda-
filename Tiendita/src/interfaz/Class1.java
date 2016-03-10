
package interfaz;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Class1 extends JFrame {


    public Class1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(605, 407));
        setLocationRelativeTo(null);

    }

}
