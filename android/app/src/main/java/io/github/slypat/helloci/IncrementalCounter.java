package io.github.slypat.helloci;

public class IncrementalCounter implements Counter {

    private int count = 0;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void increment() {
        count++;
    }
}
