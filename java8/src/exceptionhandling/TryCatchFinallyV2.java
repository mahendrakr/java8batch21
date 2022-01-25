package exceptionhandling;
  
public class TryCatchFinallyV2 {
	 public static int m1() {
		   int a = 10;
		   try {
			   ++a;
			   System.out.println(a/0);
			   a++;
		   }
		   catch(Exception e) {
			   a++;
			   return a;
		   }
	//	   finally {
	//		   a++;
		//	   return a;
		//   }
		   a++;
		   return a;
	   }
	 public static void main(String[] args) {
		int m1 = m1();
		System.out.println(m1);
	}
  
}
