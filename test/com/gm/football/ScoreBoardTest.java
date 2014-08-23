package com.gm.football;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ScoreBoardTest {
    private ScoreBoard scoreBoard;

    @Before
    public void setUp() {
        scoreBoard = new ScoreBoard();
    }

    @Test
    public void shouldScoreWhenTeamWins(){
        assertThat(scoreBoard.toString(), is("0:0"));
        scoreBoard.notifyObserver("A");
        scoreBoard.notifyObserver("A");
        scoreBoard.notifyObserver("B");
        assertThat(scoreBoard.toString(), is("2:1"));
    }
}