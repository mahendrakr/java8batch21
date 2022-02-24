package api;

import java.util.ArrayList;
import java.util.List;

/**
 * Advantage of generic concept :
 * 1. Type safety 
 * 2. Resolve class cast exception
 * Identifying generic :
 * if <>(diamond operator) is there then it is generic.
 * 
 * @author adity
 *
 */
public class Generic {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<>();
		List <Integer>al3=new ArrayList<>();
//		List <Number>al4=new ArrayList<Integer>(); // polymorphism concept is applicable to base type only not to parameter type.
		MyGeneric<Integer> mg=new MyGeneric<>();
		MyGeneric<Number> mg1=new MyGeneric<>();
		MyGeneric<String> mg2=new MyGeneric<>();
		MyGeneric<Long> mg3=new MyGeneric<>();
		MyGeneric<Double> mg4=new MyGeneric<>();
		// bounded generic type
		Test<Number> t=new Test<>();
		Test<Integer> t0=new Test<>();
//		Test<String> t1=new Test<>(); String not a type of number/boundation.
		Test<Long> t2=new Test<>();
		Test<Double> t3=new Test<>();
		Test1<InterF> t5= new Test1<>();
		Test1<Impl1> t6= new Test1<>();
		Test1<Impl2> t7= new Test1<>();
		Test2<String> ti= new Test2<>();
	}
}
