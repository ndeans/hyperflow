package us.deans.game.base;

public interface Component {

    long getId();

    String getType();
    void setType(String type);

    String getOwner();
    void setOwner(String owner);

}
