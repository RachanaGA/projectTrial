 public class Duplicates {
	 public static void main(String[] args) {
		Duplicates d = new Duplicates();
		d.replaceRepeating(“Rachana”, ‘*’);	
	 }
	 
	 public void replaceRepeating(String s, char c) {
		 int count=0;
		 for(int i=0;i<s.length(); i++){
			 count=0;
			 for(j=0;j<s.length(); j++) {
				 if(s.charAt(i) == s.charAt(j)){
					 count++;
				 }
				 if(count>1) {
					 s = s.replace(s.charAt(i), c)
				 }
			 }
		
		}
		System.out.println(s);
	 }
	  
 }