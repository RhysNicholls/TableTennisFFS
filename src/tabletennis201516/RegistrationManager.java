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
public class RegistrationManager {


    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Team> teams = new ArrayList<>();

    public void createAndAddTeam(Team t) {
        teams.add(t);
    }

    public Team getTeam(String teamName) {
        int index = teams.indexOf(new Team(teamName));

        if (index < 0) {
            return null;
        } else {
            return teams.get(index);
        }
    }

    public void regPlayerToTeam(Player p, Team t) {
        for (Team ti : teams) {
            if (ti.getName().equals(t.getName())) {
                ti.addMember(p);
                break;
            }
        }
        players.add(p);

    }

    public ArrayList<Team> getAllTeams() {
        return teams;
    }

    public ArrayList<Player> getAllPlayers() {
        return players;
    }

    public boolean isTeamValid(Team t) {
        return teams.contains(t);
    }
}
