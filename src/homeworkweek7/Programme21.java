package homeworkweek7;

public class Programme21 {
    //instance method
    void pro() {
        String name = "This is my string";
        String name1 = "Hello world";
        System.out.println("The length of string is " + name.length()); // length of String
        System.out.println("Index number is :" +name.charAt(3)); // given index number
        System.out.println("This is my string = Hello world is " +name.equals(name1));//combines specfied string
        System.out.println(name.contains("i"));//returns true if chars are found in the string
        System.out.println(name.startsWith("This"));//this string starts with given prefix
        System.out.println(name.endsWith("is"));//this string starts with given suffix
        System.out.println(name.equals("name1"));//contents of two given strings
        System.out.println(name.indexOf("h"));//index of given character value is or substring
        System.out.println("Is this string is empty = " + name.isEmpty()); // Checks if this string is empty
        System.out.println(name.replace(name, name1));//string replacing all the old char to new char
        System.out.println(name.substring(10));//a parts of the string
        System.out.println(name.toCharArray());//converts this string into character array
        System.out.println("THIS IS MY STRING to lowercase = "+name.toLowerCase());//string in lowercase letter
        System.out.println("this is my string to Uppercase = "+name.toUpperCase());//string in uppercase letter
        System.out.println("String After trim : " +name.trim()+ " my ");//eliminates leading and trailing spaces

    }
    //main method
    public static void main(String[] args) {
       Programme21 obj = new Programme21();//object
       obj.pro();
    }
}