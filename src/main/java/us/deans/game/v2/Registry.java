package us.deans.game.v2;

import us.deans.game.base.BasicComponent;
import us.deans.game.base.Component;
import us.deans.game.v2.adapters.BasicAdapter;
import us.deans.game.v2.buffers.BasicBuffer;
import us.deans.game.v2.engines.BasicEngine;

import java.util.ArrayList;
import java.util.List;

public class Registry {

    private List<BasicQueue> queueList;
    private List<BasicAdapter> connections;

    public static List<BasicBuffer> bufferList;
    public static List<BasicEngine> engineList;
    public static List<Component> componentList;

    public Registry() {
        componentList = new ArrayList<Component>();
        bufferList = new ArrayList<BasicBuffer>();
        engineList = new ArrayList<BasicEngine>();
        Component start_record = new BasicComponent(1000, "start_record", "game");
        componentList.add(start_record);
    }

    public long registerComponent(String type, String owner) {
        Component previous_record = componentList.get(componentList.size() - 1);
        long newId = previous_record.getId() + 1;
        Component component_record = new BasicComponent(newId, type, owner);
        componentList.add(component_record);
        return component_record.getId();
    }

    public void registerBuffer(BasicBuffer buffer) {
        bufferList.add(buffer);
    }

    public void registerEngine(BasicEngine engine ) {
        engineList.add(engine);
    }

}
