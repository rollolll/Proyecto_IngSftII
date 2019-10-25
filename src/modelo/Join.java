/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author luisf
 */
public class Join {
    private int sA;
    private int sB;
    private Solicitud join;

    public Join() {
    }

    public Join(int sA, int sB, Solicitud join) {
        this.sA = sA;
        this.sB = sB;
        this.join = join;
    }

    public int getsA() {
        return sA;
    }

    public void setsA(int sA) {
        this.sA = sA;
    }

    public int getsB() {
        return sB;
    }

    public void setsB(int sB) {
        this.sB = sB;
    }

    public Solicitud getJoin() {
        return join;
    }

    public void setJoin(Solicitud join) {
        this.join = join;
    }
    
    
}
