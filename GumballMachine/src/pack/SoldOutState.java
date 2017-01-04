package pack;

public class SoldOutState implements State {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {

		System.out.println("You can not insert machine is old out ");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can’t eject, you haven’t inserted a quarter yet");
	}

	@Override
	public void trunCrank() {
		System.out.println("You turned, but there’s no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("No Gumball dispensed.");
	}

}
