package Chapter8.Exercise;

/**
 * @author : Dimpho Phala
 * Date : 13/10/2026
 **/

public class ThrowDepartmentException {

    public static void main(String[] args) {

        Department[] departments = new Department[6];

        try {
            departments[0] = new Department("IT", 101, 5);
            System.out.println("Department 1 created successfully.");
        } catch (DepartmentException err) {
            System.out.println("Department 1 failed: " + err.getMessage());
        }

        try {
            departments[1] = new Department("HR", 200, 6);
            System.out.println("Department 2 created successfully.");
        } catch (DepartmentException err) {
            System.out.println("Department 2 failed: " + err.getMessage());
        }

        try {
            departments[2] = new Department("FIN", 150, 5);
            System.out.println("Department 3 created successfully.");
        } catch (DepartmentException err) {
            System.out.println("Department 3 failed: " + err.getMessage());
        }

        try {
            departments[3] = new Department("IT", 500, 5);
            System.out.println("Department 4 created successfully.");
        } catch (DepartmentException err) {
            System.out.println("Department 4 failed: " + err.getMessage());
        }

        try {
            departments[4] = new Department("HR", 250, 3);
            System.out.println("Department 5 created successfully.");
        } catch (DepartmentException err) {
            System.out.println("Department 5 failed: " + err.getMessage());
        }

        try {
            departments[5] = new Department("QA", 499, 10);
            System.out.println("Department 6 created successfully.");
        } catch (DepartmentException err) {
            System.out.println("Department 6 failed: " + err.getMessage());
        }
    }
}

