package us.deans.game.v2.buffers;

public interface Buffer {

    String getCommodity();
    void setCommodity(String commodity);

    Double getCapacity();
    void setCapacity(Double capacity);

    Double getStored();
    void setStored(Double stored);


}
