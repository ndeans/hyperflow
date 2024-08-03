package us.deans.game.v2.engines;

public interface Engine {

    String getCommodity();
    int setCommodity(String commodity);

    long getInput();
    int setInput(long input);

    long getOutput();
    int setOutput(long output);

    Double getRate();
    int setProductionRate(Double productionRate);

}
