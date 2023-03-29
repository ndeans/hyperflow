package us.deans.game.factories;

import us.deans.game.FlowException;
import us.deans.game.buffers.BasicBuffer;
import us.deans.game.buffers.Buffer;
import us.deans.game.housing.BasicNode;

public class NodeFactory {

    public BasicNode getBasicNode(int[][] specs) throws FlowException
    {
        String msg = "";
        Buffer buffer = null;
        BasicNode node = new BasicNode();
        System.out.println("created new node ... id: " + node.getId());

        for (int i = 0; i < specs.length; i++) {
            buffer = new BasicBuffer(specs[i][0],specs[i][1]);
            System.out.println("buffer: " + buffer.getId());
            System.out.println("portIn: " + buffer.getPortIn());
            System.out.println("portOut: " + buffer.getPortOut());
            System.out.println("size: " + buffer.getSize());
            System.out.println("load: " + buffer.getLoad());
        }
        return node;
    };

}
