package org.example;

import java.util.LinkedList;

public class Team {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("A name should not be empty");
        }
    }

    private LinkedList<Player> players = new LinkedList<Player>();//list whit number of  players in the team

    public Team(String name) {//team constructor
        setName(name);
    }

    public void add(String name, int endurance, int sprint, int dribble, int passing, int shooting) {//method who adds player
        Player player = new Player(name, endurance, sprint, dribble, passing, shooting);
        players.add(player);
    }

    public void remove(String name) {//method that removes player if there is one in the player list
        Player playerToRemove = null;

        for (Player player : players) {
            if (player.getName() == name) {
                playerToRemove = player;
                break;
            }
        }

        if (playerToRemove == null) {
            System.out.printf("Player %s is not in %s team", name, this.name);
        } else {
            players.remove(playerToRemove);
        }
    }

    public int teamAverageSkill() {//method that calculate average skill of team
        int average = 0;
        if (!players.isEmpty()) {
            for (Player player:players) {
                average += player.overallSkills();
            }
            average = average / players.size();
        }
        return average;
    }
}

