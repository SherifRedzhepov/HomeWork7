package org.example;

public class Main {
    public static void main(String[] args) {
        TeamManager.createTeam("Barcelona");
        TeamManager.addPlayerToTeam("Barcelona","Messi",75,85 ,84 ,92 ,67);
        TeamManager.addPlayerToTeam("Barcelona","Gerard_Pique" , 95 ,82 ,82 ,89 ,68);
        TeamManager.removePlayerFromTeam("Barcelona", "Gerard_Pique");
        TeamManager.teamAverageSkill("Barcelona");
//        TeamManager.createTeam("Barcelona");
//        TeamManager.teamAverageSkill("Barcelona");
    }
}