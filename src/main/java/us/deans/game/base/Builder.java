package us.deans.game.base;

import us.deans.game.v2.buffers.Buffer;
import us.deans.game.v2.engines.Engine;

public interface Builder {
    Buffer buildBuffer(String type, String owner, String commodity, Double capacity, Double stored );
    Engine buildEngine(String type, String owner, String commodity, long input, long output, Double rate);
}
