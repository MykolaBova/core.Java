public class MyInterfaceImpl implements MyInterface, MyOtherInterface {

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayGoodbye() {
        System.out.println("Goodbye");
    }

    public void test() {
	System.out.println("test");
    }

    public static void main(String[] args) {
        System.out.println("Hello, World");

/*
MyInterfaceImpl.java:13: reference to hello is ambiguous, both variable hello in MyInterface and variable hello in MyOtherInterface match
	System.out.println("hello="+hello);
	                            ^
1 error
*/
//	System.out.println("hello="+hello);


	System.out.println("MyInterface.hello="+MyInterface.hello);
	System.out.println("MyOtherInterface.hello="+MyOtherInterface.hello);

    }

}