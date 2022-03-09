package api;

import java.util.ArrayList;
import java.util.List;

public class TypeErase {
	public void m1(ArrayList<String> list) {};
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
	}
}
