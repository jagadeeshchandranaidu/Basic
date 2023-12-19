package Arraylist;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "Jhon";
        String str2 = "Snow";
        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));
        
        String str = "Jammie";
        char[] chars = str.toCharArray();
        System.out.println(chars);
        for (int i= 0; i< chars.length; i++) {
            System.out.println(chars[i]);
        }
        
        String str3 = "NightKing";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
        
        String str4 = "Drogon";
        String replace = str.replace('o', 'i');
        System.out.println(str);
        System.out.println(replace);
        
        
        System.out.println(str3.substring(3,7));

	}
}
