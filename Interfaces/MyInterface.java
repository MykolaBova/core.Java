public interface MyInterface {

    public String hello = "Hello";

/*
MyInterface.java:5: modifier private not allowed here
    private String privateHello = "Hello";
                   ^
1 error
*/
//    private String privateHello = "Hello";

    public void sayHello();

    public void test();
}
