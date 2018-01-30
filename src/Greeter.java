
public class Greeter {
	private String name;
	private int age;
public Greeter() {
	name = " ";
	age = 0;
}
public Greeter(String n, int a) {
	name = n;
	age = a;
}
public String toString() {
	return "Greeter - name: " + name + " age: " + age;
}

}
