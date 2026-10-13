package Chapter7;

/**
 * @author : Dimpho Phala
 * Date : 12/10/2026
 **/
public class Student {
    private String studentNumber;
    private String firstname;
    private String lastname;
    private String email;
    private int testMark, assignment1, assignment2;

    public Student(){
        studentNumber = "0000000";
        firstname = "No name";
        lastname = "No lastname";
        email = "none";
        testMark = 0;
        assignment1 = 0;
        assignment2 = 0;
    }

    /**
     * Construct an object of Student with attributes
     * @param studentNumber studentNumber
     * @param firstname firstname
     * @param lastname lastname
     * @param email email
     */
    public Student(String studentNumber, String firstname, String lastname, String email) {
        setStudentNumber(studentNumber);
        setFirstname(firstname);
        setLastname(lastname);
        setEmail(email);
    }

    /**
     * Set student number
     * @param stNum
     */
    private void setStudentNumber (String stNum){
        this.studentNumber = "ST-26" + stNum;
    }

    /**
     * set firstname
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * set lastname
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * set email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * set assessment marks
     * @param test
     * @param assignment1
     * @param assignment2
     */
    public void setAssessments (int test, int assignment1, int assignment2){
        this.testMark = test;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
    }

    /**
     * get student number
     * @return
     */
    public String getStudentNumber(){
        return studentNumber;
    }

    /**
     * get name
     * @return
     */
    public String getName(){
        return firstname + " " + lastname;
    }

    /**
     * get email
     * @return
     */
    public String getEmail(){
        return email;
    }

    /**
     * get semester mark
     * @return
     */
    public double getSemesterMark(){
        //test * 40, a1 * 35%, a2 * 25%
        return (this.testMark * 0.4) + (this.assignment1 * 0.35) + (this.assignment2 * 0.25);

    }

    public void display(){
        System.out.println("Student#: " + getStudentNumber());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Semester Mark: " + getSemesterMark());
    }


}
