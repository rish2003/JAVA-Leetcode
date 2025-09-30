public class StringMethods {
    public static void main(String[] args) {
        String a = "hello";
        String b = "Hello";

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.compareTo(b));

        String text = "JavaProgramming";
        System.out.println(text.substring(0,4));
        System.out.println(text.substring(4));

        String msg = "Hello World";
System.out.println(msg.contains("World"));   // true
System.out.println(msg.startsWith("He"));    // true
System.out.println(msg.endsWith("ld"));      // true
System.out.println(msg.indexOf("o"));        // 4 (first occurrence)
System.out.println(msg.lastIndexOf("o"));// 7 (last occurrence)


        String data = "a,b,c";
        String[] arr = data.split(",");
        for(String s : arr){
            System.out.println(s);
        }

        int num = 42;
        String strNum = String.valueOf(num);
        char[] chars = strNum.toCharArray();
        for(char ch : chars){
            System.out.println(ch);
        }

        String x = new String("Ram");
        String y = x.intern();

        System.out.println(x == y);  // false
        System.out.println(x.equals(y)); // true
        System.out.println(y); // true
        System.out.println(x);
    }
}
