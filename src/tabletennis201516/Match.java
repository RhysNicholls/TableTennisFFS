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

   public Match(String hteam, String ateam) {
     int HomeWinCount = 0;
     int AwayWinCount = 0; 
        
      

    }
   
   public void GetSet(){
       Set h1 = new Set();
       Set a1 = new Set();
       Set h2 = new Set();
       Set a2 = new Set();
       Set h3 = new Set();
       Set a3 = new Set();
   }
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

  

    public boolean isPlayed() {
        return true;
    }

    public void calculateScores() {
        String input =.h1a1Field1.getText();
        getPoints(input);     
        Game h1a1f1 = new Game();
        h1a1f1.enterGameScore(a,b);
         if (h1a1f1.isHomeWin())
            HomeWinCount++;
        
        input = doubleField1.getText();
        getPoints(input);     
        Game d1 = new Game();
        d1.enterGameScore(a,b);
        if (d1.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(d1);
        
   
        //System.out.println(d3);
        
        String SHomeWinCount = Integer.toString(HomeWinCount);
        String SAwayWinCount = Integer.toString(AwayWinCount);
        String teamTotalsValue = SHomeWinCount + ":" + SAwayWinCount;
        teamTotalsField.setText(teamTotalsValue);
    }



    public boolean isHomeWin() {
        return true;
    }
}
