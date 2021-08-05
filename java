Q How many types of memory areas are allocated by JVM?
Ans :-
Heap: It is the runtime  object  ko memory allocated karta h .
Stack :-Java Stack stores frames.Yah hold rakhta h  varibale and partial result ko  or play  method invocation and return.Each thread has a private JVM stack, created at the same time as the thread. A new frame is created each time a method is invoked.

Q  What is JIT compiler?
ANS:- Just in Time Compiler yah performance ko improve karta h. it same functionality bytecode ki. ye compilation time kam leta h. After compiler
transfter the instruction set of  jvm instruction set of cpu.


Q What is classloader?
ANS:-Classloader is a subsystem of JVM which is used to load class files. Whenever we run the java program, it is loaded first by the classloader.
  (Jvm firstly use to  load class file after run the java program  is liy first  classloader file run hoti h)

Bootstrap ClassLoader: This is the first classloader which is the superclass of Extension classloader. It loads the rt.jar file which contains all class files of Java Standard Edition like java.lang package classes, java.net package classes, java.util package classes, java.io package classes, java.sql package classes, etc
 ( is me sari package class hoti h  is  first jar file an packgae fir calss file )


Q What if I write static public void instead of public static void?
Ans:-The program compiles and runs correctly because the order of specifiers doesn't matter in Java.


Q What is the default value of the local variables?
Ans:-The local variables are not initialized to any default value, neither primitives nor object references.


Q What are the various access specifiers in Java?
Ans:-In Java, access specifiers are the keywords which are used to define the access scope of the method, class, or a variable. In Java, there are four access specifiers given below.

Public:- The classes, methods, or variables which are defined as public, can be accessed by any class or method.

Protected:- Protected can be accessed by the class of the same package, or by the sub-class of this class, or within the same class.

Default:- Default are accessible within the package only. By default, all the classes, methods, and variables are of default scope.

Private:- The private class, methods, or variables defined as private can be accessed within the class only.


-------------------------------------oops-----------------------------------
 Q What is object-oriented paradigm?
ANS - It is a programming paradigm based on objects having  data and methods define  in calss .Object-oriented paradigm advantages of modularity and reusability.

Q What will be the initial value of an object reference which is defined as an instance variable?
ANS :-All object references are initialized to null in Java.

Q What is the purpose of a default constructor?
ANS:-The purpose of the default constructor is to assign the default value to the objects. The java compiler creates a default constructor implicitly if there is no constructor in the class.


Q Is constructor inherited? ans NO 
Q Is constructor final ? ans NO

 Q Can we overload the constructors?
Ans-Yes, the constructors can be overloaded by changing the number of arguments accepted by the constructor or by changing the data type of the parameters. Consider the following example.


Q What is the static variable?
ANS:-The static variable is used to refer to the common property of all objects.


Q  What are the restrictions that are applied to the Java static methods?
Ans:- can not use  static data member or call the non-static method directly.

Q  Why is the main method static?


Q Can we override the static methods?
ANS :- NO

Q Can we execute a program without main() method?
Ans:- No, It was possible before JDK 1.7 using the static block. Since JDK 1.7, it is not possible.


Q Can we make constructors static?
ANS:-As we know that the static context (method, block, or variable) belongs to the class, not the object. Since Constructors are invoked only when the object is created, there is no sense to make the constructors static. However, if you try to do so, the compiler will show the compiler error.


Q What is this keyword in java?
Ans The this keyword is a reference variable that refers to the current object. There are the various uses of this keyword in Java. It can be used to refer to current class properties such as instance methods, variable, constructors, etc. It can also be passed as an argument into the methods or constructors. 

Q Which class is the superclass for all the classes?
ANS The object class is the superclass of all other classes in Java.

QWhat is composition?
ANS-Holding the reference of a class within some other class is known as composition. When an object contains the other object, if the contained object cannot exist without the existence of container object, then it is called composition.

Q What is the difference between aggregation and composition?
ANS:-Aggregation represents the weak relationship whereas composition represents the strong relationship. For example, the bike has an indicator (aggregation), but the bike has an engine (composition).

Q Why does Java not support pointers?
Ans:- The pointer is a variable that refers to the memory address. They are not used in Java because they are unsafe(unsecured) and complex to understand.


Q What is super in java?
Ans :-The super keyword in Java is a reference variable that is used to refer to the immediate parent class object.

Q What is Java instanceOf operator?
Ans it is also known as type comparison operator because it compares the instance with type. It returns either true or false. If we apply the instanceof operator with any variable that has a null value, it returns false. Consider the following example.

class Simple1{  
 public static void main(String args[]){  
 Simple1 s=new Simple1();  
 System.out.println(s instanceof Simple1);//true  
 }  
}  



Q Abstraction in Java
Ans:-Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Q ) Can we define private and protected modifiers for the members in interfaces?
Ans:- No, they are implicitly public.


Q How to make a read-only class in Java?
Ans :-A class can be made read-only by making all of the fields private. The read-only class will have only getter methods which return the private property of the class to the main method. We cannot modify this property because there is no setter method available in the class. Consider the following example.

  //A Java class which has only getter methods.    
public class Student{    
//private data member    
private String college="AKG";    
//getter method for college    
public String getCollege(){    
return college;    
}    
}    



Q  How to make a write-only class in Java?
Ans:-
A class can be made write-only by making all of the fields private. The write-only class will have only setter methods which set the value passed from the main method to the private fields. We cannot read the properties of the class because there is no getter method in this class. Consider the following example.

  //A Java class which has only setter methods.    
public class Student{    
//private data member    
private String college;    
//getter method for college    
public void setCollege(String college){    
this.college=college;    
}    
}    



Q Can I import same package/class twice? Will the JVM load the package twice at runtime?
Ans:-One can import the same package or the same class multiple times. Neither compiler nor JVM complains about it. However, the JVM will internally load the class only once no matter how many times you import the same class.


Q What is the static import?
Ans:-By static import, we can access the static members of a class directly, and there is no to qualify it with the class name.


Q How many types of exception can occur in a Java program?
Ans:-There are mainly two types of exceptions: checked and unchecked. Here, an error is considered as the unchecked exception. According to Oracle, there are three types of exceptions:

Checked Exception: Checked exceptions are the one which are checked at compile-time. For example, SQLException, ClassNotFoundException, etc.

Unchecked Exception: Unchecked exceptions are the one which are handled at runtime because they can not be checked at compile-time. For example, ArithmaticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.

Error: Error cause the program to exit since they are not recoverable. For Example, OutOfMemoryError, AssertionError, etc.



API Testing Interview Questions
HTTP Interview Questions
Java Support Interview Questions
Most Asked Web API Interview Questions
OOPs Interview Questions
Servlet interview questions
JDBC Interview Questions


Top 30 Java Support Interview Questions


Q Explain Immutable classes in Java with some examples?
Ans :-Immutable class means once the object is created, we can not modify its content and state. There are several immutable classes in Java, such as String, Boolean, Byte, Short, Integer, Long, Float, Double, etc.



Q How to know whether the linked list is circular or not?
Ans:-We can check whether the linked list is circular or not. To check it, we will store the header into any other variable, then start traversing the list; if we get the null on the next part of any node, then the linked list is not circular; otherwise we will check the next node is the same as the stored node or not, if so then the link list is circular.


 Q Explain the difference between Path and ClassPath?
Ans :-The Path is used to define the executables(.exe) files, where the system can find them, whereas the classpath is used to specify the location



----------------------oops -2 -------------------------------------

Java is not a pure object-oriented programming language because pre-defined data types in Java are not treated as objects. Hence, it is not an object-oriented language.


Class: A class is a blueprint or template of an object. It is a user-defined data type. Inside a class, we define variables, constants, member functions, and other functionality. It does not consume memory at run time.


Object: An object is a real-world entity that has attributes, behavior, and properties. It is referred to as an instance of the class. It contains member functions, variables that we have defined in the class. It occupies space in the memory



Exception :- Exception can be recovered by using the try-catch block.
It can be classified into two categories i.e. checked and unchecked.
It occurs at compile time or run time.
It belongs to java.lang.Exception package.	
Only checked exceptions are known to the compiler.
It is mainly caused by the application itself.
Checked Exceptions: SQLException, IOException
Unchecked Exceptions: ArrayIndexOutOfBoundException, NullPointerException, ArithmaticException


Error :-An error cannot be recovered.
All errors in Java are unchecked.
It occurs at run time.
It belongs to java.lang.Error package.
Errors will not be known to the compiler.
It is mostly caused by the environment in which the application is running.
Java.lang.StackOverFlow, java.lang.OutOfMemoryError


------------------------ collection framwark ----------------------------
Collection Framework:-  is a combination of classes and interface, which is used to store and manipulate the data in the form of objects. It provides various classes such as ArrayList, Vector, Stack, and HashSet, etc. and interfaces such as List, Queue, Set, etc. for this purpose.



------------------------------ API -----------------------------------
ApI:- (Application Programming Interface) helps in communication and data exchange between two software systems.API act as an interface between two applications and allows the two software systems communicate with one another.

protocols used in API Testing -HTTP,REST,SOAP,JMS,UDDI

Q What are the difference between API testing and UI testing?
Ans UI (User Interface) testing means the testing of the graphical user interface. The focus of UI testing is on the look and feel of the application. In user interface testing the main focus is on how users can interact with app elements such as images, fonts, layout etc. are checked.

API testing allows the communication between two software systems. API testing works on backend also known as backend testing.



Q What is SOAP?
Ans :-SOAP (Simple Object Access Control) . It is an XML based protocol that helps in exchanging information among computers.


 Q What is REST API?
Ans:-REST API is a set of function helps the developers performing requests when the response is receiving. Through HTTP protocol interaction is made in REST API.
 (is ke function help karte h request ke response ko le me  http  interaction )

REST is defined as Representational state transfer. It is an effective standard for API creation.






----------------------- java new version features----------------------------------------

 java -7
Q Binary Literals -  Literal in Java 7. I allows you to express integral types (byte, short, int, and long) in binary number system. To specify a binary literal, add the prefix 0b or 0B to the integral value.


Q String in Switch Statement - in switch case allow string.


Q Java 7 Catch Multiple Exceptions
Java allows you to catch multiple type exceptions in a single catch block. 

You can use vertical bar (|) to separate multiple exceptions in catch block.
  
  catch(ArithmeticException | ArrayIndexOutOfBoundsException e){  
            System.out.println(e.getMessage());  
        }    

Q The try-with-resources statement
try( // Using multiple resources  
        FileOutputStream fileOutputStream =new FileOutputStream("/java7-new-features/src/abc.txt");  
        InputStream input = new FileInputStream("/java7-new-features/src/abc.txt"))


Q Type Inference for Generic Instance

------------java 8 --------------------
lamda exp :-

public interface Anonymous{
  void show ()   // this is a function interface
}

Anonymous ka advance version handled;
 is Anonymous or ye function interface use karta h
 Anonymous obj = new Anonymous(){
   public void show (){
     System.out.println("hello");
   }
   public void showPrint (int x){
     System.out.println("hello"+x);
   
 }

obj.show();
obj.showPrint(44)

lamp exp 
anonymous lamda = () - > system.out.println("hello);

lamda.show(); 


function interface :-  interface me ek hi method ho na chaye. (single method interface ). 
but java 8 in  in interface  static and default n number method decalar in interface.

like 
 public interface anonymous {
   void show();
   static void print (){////}
   default void display (){////}
 }


Method references
public class MethodReference2 {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2=new Thread(MethodReference2::ThreadStatus);  
        t2.start();       
    }  
}  


Java Functional Interfaces - java 8 me  interface function likh sakte h 




Predicate  ke interface jo boolan value  return karega

java stream  :- collection method  KI uper function working karte h wo stram provide karta h  



Java StringJoiner
StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
          
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");  
                  
        System.out.println(joinNames);  

        Rahul,Raju,Peter,Raheem



   -------------------- mix ------------

   What do you think are the advantages of using Java?
Java is a high-level object-oriented programming language used for developing games, device systems, and applications.
It is secure, fast, reliable, portable and platform independent.


3. What are JVM, JDK, and JRE?
• JVM (Java Virtual Machine) offers the runtime environment for codes to be executed.
• JRE (Java Runtime Environment) is the collection of files needed during runtime by JVM.
• JDK (Java Development Kit) is needed to write and execute a program and contains the JRE with necessary development tools.


5. What is the difference between Overloading and Overriding?
When you have two methods of the same name but having different properties, the case is called Overloading. On the other hand, Overriding refers to a situation where two methods with the same name and properties occur, but the two occurring in a parent and child class respectively.

6. What is Inheritance?
Inheritance allows you to let a derived class acquire the methods from a base class.

 7.What is WORA?
WORA or Write Once Read Anywhere, is the property of a language to run on any platform. Java is allowed this property due to its bytecode nature. This is midway between machine code and source code and is thus not platform specific.

10. What is the function of ClassLoader?
You can use ClassLoader to load class files before running the java program.

16. What is aggregation?
It is a type of weak relation you can create between two classes, where one contain references to another class contained within it.

18. What is annotation?
Annotation is a tag you use to symbolize metadata that represents your class, interface, and fields among others.
They are used by the compiler and the JVM and don’t directly influence the operations.

19. What is enumeration?
It is an interface you can use to access original data structure from which the enumeration is obtained.

20. What is the function of Synchronized Block?
While its scope is smaller than method, you can use it to lock an object for each shared resource.

