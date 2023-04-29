package stringhandling;

public class stringMethods {
    public static void main(String[] args) {
        String str1="hello";
        String str2="Friends";
        System.out.println(str1.length());
        System.out.println(str1.charAt(4));
        System.out.println(str1.codePointAt(1));
        System.out.println(str1==str2);
        System.out.println(str1!=str2);
        System.out.println(str1.equals(str2));
        String str="HELLO";//it will only check the string not a content check.
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str2.equalsIgnoreCase(str));
        System.out.println(str.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str1.getBytes());//Bytecode
        System.out.println(str.substring(2));//start from the 2 letter
        System.out.println(str.endsWith("s"));
        System.out.println(str2.startsWith("F"));
        System.out.println(str1.toString());//it will print only string not hashcode
    }
}
