/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import static Assignment.Main.appointmentList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Pengb
 */
public class SearchResultUI extends JFrame{
    
    
    
    
     public static ArrayList<Appointment> readFiles(String file)
    {
        try
        {
            appointmentList = ReadWrite.readData(file);
            return appointmentList;
            
        }
        catch(FileNotFoundException fnfEx)
        {
            System.err.println("Problem with the data file: " + fnfEx.getMessage());
        }
        catch(ClassNotFoundException cnfEx)
        {
            System.err.println("Problem with class file: " + cnfEx.getMessage());
        }
        catch(NotSerializableException nsEx)
        {
            System.err.println("Class not serializable: "+ nsEx.getMessage());
        }
        catch(IOException ioEx)
        {
            System.err.println("Issue(s) reading files: "+ ioEx.getMessage());
        }
       
        return null;
    }
}
