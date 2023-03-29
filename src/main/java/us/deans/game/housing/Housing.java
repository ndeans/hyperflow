package us.deans.game.housing;

import us.deans.game.FlowException;
import us.deans.game.buffers.Buffer;

import java.util.List;
import java.util.Map;

public interface Housing {

    long id = 0;
    int size = 0;
    List<Buffer> bufferList = null;
    Map<Long, Long> portMap = null;

    long getId();
    int getSize();
    List<Buffer> getBufferList();
    void setBufferList(List<Buffer> bufferList) throws FlowException;
    Buffer addBuffer(int size, int hold) throws FlowException;
    void rmvBuffer(long bufferId);


}
