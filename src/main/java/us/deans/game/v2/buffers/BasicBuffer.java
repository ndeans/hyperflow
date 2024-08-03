package us.deans.game.v2.buffers;

import us.deans.game.base.BasicBuilder;
import us.deans.game.base.Component;

import static us.deans.game.Application.gameRegistry;

public class BasicBuffer implements Component, Buffer {

    private long id;
    private String type;
    private String owner;

    private String commodity;
    private Double capacity;
    private Double stored;

    public BasicBuffer(String type, String owner) {
        this.id = gameRegistry.registerComponent(type, owner);
        this.type = type;
        this.owner = owner;
    }

    @Override
    public long getId() {
        return this.id;
    }

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
        return this.commodity;
    }

    @Override
    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    @Override
    public Double getCapacity() {
        return this.capacity;
    }

    @Override
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    @Override
    public Double getStored() {
        return this.stored;
    }

    @Override
    public void setStored(Double stored) {
        this.stored = stored;
    }

    @Override
    public String toString() {
        return "id: " + id + ", type: " + type + ", owner:  " + owner + ", commodity: " + commodity + ", capacity: " + capacity + ", reserved: " + stored + ".";
    }

}
