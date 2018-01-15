package ch10.nested;

import ch10.nested.InstanceInnerTest.Inner;
import ch10.nested.StaticInnerTest.StaticInner;

public class OtherClass {
	public void instanceInnerTest() {
		InstanceInnerTest iit = new InstanceInnerTest();
		Inner inner = iit.new Inner();
		InstanceInnerTest.Inner inner2 = iit.new Inner();
	}
	
	public void staticInnerTest() {
		StaticInner sinner = new StaticInner();
	}
}
