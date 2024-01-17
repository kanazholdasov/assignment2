import models.Point;
import models.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\kanag\\Desktop\\Kana_ass1\\src\\source");

        Scanner scanner = new Scanner(inputFile);
        Shape myShape = new Shape();

        while (scanner.hasNext()) {
            double xCoord = scanner.nextDouble();
            double yCoord = scanner.nextDouble();

            Point myPoint = new Point(xCoord, yCoord);
            myShape.addPoint(myPoint);
        }
        System.out.println(myShape.getAverageSide());
        System.out.println(myShape.calculatePerimeter());
        System.out.println(myShape.getLongestSide());
    }
}
