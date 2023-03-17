package kata7.isThisAtriangle;

public class TriangleTester {
    private static boolean isTriangle(int a, int b, int c){
        return a+b>c&&b+c>a&&a+c>b;
    }
}
