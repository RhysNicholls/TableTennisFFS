/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis201516;

import java.util.ArrayList;

/**
 *
 * @author jin
 */
public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();
    
     public Team(String name) {
        this.name = name;
   
    }
   public void addMember(Player p) {
        players.add(p);
   }
   
   public boolean isPlayerValid(String playerName) {
        return players.contains(new Player(playerName));
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
      public Player getPlayer(String playerName) {
        int i = players.indexOf(new Player(playerName));
        if (i > -1) {
            return players.get(i);
        }
        return null;

    }
      
      public String getName() {
        return name;
    }
      
      public ArrayList<Player> getPlayers() {
        return players;
    }
      
     @Override
    public String toString() {
        return  name;
    }
    
   
}

