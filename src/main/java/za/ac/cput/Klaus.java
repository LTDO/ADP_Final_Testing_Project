/**
 * Klaus Traubner
 * 218009496
 * 1 April 2021
 */

package za.ac.cput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Klaus extends JFrame implements ActionListener {

    private JPanel panelN, panelS, panelE, panelW;
    private JTextField txtName;
    private JButton btnGenerate, btnReset, btnExit;
    private Font ft;
    private JLabel lblName;

    public static String[] name = new String[5];

    public Klaus (){

        super("Random Name Generator");

        panelN = new JPanel ();
        panelS = new JPanel ();
        panelE = new JPanel ();
        panelW = new JPanel ();

        lblName = new JLabel("Name: ");
        txtName = new JTextField ();

        btnGenerate = new JButton("Generate");
        btnExit = new JButton("Exit");
        btnReset = new JButton("Reset");

        ft = new Font ("Arial", Font.PLAIN, 24);

    }

    public void setGUI(){

        name[0] = "John";
        name[1] = "Ernest";
        name[2] = "Matthew";
        name[3] = "Belinda";
        name[4] = "Nicole";

        panelN.setLayout(new GridLayout(2, 3));
        panelS.setLayout(new GridLayout(2, 3));
        panelE.setLayout(new GridLayout(2, 3));
        panelW.setLayout(new GridLayout(2, 3));

        txtName.setFont(ft);
        btnExit.setFont(ft);
        btnGenerate.setFont(ft);
        btnReset.setFont(ft);

        panelN.add(lblName);
        panelN.add(txtName);
        panelS.add(btnExit);
        panelS.add(btnGenerate);
        panelS.add(btnReset);

        this.add(panelN, BorderLayout.NORTH);
        this.add(panelS, BorderLayout.SOUTH);
        this.add(panelE, BorderLayout.EAST);
        this.add(panelW, BorderLayout.WEST);

        btnGenerate.addActionListener(this);
        btnReset.addActionListener(this);
        btnExit.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Generate")) {
            txtName.setText(name[0]);
        } else if (e.getActionCommand().equals("Reset")) {
            txtName.setText("");
        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public JButton getBtnExit() {
        return btnExit;
    }

    public void setBtnExit(JButton btnExit) {
        this.btnExit = btnExit;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public void setTxtName(JTextField txtName) {
        this.txtName = txtName;
    }

    public static void main(String[] args) {
        new Klaus().setGUI();

    }

}