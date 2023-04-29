package stringhandling;

public class demo2{
    public static void main(String[] args) {
            String source = "cyber success";
            //source=source.replace("s","d");
            source = source.replace("cyber", "hello");
            System.out.println(source);


            String space = "        space      ";
            System.out.println(space);
            System.out.println(space.length());

            String spaces = "       space             ";
            spaces = spaces.trim();
            System.out.println("length of trim spaes = " + spaces.length());

            //Ascii value
            String str = "a";//97
            String str1 = "operator.A";//65
            System.out.println(str.compareTo(str1));//used for compare Ascii value
            //compareTo return the Integer value
            //positive::if first string is bigger than second string
            //negative::if second string is bigger than first string
            // Zero::both string are equal


            ///find the char using charAt()
            String str2 = "hello";
            System.out.println(str2.charAt(3));

            String a = "Hello";
            String b = "Hello";
            System.out.println(a.contains(str2));//false
            System.out.println(a.codePointAt(0));
            System.out.println(a.contentEquals(str2));//false
            System.out.println(a.contentEquals(b));//true
            System.out.println(b.replace("o", "c"));
            System.out.println(b.replaceFirst("l", "p"));

    }}