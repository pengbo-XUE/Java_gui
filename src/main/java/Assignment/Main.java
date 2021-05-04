package Assignment;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pengb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Appointment> appointmentList = new ArrayList<>();
    public static final String file = "Appointment.bin";
    //static ArrayList<Student> stuList2 = new ArrayList<>();
    
    public static void main(String[] args) {
        AppointmentUI app = new AppointmentUI();
        app.setTitle("AppointmentUI");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300, 250);
        app.setVisible(true); 
//       
    }
    
//    public static Appointment createAppointment (String newName, int newDay, int newHour){
//        
//        Appointment newA = new Appointment();
//        newA.setName(newName);
//        newA.setDay(newDay);
//        newA.setHour(newHour);
//        return newA;
//    }
    
    
     
    
}
