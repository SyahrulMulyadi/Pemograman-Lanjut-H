package ClassesAndObjects.arul;

public class CreatingObejct {
    public static void main(String[] args) {
        class A{
            public void test(){
                System.out.println("hi");
            }
        }
        class B {
            public void main(String[] args) {
                A obj = new A ();
                obj.test();
            }
        }
    }
}
