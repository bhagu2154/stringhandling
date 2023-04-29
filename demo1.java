package stringhandling;

public class demo1 {
    public static void main(String[] args) {
        String str1=new String("pqr");
        System.out.println(str1.toString());
        String str="abc";//literal
        //toString() overridden inside the string we get output as it is
        System.out.println(str1.toString());
/*in this case o/p will be same bz of if we create the object with help of new keyword obj will be created inside the heap as well as scp without any obj
in scp*/

        //comparing two string
        String st1=new String("hello");
        String st2=new String("Hello");
        System.out.println("using new keyword ="+st1==st2);//
        System.out.println(st1.equals(st2));//
        System.out.println(" new keyword equal ignore case "+st1.equalsIgnoreCase(st2));

//literal way
        String str2="abcd";
        System.out.println(str==str2);//false
        System.out.println(str.equals(str2));
//string concat

      String  str3="hello";
      String str4=str3 + " world";//by using "+"operator
        System.out.println("two string concat = " +str4);
        //string concat by using concat() method//ans:abcdhello
        System.out.println( "string concat = "+ str2.concat (str3));
        System.out.println("literal equal innore case ="+str2.equalsIgnoreCase(str4));
//by using referance
        String name="xyz";
       name =name.concat("pqr");//it will get op only xyz & we use ref we get answer as xyzpqr
        System.out.println(name);//xyzpqr
        name=name.concat("abc");
        System.out.println(name);//xyzpqrabc

        //lenght of string
        String str5="welcome to in cyber success";
        System.out.println("string lenght = "+str5.length());
//char[]
        char[] array={1,2};
        char[]array1={1};
        System.out.println(array.length);
        System.out.println(array.length==array1.length);//false

//string case
        String message="cyber success";
        message=message.toUpperCase();
        System.out.println(message);
        // 2nd way without ref direct call to method
        System.out.println("without creating obj = "+message.toUpperCase());

        //lower case
        String lower="CYBER SUCCESS";
        lower=lower.toLowerCase();
        System.out.println("lower case = " + lower);


    }
}
