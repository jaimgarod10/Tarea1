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

        marco = new JFrame("Componentes ");
        panel = new JPanel();
        boton1 = new JButton("Limpiar ");
        boton2 = new JButton("Pulsar ");
        etiqueta1 = new JLabel();
        lineaDeTexto1 = new JTextField();
        etiqueta2 = new JLabel();
        lineaDeTexto2 = new JTextField();
        areaTexto = new JTextArea();

        marco.setBounds(0, 0, 600, 400);
        panel.setSize(600, 400);
        etiqueta1.setText("Nombre ");
        lineaDeTexto1.setSize(100, 50);
        lineaDeTexto1.setText("      ");
        etiqueta2.setText("Password ");
        lineaDeTexto2.setSize(100, 50);
        lineaDeTexto2.setText("      ");
        areaTexto .setSize(400,200);

        panel.add(boton1, Component.BOTTOM_ALIGNMENT);
        panel.add(boton2);
        panel.add(etiqueta1);
        panel.add(lineaDeTexto1);
        panel.add(etiqueta2);
        panel.add(lineaDeTexto2);
        panel.add(areaTexto);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

}
