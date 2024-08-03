package us.deans.game;

import us.deans.game.base.BasicBuilder;
import us.deans.game.base.SequenceGenerator;
import us.deans.game.v2.Registry;
import us.deans.game.v2.buffers.Buffer;
import us.deans.game.v2.engines.Engine;

import static us.deans.game.v2.Registry.bufferList;
import static us.deans.game.v2.Registry.engineList;

public class Application
{

    public static Registry gameRegistry;
    public static SequenceGenerator nodeSeq = null;
    public static SequenceGenerator bufferSeq = null;
    public static SequenceGenerator pipeSeq = null;
    public static SequenceGenerator portSeq = null;

    public static void main( String[] args ) throws FlowException {
        System.out.println("Starting Game...");

        gameRegistry = new Registry();
        BasicBuilder builder = new BasicBuilder();

        Buffer buffer1 = builder.buildBuffer("reserve", "none", "crude-1", 88.0, 88.0);

        System.out.println("Initial Map...");
        System.out.println(buffer1.toString());

        Buffer buffer2 = builder.buildBuffer("storage", "player1", "crude-1", 6.0, 0.0);
        Engine engine3 = builder.buildEngine("drill", "player1", "crude-1", 0, 0, 2.8);

        System.out.println(buffer2.toString());
        System.out.println(engine3.toString());

        System.out.println("Assets...");

        System.out.println("buffers...");
        for (Buffer b : bufferList) {
            System.out.println(b.toString());
        }

        System.out.println("engines...");
        for (Engine e : engineList) {
            System.out.println(e.toString());
        }

    }
}
