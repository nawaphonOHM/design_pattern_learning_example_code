package structural.bridge.implementors.implementations;

import structural.bridge.implementors.Workshop;

public class Produce implements Workshop {

	@Override
	public void work() {
		System.out.print("Produced");
	}

}