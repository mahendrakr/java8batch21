package inheritence;
//@FunctionalInterface
public interface InterfaceDemo {
 //   int a;
 //   InterfaceDemo(){}
//	{}
	  static int a = 10;
//	  void m1();
	  default  void m2() {}
	  static int m3() {
		  return 10;
	  }
	  
}
 