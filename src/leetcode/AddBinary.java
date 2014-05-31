package leetcode;

/**
 * Given two binary strings, return their sum (also a binary string). For
 * example, a = "11" b = "1" 
 * Return "100".
 * 
 * @author Evergreen。
 * 
 */
public class AddBinary {

	public String addBinary(String a, String b) {
		StringBuffer sb = new StringBuffer();
		
		int pa = a.length() - 1;
		int pb = b.length() - 1;
	
		char carray = '0';
		int temp = 0;

		while (pa >= 0 || pb >= 0) {
			temp = 0;
			if (pa >= 0)
				temp += a.charAt(pa);
			else
				temp += '0';
			if (pb >= 0)
				temp += b.charAt(pb);
			else
			    temp += '0' ;
			
			temp += carray ;
			
			if (temp == 146) {     // 110
				sb.append("0");
				carray = '1';
			}else if (temp == 147) { // 111
				sb.append("1");
				carray = '1';
			}else if(temp == 145){ //100
				sb.append("1");
				carray = '0';
			}else {                // 000
				sb.append("0");
				carray = '0';
			}

			pa--;
			pb--;
		}
		if( carray == '1')
			sb.append("1");
		
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		
		//1010  1011
		
		System.out.println(new AddBinary().addBinary(a, b));
		//  1+1    1 + 0
		//System.out.println('0' + '0' + '0');// 111 011              001 000
		
	}

}
