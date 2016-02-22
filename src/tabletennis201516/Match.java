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
public class Match {

    private String hTeam, aTeam;
    private boolean played;
    private int hTeamWin, aTeamWin;

    public String gethTeam() {
        return hTeam;
    }

    public void sethTeam(String hTeam) {
        this.hTeam = hTeam;
    }

    public String getaTeam() {
        return aTeam;
    }

    public void setaTeam(String aTeam) {
        this.aTeam = aTeam;
    }

    public int gethTeamWin() {
        return hTeamWin;
    }

    public void sethTeamWin(int hTeamWin) {
        this.hTeamWin = hTeamWin;
    }

    public int getaTeamWin() {
        return aTeamWin;
    }

    public void setaTeamWin(int aTeamWin) {
        this.aTeamWin = aTeamWin;
    }

    public Match(String hteam, String ateam) {

    }

    public boolean isPlayed() {
        return true;
    }

    public void calculateScores() {

    }

    public void Match(String hteam, String ateam) {

    }


    public boolean isHomeWin() {
        return true;
    }
}
