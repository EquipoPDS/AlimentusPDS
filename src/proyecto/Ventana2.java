package proyecto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ventana2 extends JFrame{
    private JPanel Panel2;
    private JTextField Peso_input;
    private JTextField Altura_input;
    private JComboBox Genero_lista;
    private JLabel Caracteristicas_fisicas;
    private JLabel Peso;
    private JLabel Altura;
    private JLabel Genero;
    private JButton aceptarButton;
    private JComboBox Lista_enfermedades2;

    public Ventana2(){
        super("Caracteristicas fisicas");
        setContentPane(Panel2);

        Peso_input.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
            }
        });
        Altura_input.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
            }
        });
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String patron_peso = "[0-9]+[.][0-9]+";
                Pattern p = Pattern.compile(patron_peso);
                Matcher m = p.matcher(Peso_input.getText());

                //Altura
                String patron_altura = "[0-9]+";
                p = Pattern.compile(patron_altura);
                Matcher m1 = p.matcher(Altura_input.getText());



                if(m.matches() && m1.matches() && Genero_lista.getSelectedItem().toString().length() != 0 && Lista_enfermedades2.getSelectedItem().toString().length()!= 0){

                    double IMC = Double.parseDouble(Peso_input.getText()) / Math.pow(Double.parseDouble(Altura_input.getText())/100, 2) ;
                    System.out.println("soy pepe");
                    JOptionPane.showMessageDialog(null, "Su IMC es de: " + IMC);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
                }


                if(Lista_enfermedades2.getSelectedItem().equals("Diabetes")){
                    JFrame frame5 = new Diabetes();
                    frame5.setSize(360, 290);
                    frame5.setVisible(true);

                }
            }

        });


        Genero_lista.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
            }
        });
        Lista_enfermedades2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
            }
        });
    }

}
