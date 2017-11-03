package ch06.method.call;

public class First {
	static int cv;				//①
	int iv;						//②
	static void cMethodA() {}	//③
	static void cMethodB() {}	//④
	void iMethodA() {}			//⑤
	void iMethodB() {}			//⑥
	void iMethodC() {}			//⑦
	void iMethodD(Second s) {}	//⑧
}

class Second{
	static void cMethod() {}	//⑨
	void iMethod() {}			//⑩
}


