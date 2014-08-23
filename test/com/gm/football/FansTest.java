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
        fansA.notifyObserver(FootballGame.A);
        assertThat(fansA.react(), is("Yeah!!!"));
        assertThat(fansB.react(), is("Damn it!!"));
    }

    @Test
    public void shouldReactWhenTeamBWins() {
        fansB.notifyObserver(FootballGame.B);
        assertThat(fansA.react(), is("Damn it!!"));
        assertThat(fansB.react(), is("Yeah!!!"));
    }

}