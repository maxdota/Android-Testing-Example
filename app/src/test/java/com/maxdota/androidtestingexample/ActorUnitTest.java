package com.maxdota.androidtestingexample;

import com.maxdota.androidtestingexample.model.Actor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nguyen Hong Ngoc on 15/03/2017.
 */

public class ActorUnitTest {
    private Actor mActor;

    @Before
    public void initModel() {
        mActor = new Actor();
    }
    @Test
    public void numberToStringOf4_isCorrect() throws Exception {
        assertEquals(mActor.numberToString(4), "4");
    }

    @Test
    public void numberToStringOfMinus15_isCorrect() throws Exception {
        assertEquals(mActor.numberToString(-15), "-15");
    }
}
