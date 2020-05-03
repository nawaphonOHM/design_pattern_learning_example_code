package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.concreate_handler.NegativeProcessor;
import behavioral.chain_of_responsibility.concreate_handler.PositiveProcessor;
import behavioral.chain_of_responsibility.concreate_handler.ZeroProcessor;
import behavioral.chain_of_responsibility.handler.Processor;

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