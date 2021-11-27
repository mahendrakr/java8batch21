package controflow;

public class LabelLoop {

	public static void main(String[] args) {
		y:
    for(int i=0;i<10;i++) {
    	System.out.println(i);
    	//if(i%2==0)
    		//continue;
    	//System.out.println("Yashvani");
    	for(int j=0;j<5;j++) {
    		if(j%3==0)
    			break y;
    		System.out.println("Anushka");
    		
    	}
    }
		System.out.println("Bye");
    	
	}

}
