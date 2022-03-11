package talktojava;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class MethodNames {
	public static void main(String[] args)   {
		Class<?> name =null;
		try {
			name = Class.forName("java.util.Set");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method[] methods = name.getDeclaredMethods();
		Stream<Method> stream = Arrays.stream(methods);
		stream.map(Method::getName).distinct().forEach(System.out::println);
		long count = Arrays.stream(methods).map(Method::getName).count();
		System.out.println(count);
		
	}
}
