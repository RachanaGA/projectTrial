public class WordBreak {
	public static void main(String[] args){
		String s = "NttDataDevTeam";
		String st = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 't' || s.charAt(i) == 'T') {
				System.out.println(st);
				st = "";
				continue;
			}
			st = st + s.charAt(i);
		}
	}
}