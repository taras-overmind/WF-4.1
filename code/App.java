package com.code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton knopka;
    private JPanel panel1;
    private JTextArea textArea1;

    public App() {
        knopka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Triangle t1= new Triangle(6, 8, 10);

                JOptionPane.showMessageDialog(null, "Triangle(6, 8 ,10)"+'\n'+t1.calcPerimeter()+'\n'+t1.calcAngle(1, 2)+'\n'
                +t1.calcAngle(1, 3)+'\n'+t1.calcAngle(2, 3)+'\n');
                t1.change_side(7, 1);
                JOptionPane.showMessageDialog(null, "Triangle(7, 8 ,10)"+'\n'+t1.calcPerimeter()+'\n'+t1.calcAngle(1, 2)+'\n'
                        +t1.calcAngle(1, 3)+'\n'+t1.calcAngle(2, 3)+'\n');

                Equilateral_triangle t2= new Equilateral_triangle(5);
                JOptionPane.showMessageDialog(null, "Triangle(5, 5 ,5)"+'\n'+t2.calcPerimeter()+'\n'+t2.calcAngle(1, 2)+'\n'
                        +t2.calcAngle(1, 3)+'\n'+t2.calcAngle(2, 3)+'\n'+t2.calcSquare());


            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
