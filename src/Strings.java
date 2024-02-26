

public class Strings {
    public static void main(String[] args) {
        String myname = new String("GORVE");
        System.out.println(myname);

        int a = 6;
        float b = 4.56799f;
        // d for int,
        // f for float,
        // c for char,
        // s for string
        System.out.printf("A: %d , B: %f", a, b);
        System.out.println("");
        System.out.printf("A: %d , B: %4.1f", a, b);
        System.out.println("");
        System.out.format("A: %d , B: %f", a, b);

        System.out.println("");
        String name = "GORVE";
        int length = name.length();
        System.out.println(length);
        String nameUp = name.toUpperCase();
        System.out.println(nameUp);

        String some = "     GORVE KUMAR      ";
        System.out.println(some);
        System.out.println(some.trim());

        System.out.println(name);
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4)); // end is excluded
        System.out.println(name.substring(0)); // redundant
        System.out.println(name.replace('G', 'F'));
        System.out.println(name.replace("GO","KUMAR"));
        System.out.println(name.startsWith("KU"));
        System.out.println(name.charAt(0));
        String uni = "NEDUET";
        System.out.println(uni.indexOf('E'));
        System.out.println(uni.indexOf("ET"));
        System.out.println(uni.indexOf('E',1)); // start from E
        System.out.println(uni.indexOf('E',2)); // start from D
        System.out.println(uni.indexOf('X')); // not found, returns -1
        System.out.println(uni.lastIndexOf('E'));
        System.out.println(uni.lastIndexOf('E',3)); // search in "NEDU"ET
        System.out.println(uni.equals(name));
        System.out.println(uni.equals("NEDUET"));
        System.out.println(uni.equals("Neduet"));
        System.out.println(uni.equalsIgnoreCase("NeduEt"));
        // ESCAPE SEQUENCE
        System.out.println("Gorve\"s Laptop");
        System.out.println("Gorve\\Laptop");
        System.out.println("Gorve\tKumar");

        // VARIABLE UPDATE:
        String college = "<|name|> College";
        college = college.replace("<|name|>","bahria");
        college = college.toUpperCase();
        System.out.println(college);

        String str = "DOUBLE AND  TRIPLE SPACE   DETECTION";
        System.out.println(str.indexOf("  ")); // double space
        System.out.println(str.indexOf("   ")); // triple space
        System.out.println(str.indexOf("    ")); // four space

        String letter = "Dear \"Gorve\",\n\tHello, Bye.";
        System.out.println(letter);
    }
}
