package stringAPI;

public class InterviewQuestions {
	public static String reverseWord(String s) {
		String reverseWord=""; 
		for(int i=s.length()-1;i>=0;i--) {
			reverseWord=reverseWord + s.charAt(i);
		}
		return reverseWord;
	} 
	public void reverseSentence(String s) {}
	public static String reverseWord(String sentence, String word) {
		String[] arr=sentence.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(word)) {
				arr[i]=reverseWord(word);
				
			}
		}
		// Format the array in a sentence .
		
		String str="";
		for(int i=0;i<arr.length;i++) {
			// System.out.print(arr[i] + " ");
			// str=str.concat(arr[i]).concat(" ");
			str=str + arr[i] + " ";
			
		}
		 str=str.trim();
		// System.out.println(str);
		// System.out.println(str.length());
		return str;
	}
	public static void main(String[] args) {
		String str="kaho Na Pyaar Hai";
		System.out.println(str.length());
		String reverseWord = reverseWord(str, "Pyaar");
		System.out.println(reverseWord);
	}
}
