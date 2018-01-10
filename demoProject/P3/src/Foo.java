
public class Foo {

	/*private Foo() {
		System.out.println("Inside private Constructor");
	}*/
	
	public Foo() {
		System.out.println("public constructor");
	}
	
	private String s;

	public String animal;

	public int i;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void m1() {
		System.out.println("Inside M1");
	}

	public void m2(int i) {
		System.out.println("Inside M2");
	}

	private void m3() {
		System.out.println("Inside M3");
	}
	public static void main(String[] args) {
		Foo foo = new Foo();
		
	}
	
	
	
	
}
