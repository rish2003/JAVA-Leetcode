public class StringEx {
    public static void main(String[] args) {
        String name = "Ram";
        String a = new String("Ram");
        String b = new String(name);
        String c = "Ram";
        String d = "Ram";

        System.out.println(a == b);
        System.out.println(c == d);

        char z = name.charAt(0);
        System.out.println(z);

    }
}
