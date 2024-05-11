/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase.javase5thbatch.chapter25;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author macbook
 */
public class FirstAWTDemo extends Frame {

    public FirstAWTDemo() throws HeadlessException {
        super("Demo");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.out.println("Window close event");
                System.exit(0);
            }
        });
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setVisible(true);
        this.init();
    }
    void init()
    {
        Panel panel =new Panel();
        
        Label lblLabel = new Label("Name");
        panel.add(lblLabel);
        
        TextField txtName = new TextField(40);
        panel.add(txtName);
        
        Button btnOk = new Button("Ok");
        panel.add(btnOk);
        
        btnOk.addActionListener((ae)->{
            System.out.println("Btn Ok Click "+txtName.getText());
            JOptionPane.showMessageDialog(this, txtName.getText().toUpperCase());
        });
        this.add(panel);
    }
    public void paint(Graphics g)
    {
        System.out.println("Draw");
        g.drawString("Hello", 100, 200);
        g.drawArc(200, 200, 50, 50, 0, 360);
    }
    
    public static void main(String[] args) {
        new FirstAWTDemo();
    }
}
