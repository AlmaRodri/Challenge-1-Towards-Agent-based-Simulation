package examples.behaviours;
import java.util.Scanner;
public class Main {
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] nousan) {

        float x;
        DataSet dataSet = new DataSet();
        DiscreteMaths discreteMaths = new DiscreteMaths();
        SLR slr = new SLR(dataSet, discreteMaths);

        System.out.println("Beta 0 = "+ slr.calculateIntersection());
        System.out.println("Beta 1 = "+ slr.calculateSlope());
        slr.printRegEquation(); //imprime la ecuacion de regresion

        System.out.println("Ingresar valor de x: "); //para la prediccion
        x=lector.nextFloat();
        slr.predict(x);

    }
}
