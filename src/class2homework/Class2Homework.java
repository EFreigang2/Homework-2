package class2homework;

/**
 *
 * @author Eric
 */
public class Class2Homework {

    public static void main(String[] args) {
        //method for calling information about objects(D.R.Y.)
        person John = new person();
        John.age = 27;
        John.firstName = "John";
        John.lastName = "Doe";
        person Mary = new person();
        Mary.age = 22;
        Mary.firstName = "Mary";
        Mary.lastName = "Sue";
        System.out.println(John.firstName + " " + John.lastName + " is " + John.age + " years old");
        System.out.println(Mary.firstName + " " + Mary.lastName + " is " + Mary.age + " years old");
    }
    
}
