package com.maxdota.androidtestingexample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nguyen Hong Ngoc on 15/03/2017.
 */

public class TestModelUnitText {
    private TestModel mTestModel;

    @Before
    public void initModel() {
        mTestModel = new TestModel();
    }

    @Test
    public void doubleResultOf2_is4() throws Exception {
        assertEquals(mTestModel.getDoubleResult(2), 4);
    }

    @Test
    public void doubleResultOf4_is8() throws Exception {
        assertEquals(mTestModel.getDoubleResult(4), 8);
    }

    @Test
    public void doubleResultOf0_is0() throws Exception {
        assertEquals(mTestModel.getDoubleResult(0), 0);
    }
}
