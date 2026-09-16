package DSA.Things_to_know;
public class PassbyValue {

    static void change(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        int a = 10;

        change(a);

        System.out.println(a);
    }
}