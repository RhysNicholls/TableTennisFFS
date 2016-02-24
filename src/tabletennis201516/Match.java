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
     int HomeWinCount = 0;
     int AwayWinCount = 0; 
        
        String input = .h1a1Field1.getText();
        getPoints(input);     
        Game h1a1f1 = new Game();
        h1a1f1.enterGameScore(a,b);
         if (h1a1f1.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(h1a1f1);
        
        input = h1a1Field2.getText();
        getPoints(input);     
        Game h1a1f2 = new Game();
        h1a1f2.enterGameScore(a,b);
        if (h1a1f2.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(h1a1f2);
        
        input = h1a1Field3.getText();
        getPoints(input);     
        Game h1a1f3 = new Game();
        h1a1f3.enterGameScore(a,b);
        if (h1a1f3.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(h1a1f3);
        
        

        input = h1a2Field1.getText();
        getPoints(input);     
        Game h1a2f1 = new Game();
        h1a2f1.enterGameScore(a,b);
        if (h1a2f1.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(h1a2f1);
        
        input = h1a2Field2.getText();
        getPoints(input);     
        Game h1a2f2 = new Game();
        h1a2f2.enterGameScore(a,b);
        if (h1a2f2.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(h1a2f2);
        
        input = h1a2Field3.getText();
        getPoints(input);     
        Game h1a2f3 = new Game();
        h1a2f3.enterGameScore(a,b);
        if (h1a2f3.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(h1a2f3);
        
        
        
        input = h2a1Field1.getText();
        getPoints(input);     
        Game h2a1f1 = new Game();
        h2a1f1.enterGameScore(a,b);
        if (h2a1f1.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(h2a1f1);
        
        input = h2a1Field2.getText();
        getPoints(input);     
        Game h2a1f2 = new Game();
        h2a1f2.enterGameScore(a,b);
        if (h2a1f2.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(h2a1f2);
        
        input = h2a1Field3.getText();
        getPoints(input);     
        Game h2a1f3 = new Game();
        h2a1f3.enterGameScore(a,b);
        if (h2a1f3.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(h2a1f3);
        
        
        input = h2a2Field1.getText();
        getPoints(input);     
        Game h2a2f1 = new Game();
        h2a2f1.enterGameScore(a,b);
        if (h2a2f1.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(h2a2f1);
        
        input = h2a2Field2.getText();
        getPoints(input);     
        Game h2a2f2 = new Game();
        h2a2f2.enterGameScore(a,b);
        if (h2a2f2.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(h2a2f2);
        
        input = h2a2Field3.getText();
        getPoints(input);     
        Game h2a2f3 = new Game();
        h2a2f3.enterGameScore(a,b);
        if (h2a2f3.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
       // System.out.println(h2a2f3);
        
        input = doubleField1.getText();
        getPoints(input);     
        Game d1 = new Game();
        d1.enterGameScore(a,b);
        if (d1.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(d1);
        
        input = doubleField2.getText();
        getPoints(input);     
        Game d2 = new Game();
        d2.enterGameScore(a,b);
        if (d2.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
       // System.out.println(d2);
        
        input = doubleField3.getText();
        getPoints(input);     
        Game d3 = new Game();
        d3.enterGameScore(a,b);
        if (d3.isHomeWin())
            HomeWinCount++;
         else
            AwayWinCount++;
        //System.out.println(d3);
        
        String SHomeWinCount = Integer.toString(HomeWinCount);
        String SAwayWinCount = Integer.toString(AwayWinCount);
        String teamTotalsValue = SHomeWinCount + ":" + SAwayWinCount;
        teamTotalsField.setText(teamTotalsValue);

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
