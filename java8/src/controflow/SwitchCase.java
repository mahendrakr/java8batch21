package controflow;
/**
 * ICEBSS
 * i- Integer/int
 * c- Character/char
 * e- Enum 
 * b- Byte/byte
 * s- Short/short
 * s- String 
 *
 */
public class SwitchCase {

	public static void main(String[] args) {
    //Rules
		byte b=40;
		final byte 	c=20;
		long l = 30;
		switch(b) {
		case 10:{
			System.out.println("Yashvani");
		break;
		}
		default :System.out.println("Aadi");
		case c:{
			System.out.println("Ankush");
		break;
		}
		case 30:{
			System.out.println("Kavya");
		break;
		}
		case 40:{
			System.out.println("Anushka");
		break;
		}
//		default :System.out.println("Aadi");
		
		}
		System.out.println("Out of switch block");
		
	}

}





























