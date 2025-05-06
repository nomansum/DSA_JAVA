public  class OOPPractice {


    public static void main(String[] args) {
        Callback a = new Callback() {
            @Override
            public void callback() {
                System.out.println("k");
            }
        };
        a.callback();
    }


}

abstract class Incomplete implements Callback {
    int a, b;
    void show() {
        System.out.println(a + " " + b);
    }
//...
}

interface Callback{
    void callback();
}