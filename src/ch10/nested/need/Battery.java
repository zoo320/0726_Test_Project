package ch10.nested.need;

public class Battery {
	private int current;

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public void useBattery(int electric) {
		current -= electric;
	}

	public void charge(int electric) {
		current += electric;
	}
}