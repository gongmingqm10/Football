package com.gm.football;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FansTest {

    private Fans fansA;
    private Fans fansB;

    @Before
    public void setUp() {
        fansA = new Fans(FootballGame.A);
        fansB = new Fans(FootballGame.B);
    }

    @Test
    public void shouldReactWhenTeamAWins() {
        assertThat(fansA.notifyObserver(FootballGame.A), is("Yeah!!!"));
        assertThat(fansB.notifyObserver(FootballGame.A), is("Damn it!!"));
    }

    @Test
    public void shouldReactWhenTeamBWins() {
        assertThat(fansA.notifyObserver(FootballGame.B), is("Damn it!!"));
        assertThat(fansB.notifyObserver(FootballGame.B), is("Yeah!!!"));
    }

}