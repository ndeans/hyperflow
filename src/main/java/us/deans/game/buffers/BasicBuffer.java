package us.deans.game.buffers;

import static us.deans.game.Application.bufferSeq;
import static us.deans.game.Application.portSeq;

public class BasicBuffer implements Buffer {

    private final long id;
    private int size;
    private int load;
    private final long portIn;
    private final long portOut;

    public BasicBuffer(int size, int load) {
        this.id = bufferSeq.getNext();
        this.size = size;
        this.load = load;
        this.portIn = portSeq.getNext();
        this.portOut = portSeq.getNext();
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public int getLoad() {
        return load;
    }

    @Override
    public void setLoad(int size) {
        this.load = size;
    }

    public long getId() { return id; }
    public String getIdStr() { return id + "";}

    public long getPortIn() { return portIn; }
    public long getPortOut() { return portOut; }

}
