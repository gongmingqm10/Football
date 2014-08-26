package com.gm.football;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.MockitoAnnotations.initMocks;

public class ReporterTest {

    private Reporter reporter;

    @Mock
    private FootballGame mockGame;

    @Before
    public void setUp() {
        initMocks(this);
        reporter = new Reporter();
    }

    @Test
    public void shouldReportWhenTeamAWin() {
        assertThat(reporter.notifyObserver(FootballGame.A), is("Team A win a goal"));
    }

    @Test
    public void shouldReportWhenTeamBWin() {
        assertThat(reporter.notifyObserver(FootballGame.B), is("Team B win a goal"));
    }

}