package com.gm.football;

public class ScoreBoard implements Observer{

    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    public String notifyObserver(String team) {
        if ("A".equals(team)) {
            scoreA++;
        } else if ("B".equals(team)) {
            scoreB++;
        }
        return toString();
    }

    @Override
    public String toString() {
        return scoreA + ":" + scoreB;
    }
}
