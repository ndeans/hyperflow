package us.deans.game.base;

public class BasicComponent implements Component {

    private long id;
    private String type;
    private String owner;

    public BasicComponent(long id, String type, String owner) {
        this.id = id;
        this.type = type;
        this.owner = owner;
    }

    @Override
    public long getId() {
        return id;
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
}
