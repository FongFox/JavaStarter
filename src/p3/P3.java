package p3;

import p1.P;

public class P3 extends P {

	private void test() {
		P firstObject = new P();
		firstObject.a = 10;
		firstObject.b = 10;
		c = 10; // protected
		firstObject.d = 10;
	}

	public static void main(String[] args) {

	}
}
