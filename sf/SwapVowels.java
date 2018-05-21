package interview.sf;

public class SwapVowels {

	public static void main(String[] args) {
		
		String s = "sriedhoar";
		System.out.println("Original String : " + s);
		int ipos = 0;
		int jpos = 0;
		boolean ifound = false;
		boolean jfound = false;
		for(int i = 0, j = s.length()-1; i<=s.length()/2;  ) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||s.charAt(i) == 'u') {
				ipos = i;
				ifound = true;
				//System.out.println("FOUND TRUE: " + i);
			} else if(ifound == false) {i++; 
			//System.out.println("NOT FOUND INCR: " + i);
			}
			if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' ||s.charAt(j) == 'u') {
				jpos = j;
				jfound = true;
				//System.out.println("FOUND TRUE: " + j);
			} else 
				if (jfound == false) { j--; 
				//System.out.println("NOT FOUND DCR: " + j);
				}
			if(ifound && jfound) {
			char c = s.charAt(ipos);
			StringBuilder sb = new StringBuilder(s);
			sb.setCharAt(ipos, s.charAt(jpos));
			//System.out.println(sb);
	        sb.setCharAt(jpos, c);
	       // System.out.println("+++" +sb);
	        s = sb.toString();
			ifound = false;
			jfound = false;
			i++;j--;
		}
	}
		System.out.println("Vowels Swapped : " + s);
	}
}
