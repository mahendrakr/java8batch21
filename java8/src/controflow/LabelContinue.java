package controflow;

public class LabelContinue {

	public static void main(String[] args) {
		int i=0;
		int j=3;
		x:
    for(System.out.println("Outer");i<2;System.out.println(++i +" I ")) {
    	for(System.out.println("Inner");j>0;System.out.println(j--+" J ")) {
    		System.out.println(j);
    		if(j%3==0)
    			continue x;
    		System.out.println("Done");
    		
    	}
    }
		System.out.println("Bye");
	}

}
