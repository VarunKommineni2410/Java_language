
/*  The right way of assigning data to variables in classes
    is using their methods not directly,
    so we use GETTERS and SETTERS.  */

// Make the variables PRIVATE so can only be used after inside class

//Encapsulation -> binding data with methods.

class Student{
    private int Roll;    // can also be public but private allows to altering only in class not in by objects
    private String Name;



    public int getRoll() {    //getter
        return Roll;
    }

    public void setRoll(int Roll) {  //setter
        this.Roll = Roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {

        Student obj=new Student();

        // obj.Name="raj" because the variable is private
        obj.setName("Raj");
        obj.setRoll(204);

        System.out.println(obj.getName()+":"+obj.getRoll());


    }
}
