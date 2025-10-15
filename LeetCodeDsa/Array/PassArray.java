package LeetCodeDsa.Array;

class PassArray{
    static void change(int[] x){
        x[3] = 20;
    }
    public static void main(String[] args) {
        int[] x = {10,20,30,40,50};
        System.out.println(x[3]);
        change(x);
        System.out.println(x[3]);
    }
}
