package com.gm.football;

public class Reporter implements Observer{

    private String team;
    @Override
    public void notifyObserver(String team) {
        this.team = team;
        report();
    }

    public String report() {
        if (team.equals(FootballGame.A)) {
            return "Team A win a goal";
        }
        return "Team B win a goal";
    }
}
