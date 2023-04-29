package stringhandling;

public class Mutable  {
    public static void main(String[] args) {
        StringBuilder builder= new StringBuilder("Hello");
        System.out.println(builder);
        System.out.println(builder.append("P"));
        System.out.println(builder.append(5));
        System.out.println(builder.indexOf("o"));
        System.out.println(builder.insert(3,"h"));

    }}
