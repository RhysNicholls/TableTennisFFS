/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis201516;

import java.util.Objects;

/**
 *
 * @author jin
 */
public class Player {

    private String pname;// assume players have unique names

    public Player(String pname) {
        this.pname = pname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Player{" + "pname=" + pname + '}';
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Player) {

            return this.pname.equals(((Player) o).getPname());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.pname);
        return hash;
    }


}
