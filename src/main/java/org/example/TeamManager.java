package org.example;

import java.util.HashMap;

public class TeamManager {//class that create team , add player , remove player

    private static HashMap<String, Team> teams = new HashMap<>();

    public static void createTeam(String name) {
        Team team = new Team(name);
        teams.put(name, team);
    }

    public static void addPlayerToTeam(String teamName, String playerName, int endurance, int sprint, int dribble, int passing, int shooting) {
        Team team = teams.get(teamName);
        if (team != null) {
            team.add(playerName, endurance, sprint, dribble, passing, shooting);
        } else {
            System.out.printf("Team %s does not exist", teamName);
        }
    }
    public static void removePlayerFromTeam(String teamName , String playerName){
        Team team = teams.get(teamName);
        if (team != null) {
            team.remove(playerName);
        } else {
            System.out.printf("Team %s does not exist", teamName);
        }
    }
    public static void teamAverageSkill(String teamName){
        Team team = teams.get(teamName);
        if (team != null) {
            System.out.println(teamName +" - "+team.teamAverageSkill());
        } else {
            System.out.printf("Team %s does not exist", teamName);
        }
    }
}


