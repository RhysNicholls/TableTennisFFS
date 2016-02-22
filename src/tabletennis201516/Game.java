/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis201516;

/**
 *
 * @author j-sa
 */
public class Game {

    private int hpoint, apoint;

    public Game() {
        hpoint = 0;
        apoint = 0;
    }


    public void enterGameScore(int hpoint, int apoint) {
        this.hpoint = hpoint;
        this.apoint = apoint;
    }

    public boolean isHomeWin() {
        return hpoint > apoint;
    }

    @Override
    public String toString() {
        return hpoint + ":" + apoint;
    }

}
