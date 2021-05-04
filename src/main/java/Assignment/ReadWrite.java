package Assignment;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pengb
// */
public class ReadWrite {

    /**
     * @param args the command line arguments
     */
    /**
     * 
     * @param fileName
     * @param list
     * @throws FileNotFoundException
     * @throws NotSerializableException
     * @throws IOException 
     */
    
    public static void writeData(String fileName, ArrayList<Appointment> list) throws
            FileNotFoundException, NotSerializableException, IOException
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        
        // dump the entire contents of the ArrayList to binary file
        oos.writeObject(list);

        oos.close();
    }
    
    /**
     * 
     * @param fileName
     * @return
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     * @throws NotSerializableException
     * @throws IOException 
     */
    
    public static ArrayList<Appointment> readData(String fileName) throws
            FileNotFoundException, ClassNotFoundException, NotSerializableException, IOException
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        
        ArrayList<Appointment> list = null;
        
        // read the entire file in one go
        list = (ArrayList<Appointment>) ois.readObject();
        ois.close();
        
        return list;
    }
    
}
