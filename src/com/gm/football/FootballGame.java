package com.gm.football;

import java.util.ArrayList;
import java.util.List;

public class FootballGame {
    public static final String A = "A";
    public static final String B = "B";

    private List<Observer> observers;

    public FootballGame () {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    private void notifyObservers(String team) {
        for (Observer observer : observers) {
            if (observer != null)
                observer.notifyObserver(team);
        }
    }

    public void removeObserver(Observer observer) {
        if (observer != null && observers != null)
            observers.remove(observer);
    }

    public void teamAWin() {
        notifyObservers(A);
    }

    public void teamBWin() {
        notifyObservers(B);
    }
}
