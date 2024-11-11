
//STATIC excetued first before CONSTRUCTOR
// we cannot access non-STATIC variable in STATIC method

class VEH{
    int no;
    static String comp; // to create STATIC method declare variable as STATIC

    static    // called when a class is loaded and class is loaded only once for any number of objects
    {
       comp="HONDA" ;   //it will stay same for all objects in the main block
    }

    public VEH(int no)  // called when object is created
    {
        this.no=no;
        System.out.println(no+":"+comp);
    }
}
public class StaticMETHOD {
    public static void main(String[] args) {

        VEH one=new VEH(1);    //same "comp" name diff "no"
        VEH two=new VEH(2);
    }
}
