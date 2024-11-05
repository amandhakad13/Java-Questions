public class Wrapper {
    public static void main(String[] args) {
        int num = Integer.parseInt("12345");
        System.out.println(num);

        Integer i1 = Integer.valueOf("1010",2);
        int binary = i1.intValue();

        System.out.println(binary);
    }
}
