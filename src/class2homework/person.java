package class2homework;

/**
 *
 * @author Eric
 */
public class person {
    //everything should be private
    public int age;
    public String firstName;
    public String lastName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("value must be between 0 and 120.");
        }
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
