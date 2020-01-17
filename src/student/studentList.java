package student;

/**
 * This class ++++Insert Description Here++++
 * 
 * @author Michael Hennessey
 */
public class studentList {

 public static void main(String [] args){
        
        Student [] studentList = new Student[5];
        //make up 5 students to put inside
        studentList[0] = new Student("Superman", "007");
        studentList[1] = new Student("James Bond", "700");
        studentList[2] = new Student("Wonder Woman", "100");
        studentList[3] = new Student("Batman", "001");
        studentList[4] = new Student("Joker", "002");
       
       for(Student s:studentList){
           System.out.println(s.getName());
       }
    }
}

