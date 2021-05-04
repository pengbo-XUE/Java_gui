/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import static Assignment.Main.appointmentList;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Pengb
 */
public class AddAppointmentUI extends JFrame implements ActionListener{

   
    /**
     * @param args the command line arguments
     */
    JLabel title, nameLbl, dayLbl, hourLbl;
    JTextField nameTxtf, dayTxtf, hourTxtf;
    JButton addBtn;
    public AddAppointmentUI(){
        setLayout(null);
        title = new JLabel("Add appointment");
        title.setFont(new Font("Serif", Font.BOLD, 20));
        
        nameLbl =new JLabel("Name:");
        dayLbl =new JLabel("Day:");
        hourLbl = new JLabel("Hour:");
        
        addBtn = new JButton("Add");
        
        nameTxtf = new JTextField();
        dayTxtf = new JTextField();
        hourTxtf = new JTextField();
        
        add(title);
        add(nameLbl);
        add(dayLbl);
        add(hourLbl);
        add(addBtn);
        add(nameTxtf);
        add(dayTxtf);
        add(hourTxtf);
        //add(hourLbl);
        title.setBounds(70, 10, 200, 40);
        nameLbl.setBounds(40, 60, 100, 30);
        dayLbl.setBounds(40, 110, 100, 30);
        hourLbl.setBounds(40, 160, 100, 30);
        nameTxtf.setBounds(100, 62, 150, 25);
        dayTxtf.setBounds(100, 112, 150, 25);
        hourTxtf.setBounds(100, 162, 150, 25);
        addBtn.setBounds(110, 220, 70, 27);
    }
    
   
    public Appointment createAppointment (String newName, int newDay, int newHour){
        
        Appointment newA = new Appointment();
        newA.setName(newName);
        newA.setDay(newDay);
        newA.setHour(newHour);
        return newA;
    }
 
    
     public static void saveFiles(String file)
    {
        try
        {
            ReadWrite.writeData(file, appointmentList);
        }
        catch(FileNotFoundException fnfEx)
        {
            System.err.println("Problem with the data file: " + fnfEx.getMessage());
        }
        catch(NotSerializableException nsEx)
        {
            System.err.println("Class not serializable: "+ nsEx.getMessage());
        }
        catch(IOException ioEx)
        {
            System.err.println("Issue(s) reading files: "+ ioEx.getMessage());
        }
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
       String inputName = dayTxtf.getText().trim();
       int inputHour = Integer.parseInt(hourTxtf.getText().trim());
       int inputDay = Integer.parseInt(dayTxtf.getText().trim());
       
       Appointment newapp = createAppointment(inputName,inputDay,inputHour);
       appointmentList.add(newapp);
       saveFiles("Appointment.bin");
       
    }

}
