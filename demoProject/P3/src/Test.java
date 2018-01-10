import java.lang.reflect.Constructor;


enum Color{
	Red,White,Black
}
public class Test {
	
	enum Day{
		MON,TUES,WED
	}
	
	public static void main(String[] args)  throws Exception{
		
	
	try {
		
		Day day = Day.MON;
		System.out.println(day);
		
		Color color = Color.Black;
		System.out.println(color);
		/*Constructor<Foo> constructor = Foo.class.getDeclaredConstructor(new Class[0]);
		constructor.setAccessible(true);
		Foo foo  = constructor.newInstance(new Object[0]);
		foo.m1();*/
		
		Foo foo = new Foo();
		Class c = foo.getClass();
		Constructor<Foo> constructor = c.getConstructor();
		System.out.println("ConsName is "+constructor.getName());
		
		
	} catch (Exception e) {
		System.out.println("No such Method");
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	}
}
