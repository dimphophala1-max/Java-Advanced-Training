package Chapter7.Interfaces;

/**
 * @author : Dimpho Phala
 * Date : 12/10/2026
 **/
public class ShapeRunner {
    public static void main(String[] args) {
        MySquare objSquare = new MySquare(5);
        objSquare.draw();
        objSquare.apply("\u001B[32m");//Green Color
        objSquare.display();

        MyCircle objCircle = new MyCircle(7);
        objCircle.draw();
        objCircle.apply("\u001B[31m");//Red Color
        objCircle.display();
    }
}