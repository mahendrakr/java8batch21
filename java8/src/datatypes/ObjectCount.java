package datatypes;

public class ObjectCount {
	static int count;
	ObjectCount(){
		count = count+1;
		}
	public static void main(String[] args) {
		ObjectCount o1 = new ObjectCount();
		ObjectCount o2 = new ObjectCount();
		ObjectCount o3 = new ObjectCount();
		ObjectCount o4 = new ObjectCount();
		System.out.println(count);
	}
}
