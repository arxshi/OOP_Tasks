package task1point2;

public class Recursion {

    public static void recurse(int a, int b) {

        if(a<b) {
            System.out.println(a);
            recurse(a+1, b);
        } else if(a>b) {
            System.out.println(a);
            recurse(a-1, b);
        } else {
            System.out.println(b);
        }

    }


}
