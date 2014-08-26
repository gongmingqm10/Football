package com.gm.football;

public class Fans implements Observer {

    private String side;

    public Fans(String side) {
        this.side = side;
    }

    @Override
    public String notifyObserver(String team) {
        return side.equals(team) ? "Yeah!!!" : "Damn it!!";
    }

}
