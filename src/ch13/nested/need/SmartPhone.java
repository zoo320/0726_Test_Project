package ch13.nested.need;

class GpsModule{
	Battery battery;
	public GpsModule(Battery battery) {
		this.battery = battery;
	}
	public void useBattery() {
		battery.useBattery(5);
	}
}

public class SmartPhone {
	private Battery battery = new Battery();
	private GpsModule gps = new GpsModule(battery);
	private WiFiModule wifi = new WiFiModule();
	
	class WiFiModule{
		public void useBattery() {
			battery.useBattery(3);
		}
	}
}
