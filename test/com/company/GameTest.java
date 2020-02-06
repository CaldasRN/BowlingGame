package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    private GAME g = new GAME();

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }
    @Test
    public void GutterTest(){
        rollMany(20,0);
        assertEquals(0, g.Score());
    }
    @Test
    public void ScoreOnes() {
        rollMany(20,1);
        assertEquals(20, g.Score());
    }
    @Test
    public void ScorePerfect(){
        rollMany(20,10);
        assertEquals(300,g.Score());
    }
}
