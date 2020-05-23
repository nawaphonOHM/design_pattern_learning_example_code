package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.handler.Processor;
import behavioral.chain_of_responsibility.handler.implementations.NegativeProcessor;
import behavioral.chain_of_responsibility.handler.implementations.PositiveProcessor;
import behavioral.chain_of_responsibility.handler.implementations.ZeroProcessor;

public class Client {

    public static void main(String[] args){
        final Processor processesChain;

        processesChain = new PositiveProcessor(new ZeroProcessor(new NegativeProcessor(null)));

        processesChain.process(90);
        processesChain.process(-50);
        processesChain.process(0);
        processesChain.process(91);
        processesChain.process(Integer.MAX_VALUE);
        processesChain.process(Integer.MIN_VALUE);
    }
}