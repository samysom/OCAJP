package V11;

public class Q105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Java";
		String [] str2= {"J","a","v","a"};
		String str3="";
		for(String str:str2) {
			str3=str3+str;
			System.out.println(str3);
		}
		System.out.println(str1);
		boolean b2=(str1.equals(str3));
		boolean b1=(str1 == str3);
		
		System.out.println(b1+" ,"+ b2);
	}

}
