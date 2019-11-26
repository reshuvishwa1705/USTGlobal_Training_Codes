package com.ustglobal.objectclass.instanceofkey;

public class USBPort {

	public static void connect(Object o) {
		if(o instanceof PenDrive) {
			PenDrive p=(PenDrive) o;
			p.read();
			p.write();
		}
		else if(o instanceof Mouse) {
			Mouse m=(Mouse) o;
			m.scroll();
			m.click();
		}
		else {
			System.out.println("No choice");
		}
	}
}
