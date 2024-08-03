package us.deans.game.v2.engines;

import us.deans.game.base.Component;

import static us.deans.game.Application.gameRegistry;

public class BasicEngine implements Component, Engine {

    private long id;
    private String type;
    private String owner;

    private String commodity;
    private Double productionRate;
    private long input;
    private long output;

    public BasicEngine(String type, String owner) {
        this.id = gameRegistry.registerComponent(type, owner);
        this.type = type;
        this.owner = owner;
        gameRegistry.registerEngine(this);
    }

    @Override
    public long getId() { return id;  }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String getCommodity() {
        return commodity;
    }

    @Override
    public int setCommodity(String commodity) {
        this.commodity = commodity;
        return 0;
    }

    @Override
    public long getInput() {
        return input;
    }

    @Override
    public int setInput(long input) {
        this.input = input;
        return 0;
    }
    @Override
    public long getOutput() {
        return output;
    }

    @Override
    public int setOutput(long output) {
        this.output = output;
        return 0;
    }

    @Override
    public Double getRate() {
        return productionRate;
    }

    @Override
    public int setProductionRate(Double productionRate) {
        this.productionRate = productionRate;
        return 0;
    }

    @Override
    public String toString() {
        return "id: " + id + ", type: " + type + ", owner:  " + owner + ", commodity: " + commodity + ", productionRate: " + productionRate + ", input: " + input + ", output: " + output + ".";
    }

}
