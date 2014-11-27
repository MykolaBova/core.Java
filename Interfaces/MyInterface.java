
/*
MyInterface.java:2: modifier private not allowed here
private interface MyInterface {
        ^
1 error
*/
//private interface MyInterface {

/*
MyInterface.java:13: modifier protected not allowed here
protected interface MyInterface {
          ^
1 error
*/
//protected interface MyInterface {

interface MyInterface {

//public interface MyInterface {

     //public String hello = "Hello";
     String hello = "Hello";

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
