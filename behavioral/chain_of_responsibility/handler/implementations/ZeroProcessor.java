package behavioral.chain_of_responsibility.handler.implementations;

import behavioral.chain_of_responsibility.handler.Processor;

public class ZeroProcessor implements Processor {
    final private Processor processor;

    public ZeroProcessor(Processor processor){
        this.processor = processor;
    }
    
    @Override
    public void process(Number request){
        if(request.doubleValue() == 0){
            System.out.println("ZeroProcessor: " + request.toString());
        } else if(processor != null){
            processor.process(request);
        }
    }
}