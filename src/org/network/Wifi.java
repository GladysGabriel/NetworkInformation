package org.network;

public class Wifi {

	private void wifiName() {
		System.out.println("Realme");
	}
	public static void main(String[] args) {
		Wifi w= new Wifi();
		MobileData dn= new MobileData();
		Lan l= new Lan();
		Wireless wi= new Wireless();
		w.wifiName();
		dn.dataName();
		l.lanName();
		wi.modemName();
	}	
}
