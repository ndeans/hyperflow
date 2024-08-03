package us.deans.game.base;

import us.deans.game.v2.buffers.BasicBuffer;
import us.deans.game.v2.buffers.Buffer;
import us.deans.game.v2.engines.BasicEngine;
import us.deans.game.v2.engines.Engine;

import static us.deans.game.Application.gameRegistry;

public class BasicBuilder implements Builder {

    @Override
    public Buffer buildBuffer(String type, String owner, String commodity, Double capacity, Double stored) {
        BasicBuffer buffer = new BasicBuffer(type, owner);
        buffer.setCommodity(commodity);
        buffer.setCapacity(capacity);
        buffer.setStored(stored);
        gameRegistry.registerBuffer(buffer);
        return buffer;
    }

    @Override
    public Engine buildEngine(String type, String owner, String commodity, long input, long output, Double productionRate) {

        BasicEngine engine = new BasicEngine(type, owner);

        engine.setInput(1);
        engine.setOutput(1);
        engine.setCommodity(commodity);
        engine.setProductionRate(productionRate);
        return engine;
    }

}
