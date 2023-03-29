package us.deans.game.housing;

import us.deans.game.FlowException;
import us.deans.game.buffers.BasicBuffer;
import us.deans.game.buffers.Buffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static us.deans.game.Application.nodeSeq;

public class BasicNode implements Housing {

    long id = 0;


    List<Buffer> bufferList = new ArrayList<>();
    Map<Long, Long> portMap = new HashMap<>();

    public BasicNode() {
        id = nodeSeq.getNext();
    }

    @Override
    public long getId() { return id; }

    public String getIdString() { return id + ""; }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public List<Buffer> getBufferList() {
        return bufferList;
    }

    @Override
    public void setBufferList(List<Buffer> bufferList) throws FlowException {
        if (bufferList.size() < this.size) {
            this.bufferList = bufferList;
        }
        else {
            throw new FlowException("Insufficient Capacity");
        }
    }

    @Override
    public Buffer addBuffer(int size, int hold) throws FlowException {
        return null;
    }


    public void addBuffer(Buffer buffer) throws FlowException {
        if (this.bufferList.size() < this.size) {
            this.addBuffer(buffer);
        }
        else {
            throw new FlowException("Insufficient Capacity");
        }
    }

    @Override
    public void rmvBuffer(long bufferId) {
        for (Buffer buffer: bufferList) {
            if (buffer.getId() == bufferId) {
                bufferList.remove(buffer);
            }
        }
    }

}
