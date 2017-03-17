package com.maxdota.androidtestingexample;

import com.maxdota.androidtestingexample.model.TModel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nguyen Hong Ngoc on 15/03/2017.
 */

public class TModelUnitTest {
    private TModel mTModel;

    @Before
    public void initModel() {
        mTModel = new TModel();
    }

    @Test
    public void doubleResultOf2_is4() throws Exception {
        assertEquals(mTModel.getDoubleResult(2), 4);
    }

    @Test
    public void doubleResultOf4_is8() throws Exception {
        assertEquals(mTModel.getDoubleResult(4), 8);
    }

    @Test
    public void doubleResultOf0_is0() throws Exception {
        assertEquals(mTModel.getDoubleResult(0), 0);
    }

    @Test
    public void doubleResultOf0_fail() throws Exception {
        assertEquals(mTModel.getDoubleResult(0), 0);
    }
}
