package behavioral.chain_of_responsibility.concreate_handler;

import behavioral.chain_of_responsibility.handler.Processor;

public class NegativeProcessor implements Processor {
    final private Processor processor;

    public NegativeProcessor(Processor processor){
        this.processor = processor;
    }

    @Override
    public void process(Number request) {
        if(request.doubleValue() < 0){
            System.out.println("NegativeProcessor: " + request.toString());
        } else if(processor != null){
            processor.process(request);
        }
    }
    
}