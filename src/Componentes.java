import javax.swing.*;
import java.awt.*;

public class Componentes {

    JFrame marco;
    JPanel panel;
    JButton boton1;
    JButton boton2;
    JLabel etiqueta1;
    JLabel etiqueta2;
    JTextField lineaDeTexto1;
    JTextField lineaDeTexto2;
    JTextArea areaTexto;

    public Componentes() {

        marco = new JFrame("Componentes y layouts ");
        panel = new JPanel();
        boton1 = new JButton("Limpiar ");
        boton2 = new JButton("Pulsar ");
        etiqueta1 = new JLabel();
        lineaDeTexto1 = new JTextField();
        etiqueta2 = new JLabel();
        lineaDeTexto2 = new JPasswordField();
        areaTexto = new JTextArea();

        marco.setBounds(0, 0, 340, 400);
        panel.setSize(340, 400);
        etiqueta1.setText("Nombre ");
        lineaDeTexto1.setText("");
        etiqueta2.setText("Password ");
        lineaDeTexto2.setText("");
        areaTexto.setSize(400,200);
        areaTexto.setText(" Área de texto. ");

        panel.setLayout(null);
        panel.add(etiqueta1);
        etiqueta1.setBounds(40,40,100,30);
        panel.add(lineaDeTexto1);
        lineaDeTexto1.setBounds(160,40,120,30);
        panel.add(etiqueta2);
        etiqueta2.setBounds(40,80,100,30);
        panel.add(lineaDeTexto2);
        lineaDeTexto2.setBounds(160,80,120,30);
        panel.add(areaTexto);
        areaTexto.setBounds(40,120,240,120);
        panel.add(boton1);
        boton1.setBounds(40,120+120+20,100,30);
        panel.add(boton2);
        boton2.setBounds(180,120+120+20,100,30);
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);

    }

}
