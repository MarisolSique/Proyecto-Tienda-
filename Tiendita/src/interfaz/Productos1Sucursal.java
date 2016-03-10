
package interfaz;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Productos1Sucursal extends JFrame {


    public Productos1Sucursal() {
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
