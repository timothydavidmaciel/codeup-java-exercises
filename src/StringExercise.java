public class StringsLecture {
    /*
    JAVA STRINGS:
    Unlike the other types we've worked with so far, strings are objects, not primitives.
    This means that String variables are a reference type, not a primitive type, and is the
    reason that the == operator does not behave as expected when comparing strings.
    */
    public static void main(String[] args) {
//        System.out.println(new Object());
//        System.out.println(new Object());
//
//        String str1 = "Hello";
//        String str2 = "hello";
//
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1.equals(str2));
//
//        str1 = "World!";
//        System.out.println(str1.toLowerCase().startsWith("w"));
//        System.out.println(str1.toLowerCase().endsWith("!"));

        String testString = "This is a test string for testing purposes. Tests are good, and tests are bad. But which test is this?";

        System.out.println(testString.charAt(8));

        System.out.println(testString.indexOf("testing"));
        // Must use parenthesis
        System.out.println(testString.length());

        System.out.println(testString.toLowerCase().replace("test", "word"));


    }
}
