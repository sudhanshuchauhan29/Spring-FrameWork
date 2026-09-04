package in.Mace.Simple;

public class A {
    private B a;
//
//    public A(B a) {
//        this.a = a;
//    }

    public A( ) {
        System.out.println("A ceated");
        this.a = new B();
    }
}
