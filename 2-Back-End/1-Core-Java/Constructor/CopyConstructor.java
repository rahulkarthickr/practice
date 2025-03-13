class Constructor {
	final int a;

	Constructor() {
		this(500);
	}

	Constructor(int a) {
		this.a = 200;
		System.out.println(a);
	}

	void method1() {
		System.out.println("method one");
	}

	void method2() {
		System.out.println("method two");
	}
}

class CopyConstructor {
	CopyConstructor(Constructor ob) {
		ob.method1();
		ob.method2();
	}

	public static void main(String[] args) {
		Constructor ob = new Constructor();
		CopyConstructor obj = new CopyConstructor(ob);
		System.out.println(obj);
	}
}