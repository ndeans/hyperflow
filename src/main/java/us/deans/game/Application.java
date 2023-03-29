package us.deans.game;

import us.deans.game.base.SequenceGenerator;
import us.deans.game.base.SynSequenceGenerator;
import us.deans.game.factories.NodeFactory;
import us.deans.game.factories.PipeFactory;
import us.deans.game.housing.BasicNode;
import us.deans.game.housing.BasicPipe;

/**
 * Hello world!
 *
 */
public class Application
{

    public static SequenceGenerator nodeSeq = null;
    public static SequenceGenerator bufferSeq = null;
    public static SequenceGenerator pipeSeq = null;
    public static SequenceGenerator portSeq = null;

    public static void main( String[] args ) throws FlowException {
        System.out.println( "Hello World!" );

        nodeSeq = new SynSequenceGenerator();
        bufferSeq = new SynSequenceGenerator();
        pipeSeq = new SynSequenceGenerator();
        portSeq = new SynSequenceGenerator();

        PipeFactory pipeFactory = new PipeFactory();
        BasicPipe pipe1 = pipeFactory.getBasicPipe(1);
        BasicPipe pipe2 = pipeFactory.getBasicPipe(1);
        BasicPipe pipe3 = pipeFactory.getBasicPipe(2);

        NodeFactory nodeFactory = new NodeFactory();

        int[][] spec1 = {{10,0},{10,10}};
        int[][] spec2 = {{10,10},{10,0}};
        try {
            BasicNode node1 = nodeFactory.getBasicNode(spec1);
            BasicNode node2 = nodeFactory.getBasicNode(spec2);
        } catch (FlowException e) {
            throw new RuntimeException(e);
        }


    }
}
