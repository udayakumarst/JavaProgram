package JavaClass;
public class AccessSpecifierDemo
{
 public void publicMethod() 
 {
     System.out.println("This is a public method.");
 }
 protected void protectedMethod() 
 {
     System.out.println("This is a protected method.");
 }
 void defaultMethod() 
 {
     System.out.println("This is a default method.");
 }
 private void privateMethod() 
 {
     System.out.println("This is a private method.");
 }
 public static void main(String[] args) {
     AccessSpecifierDemo demo = new AccessSpecifierDemo();

     demo.publicMethod();     // Accessible from anywhere
     demo.protectedMethod();  // Accessible within the same package
     demo.defaultMethod();    // Accessible within the same package
     demo.privateMethod();    // Accessible only within this class
 }
}

