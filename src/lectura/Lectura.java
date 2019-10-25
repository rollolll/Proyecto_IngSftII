package lectura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Solicitud;

public class Lectura {
    //metodo para mostrar un mensaje
    public static void showMessage(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
    //metodo para leer un dato de tipo string y convertirlo a entero
    public static int readInteger(String mensaje){
        String N=JOptionPane.showInputDialog(mensaje);
        int n=Integer.parseInt(N);
        return n;
    }
    
    //metodo para leer un dato string y convertirlo a char
    public static char readChar(String mensaje){
        String N=JOptionPane.showInputDialog(mensaje);
        char  n= N.charAt(0);
        return n;
    }
    
    //metodo para leer un dato string y convertirlo a float
    public static float readFloat(String mensaje){
        String N=JOptionPane.showInputDialog(mensaje);
        float n= Float.parseFloat (N);
        return n;
    }
    
    //metodo para leer un dato string y convertirlo a long
    public static long readLong(String mensaje){
        String N=JOptionPane.showInputDialog(mensaje);
        long n= Long.parseLong(N);
        return n;
    }
    
    //metodo para leer un dato string y convertirlo a double
    public static double readDouble(String mensaje){
        String N=JOptionPane.showInputDialog(mensaje);
        double n= Double.parseDouble(N);
        return n;
    }   
    
    public static Solicitud[] readTextFile(String url, int Q){
        Solicitud[] solicitudes = new Solicitud[Q];
        try {
            String bfRead;
            BufferedReader bf = new BufferedReader(new FileReader(url));
            int count = 0;
            while((bfRead = bf.readLine()) != null){
                String[] read = bfRead.split(" ");
                int l = Integer.parseInt(String.valueOf(read[0]));
                int r = Integer.parseInt(String.valueOf(read[1]));
                solicitudes[count] = new Solicitud(l, r);
                count++;
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error con la ubicación del archivo de texto.");
        }
        return solicitudes;
    }
}
