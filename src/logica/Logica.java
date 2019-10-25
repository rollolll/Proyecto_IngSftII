/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import modelo.Join;
import modelo.Solicitud;

/**
 *
 * @author luisf
 */
public class Logica {  
    public static boolean canJoin(Solicitud a, Solicitud b, int m){
        return (b.getL() > a.getR() && b.getR() <= m) || 
                (a.getL() > b.getR() && a.getR() <= m);
    }
    
    public static Join join(Solicitud a, Solicitud b, int i, int j){
        Solicitud s;
        Join join;
        if(b.getL() > a.getR()) {
            s = new Solicitud(a.getL(), b.getR());
            join = new Join(i, j, s);
        } else {
            s = new Solicitud(b.getL(), a.getR());
            join = new Join(i, j, s);
        }
        return join;
    }
    
    public static Join betterJoin(Solicitud[] solicitudes, int m){  
        Join betterJoin = new Join(0,1,solicitudes[0]);
        for (int i = 0; i < solicitudes.length; i++) {
            for (int j = i+1; j < solicitudes.length; j++) {
                if(canJoin(solicitudes[i], solicitudes[j], m)){
                    Join join = join(solicitudes[i], solicitudes[j], i,j);
                    
                    int dif1 = (solicitudes[i].getR() - solicitudes[i].getL()) + 
                                (solicitudes[i].getR() - solicitudes[i].getL()) + 2;
                 
                    int dif2 = (solicitudes[betterJoin.getsA()].getR() - solicitudes[betterJoin.getsA()].getL()) + 
                                (solicitudes[betterJoin.getsB()].getR() - solicitudes[betterJoin.getsB()].getL()) + 2;
                    if(dif1 > dif2){
                        betterJoin = join;
                    }
                }
            }
        }
        return betterJoin;
    }
}
