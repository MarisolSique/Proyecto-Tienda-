
package interfaz;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class ReporteFacturas1 extends JFrame {


    private JMenuBar jMenuBar1 = new JMenuBar();
    private JMenu jMenu1 = new JMenu();

    public ReporteFacturas1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(605, 407));
        this.setJMenuBar(jMenuBar1);
        jMenu1.setText("jMenu1");
    
        setLocationRelativeTo(null);

    }

}
