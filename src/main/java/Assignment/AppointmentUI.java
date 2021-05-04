/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pengb
 */
public class AppointmentUI extends JFrame implements ActionListener{
    JButton helpBtn, addAptBtn, searchApt;
    JLabel title,helpLbl, nameLbl, dayLbl, hourLbl;
    
    JPanel appointmentPnl;

    public AppointmentUI() {
        
        setLayout(null);
       // appointmentPnl = new JPanel();
        //add(appointmentPnl);
        //appointmentPnl.setLayout(null);
        title = new JLabel("Meeting Calendar");
        helpLbl = new JLabel("Enter or search appointments");
        title.setFont(new Font("Serif", Font.BOLD, 20));
        helpLbl.setFont(new Font("Serif", Font.BOLD, 12));
        helpBtn = new JButton("Help");
        addAptBtn = new JButton("Add Appointments");
        searchApt = new JButton("Search Appointments");
        
       
        add(title);
        add(helpLbl);
        add(helpBtn);
        add(addAptBtn);
        add(searchApt);
        title.setBounds(70, 10, 200, 40);
        helpLbl.setBounds(20, 60, 170, 20);
        helpBtn.setBounds(180, 60, 60, 20);
        addAptBtn.setBounds(50, 100, 200, 30);
        searchApt.setBounds(50, 150, 200, 30);
        //helpBtn.setSize(10,10);
        helpBtn.addActionListener(this);
        addAptBtn.addActionListener(this);
        searchApt.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == helpBtn)
        {
            JOptionPane.showMessageDialog(null, "helpful msg here", "Help", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(e.getSource() == addAptBtn)
        {   
            AddAppointmentUI app2 = new AddAppointmentUI();
            app2.setTitle("AppointmentUI2");
            app2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            app2.setSize(300, 300);
            app2.setVisible(true); 
        }
        
        else if(e.getSource() == searchApt)
        {
            
        }
        
    }
}
