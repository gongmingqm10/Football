package com.gm.football;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class FootballGameTest {

    @Mock
    private Observer observer;

    private FootballGame footballGame;


    @Before
    public void setUp() throws Exception{
        initMocks(this);
        footballGame = new FootballGame();
    }

    @Test
    public void shouldReporterNotifiedWhenTeamAWin() {
        footballGame.addObserver(observer);
        footballGame.teamAWin();
        verify(observer).notifyObserver(FootballGame.A);
    }

    @Test
    public void shouldReporterNotifiedWhenTeamBWin() {
        footballGame.addObserver(observer);
        footballGame.teamBWin();
        verify(observer).notifyObserver(FootballGame.B);
    }

    @Test
    public void shouldNotNotifyReporterWhenReporterLeft() {
        footballGame.addObserver(observer);
        footballGame.removeObserver(observer);
        footballGame.teamAWin();
        verify(observer, never()).notifyObserver(FootballGame.A);
    }


}