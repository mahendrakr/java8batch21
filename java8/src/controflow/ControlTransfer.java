package controflow;
/**
 * break:You can use break inside switch or loop only.
 * continue :You can use continue inside loop only.
 * @author Yashwani
 *
 */
public class ControlTransfer {

	public static void main(String[] args) {
	for(int i=0;i<10;i++) {
		if(i>5) 
			break;
		System.out.println(i);
		
	}
	System.out.println("bye");
	}

}
