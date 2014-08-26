package com.gm.football;

public class Reporter implements Observer{

    @Override
    public String notifyObserver(String team) {
        if (team.equals(FootballGame.A)) {
            return "Team A win a goal";
        }
        return "Team B win a goal";
    }
}
