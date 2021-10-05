package proyecto;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run(){
                    JFrame frame = new Ventana();
                    frame.setSize(580, 170);
                    frame.setVisible(true);

                }
        });
        int variable = 0;
    }
}