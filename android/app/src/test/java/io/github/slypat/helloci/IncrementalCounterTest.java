package io.github.slypat.helloci;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class IncrementalCounterTest {

    private IncrementalCounter counter;

    @Before
    public void setUp() {
        counter = new IncrementalCounter();
    }

    @Test
    public void counterStartsAtZero() {
        assertThat(counter.getCount(), equalTo(0));
    }

    @Test
    public void counterIsIncrementedByOneOnIncrementCall() {
        counter.increment();

        assertThat(counter.getCount(), equalTo(1));
    }

    @Test
    public void counterIsIncrementedByOneOnEachIncrementCall() {
        counter.increment();
        counter.increment();

        assertThat(counter.getCount(), equalTo(2));
    }
}
