package Chapter7;

/**
 * @author : Dimpho Phala
 * Date : 12/10/2026
 **/
public class StudentRunner {
    public static void main (String[] args){
        Student objStudent = new Student();
        Student objThabo = new Student("111223", "Thabo", "Molokoane","molokoane7@gmail.com");

        objThabo.setAssessments(70,80, 50);

        System.out.println("======Default constructor=======");

        objThabo.display();

        System.out.println("=========Overloaded constructor=======");
        objThabo.display();

    }
}
