package exceptionhandling;

public class Student {
      public long getPhoneno(String name) throws MyException  {
    	  if (name.equals("aadi"))
    	  return 784938477848l;
    //	  else return -1L;
    	  throw new MyException();
    		  
      }
      public String getEmail(String name){
    	  if (name.equals("aadi"))
        	  return "aadi@gmail.com";
    	  throw new RecordNotFoundException("record doenot exist");
    	  
      }
}
