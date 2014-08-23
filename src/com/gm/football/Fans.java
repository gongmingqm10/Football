package com.gm.football;

public class Fans implements Observer {

    private String side;
    private String team;


    public Fans(String side) {
        this.side = side;
    }

    @Override
    public void notifyObserver(String team) {
        this.team = team;
        react();
    }

    public String react() {
        return side.equals(team) ? "Yeah!!!" : "Damn it!!";
    }
}
