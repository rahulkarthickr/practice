class Constructor {
	String name;

	Constructor() {
		this("Unknown");
	}

	Constructor(String name) {
		this.name = name;
		System.out.println(name);
	}
}

class ChainConstructor extends Constructor {
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor("Rahul");
		System.out.println(obj.name);
		System.out.println(obj1.name);
	}
}
