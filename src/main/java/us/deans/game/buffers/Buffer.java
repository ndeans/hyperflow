package us.deans.game.buffers;

public interface Buffer {

    public int getSize();
    public void setSize(int size);
    public int getLoad();
    public void setLoad(int size);
    public long getId();
    public long getPortIn();
    public long getPortOut();

}
