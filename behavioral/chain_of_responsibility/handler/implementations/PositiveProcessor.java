package behavioral.chain_of_responsibility.handler.implementations;

import behavioral.chain_of_responsibility.handler.Processor;

public class PositiveProcessor implements Processor {
    final private Processor processor;

    public PositiveProcessor(Processor processor){
        this.processor = processor;
    }

    @Override
    public void process(Number request){
        if(request.doubleValue() > 0){
            System.out.println("PositiveProcessor: " + request.toString());
        } else if(processor != null) {
            processor.process(request);
        }
    }
}