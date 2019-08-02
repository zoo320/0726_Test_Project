package ch08.annotation;

class SuperClass{
	protected void someMethod() {}
}
public class SafeOverrideTest extends SuperClass{
	//@Override
	void someMeth0d() {}
	//The method someMeth0d() of type SafeOverrideTest must override or implement a supertype method
}