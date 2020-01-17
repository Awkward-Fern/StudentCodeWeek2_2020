package student;

/**
 *This class ++++Insert Description Here++++
 *
 * @author Michael Hennessey
 */
public class Student {

    private String name;
    private String studentID;

   /*
    A constructor that takes in both parameters
    @param givenName - the student names
    @param givenID - the student's ID
    */
    public Student (String givenName, String givenID){
        
        name = givenName;
        studentID = givenID;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
/*
* a mehtod that returns true if a student studied a false otherwise.
    @return wheter or not the student studied
    
*/
    public boolean didStudy (){
        return true;
    }
            
}
