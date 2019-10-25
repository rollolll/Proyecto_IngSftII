/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import lectura.Lectura;
import logica.Logica;
import modelo.Solicitud;
/**
 *
 * @author luisf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        try {
            int filas = Lectura.readInteger("Ingrese la cantidad de filasssss");
            int sillas = Lectura.readInteger("Ingrese la cantidad de sillas por fila");
            int numSolicitudes = Lectura.readInteger("Ingrese la cantidad de solicitudes");
            Solicitud[] solicitudes = Lectura.readTextFile("E:\\txt de prueba\\solicitudes.txt", numSolicitudes);
            
            for(int i = 0; i < solicitudes.length; i++) {
                if((i+1) == Logica.betterJoin(solicitudes, sillas).getsA()+1 ||
                        (i+1) == Logica.betterJoin(solicitudes, sillas).getsB()+1){
                    System.out.println("Solicitud "+(i+1)+": Fila A");
                } else {
                    System.out.println("Solicitud "+(i+1)+": Rechazada");
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }   
    }
    
}
