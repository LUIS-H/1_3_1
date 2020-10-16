package com.luish.ventanaboton;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

/**
 * Hola
 *
 * @author Luis
 */

class EscuchadorBoton implements ActionListener {

    JLabel etiqueta;

    public EscuchadorBoton(JLabel etiq) {
        this.etiqueta = etiq;
    }

    public void actionPerformed(ActionEvent e) {
        etiqueta.setText("Botón Pulsado: " + new Date());
    }
}

public class VentanaBoton extends JFrame {

    JPanel panelBoton;
    JLabel etiqueta;
    JButton boton;

    public VentanaBoton() {
        etiqueta = new JLabel();
        panelBoton = new JPanel();
        boton = new JButton("Pulsa aquí");
        panelBoton.add(boton);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(etiqueta, "North");
        this.getContentPane().add(panelBoton, "South");
        EscuchadorBoton escuchador = new EscuchadorBoton(etiqueta);
        boton.addActionListener(escuchador);
        this.setSize(300, 100);
        this.setTitle("Ejemplo de un botón con Evento");
        this.show();
    }

    public static void main(String[] args) {
        new VentanaBoton();
    }

}
