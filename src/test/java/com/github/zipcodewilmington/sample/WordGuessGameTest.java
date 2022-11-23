package com.github.zipcodewilmington.sample;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordGuessGameTest {

    @Test
    void wordEngineTest1() {

        WordGuessGame gg = new WordGuessGame();

       boolean actual = gg.wordEngine("old","owl");
        boolean expected = false;
        Assert.assertEquals(actual, expected);

    }
    @Test
    void wordEngineTest2() {

        WordGuessGame gg = new WordGuessGame();

        boolean actual = gg.wordEngine("owl","owl");
        boolean expected = true;
        Assert.assertEquals(actual, expected);


    }

}