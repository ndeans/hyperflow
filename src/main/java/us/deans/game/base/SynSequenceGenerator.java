package us.deans.game.base;

public class SynSequenceGenerator implements SequenceGenerator {

    private long value = 1;

    @Override
    public synchronized long getNext() {
        return value++;
    }
}
