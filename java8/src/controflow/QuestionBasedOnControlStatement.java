package controflow;

public class QuestionBasedOnControlStatement {

	public static void main(String[] args) {
    int a=10;
    int b =20;
    if(++a < ++b)
    	System.out.println(a+b);
        System.out.println(a);
        System.out.println(b);
        System.out.println("************");
        int x=10;
        int y=20;
        if(x++ > y++ && ++x > ++y)
        	System.out.println(x+y);
            System.out.println(x);
            System.out.println(y);
        
    
	}

}
