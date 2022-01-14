/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaCliente;

import java.awt.*;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;
import javax.swing.*;


/**
 *
 * @author Cesar
 */
public class Sesion extends JFrame {
    JPanel jpnUsuario,jpnContraseña,jpnIngresar;
    JLabel lblIniciarSesion, lblUsario, lblContraseña;
    JTextField txtUsuario;
    JPasswordField PassContraseña;
    JButton btnIniciarSesion, btnCasa;

    public Sesion() {
        //usuario
        
        this.jpnUsuario = new JPanel(new FlowLayout());
        this.jpnUsuario.setBackground(new Color(102,0,0));
        this.lblUsario = new JLabel("Usuario :");
        this.lblUsario.setFont(new Font("times new roman",Font.ITALIC,18));
        this.lblUsario.setForeground(new Color(255,255,153));
        this.txtUsuario = new JTextField(15);
        this.jpnUsuario.add(this.lblUsario);
        this.jpnUsuario.add(this.txtUsuario);
        //contraseña
        this.jpnContraseña = new JPanel(new FlowLayout());
        this.jpnContraseña.setBackground(new Color(102,0,0));
        this.lblContraseña = new JLabel("Contraseña: ");
        this.lblContraseña.setFont(new Font("times new roman",Font.ITALIC,18));
        this.lblContraseña.setForeground(new Color(255,255,153));
        this.PassContraseña = new JPasswordField(15);
        this.jpnContraseña.add(this.lblContraseña);
        this.jpnContraseña.add(this.PassContraseña);
        //btn
        this.jpnIngresar = new JPanel(new FlowLayout());
        this.jpnIngresar.setBackground(new Color(102,0,0));
        this.btnIniciarSesion= new JButton ("Iniciar Sesión");
        this.btnIniciarSesion.setBackground(new Color(255,255,153));
        this.btnCasa = new JButton("▲Volver");
        this.btnCasa.setBackground(new Color(255,255,153));
        this.jpnIngresar.add(this.btnIniciarSesion);
        this.jpnIngresar.add(this.btnCasa);
       
        this.getContentPane().setLayout(new BorderLayout());
        add(jpnUsuario,BorderLayout.NORTH);
        add(jpnContraseña,BorderLayout.CENTER);
        add(jpnIngresar,BorderLayout.SOUTH);
    }

    public JPanel getJpnUsuario() {
        return jpnUsuario;
    }

    public void setJpnUsuario(JPanel jpnUsuario) {
        this.jpnUsuario = jpnUsuario;
    }

    public JPanel getJpnContraseña() {
        return jpnContraseña;
    }

    public void setJpnContraseña(JPanel jpnContraseña) {
        this.jpnContraseña = jpnContraseña;
    }

    public JPanel getJpnIngresar() {
        return jpnIngresar;
    }

    public void setJpnIngresar(JPanel jpnIngresar) {
        this.jpnIngresar = jpnIngresar;
    }

    public JLabel getLblIniciarSesion() {
        return lblIniciarSesion;
    }

    public void setLblIniciarSesion(JLabel lblIniciarSesion) {
        this.lblIniciarSesion = lblIniciarSesion;
    }

    public JLabel getLblUsario() {
        return lblUsario;
    }

    public void setLblUsario(JLabel lblUsario) {
        this.lblUsario = lblUsario;
    }

    public JLabel getLblContraseña() {
        return lblContraseña;
    }

    public void setLblContraseña(JLabel lblContraseña) {
        this.lblContraseña = lblContraseña;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JPasswordField getPassContraseña() {
        return PassContraseña;
    }

    public void setPassContraseña(JPasswordField PassContraseña) {
        this.PassContraseña = PassContraseña;
    }

    public JButton getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setBtnIniciarSesion(JButton btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public JButton getBtnCasa() {
        return btnCasa;
    }

    public void setBtnCasa(JButton btnCasa) {
        this.btnCasa = btnCasa;
    }
    
}
