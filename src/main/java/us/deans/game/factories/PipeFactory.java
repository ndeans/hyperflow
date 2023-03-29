package us.deans.game.factories;

import us.deans.game.buffers.Buffer;
import us.deans.game.housing.BasicPipe;


public class PipeFactory {

    public BasicPipe getBasicPipe(int size) {

        BasicPipe pipe = new BasicPipe(size);
        Buffer buffer = pipe.getBufferList().get(0);
        long portIn = buffer.getPortIn();
        long portOut = buffer.getPortOut();
        String msg = "id:" + pipe.getId() + ", portIn:" + portIn + ", portOut" + portOut;
        System.out.println("created new pipe ... " + msg);
        return pipe;
    }

}
