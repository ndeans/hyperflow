package us.deans.game.housing;

import us.deans.game.FlowException;
import us.deans.game.buffers.BasicBuffer;
import us.deans.game.buffers.Buffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static us.deans.game.Application.pipeSeq;


public class BasicPipe implements Housing {

    long id = 0;
    long portIn = 0;
    long portOut = 0;
    List<Buffer> bufferList = null;
    Map<Long, Long> portMap = null;
    int size = 1;

    public BasicPipe(int size) {
        id = pipeSeq.getNext();
        bufferList = new ArrayList<>();
        Buffer buffer = new BasicBuffer(size, 0);
        // this.portIn = buffer.getPortIn();
        // this.portOut = buffer.getPortOut();
        bufferList.add(buffer);
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public int getSize() {
        return size;
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
        if (this.bufferList.size() < this.size) {
            Buffer buffer = new BasicBuffer(size, 0);
        }
        else {
            throw new FlowException("Insufficient Capacity");
        }
        return null;
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
