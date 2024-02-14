package examples.behaviours;
public class SLR {
    private float beta0;
    private float beta1;
    private DataSet dataSet;
    private DiscreteMaths discreteMaths;
    public SLR(DataSet dataSet, DiscreteMaths discreteMaths){
        beta0 = 0;
        beta1 = 0;
        this.dataSet = dataSet;
        this.discreteMaths = discreteMaths;
    }

    public float calculateIntersection(){
        // beta0 = ...
        int n=dataSet.getX().length;
        float beta0Dividend=(discreteMaths.sumY(dataSet.getY())-(discreteMaths.sumX(dataSet.getX())*calculateSlope()));
        float beta0= beta0Dividend/n;
        return beta0;
    }
    public float calculateSlope(){
        // beta1 = ...
        int n=dataSet.getX().length;
        float betaDividend=(n*discreteMaths.sumXY(dataSet.getX(),dataSet.getY())) -(discreteMaths.sumX(dataSet.getX())
                * discreteMaths.sumY(dataSet.getY()));
        float betaDivisor= (float) ((n*discreteMaths.sumXPow(dataSet.getX()))-
                (Math.pow(discreteMaths.sumX(dataSet.getX()),2)));

        float beta1= betaDividend/betaDivisor;

        return beta1;
    }

    public void printRegEquation(){
        System.out.print("La ecuacion de regresion es: y = ");
        System.out.println(calculateIntersection() + " + " +calculateSlope() + "x");
    }

    public void predict(float x){
        float predictY;
        predictY= (calculateIntersection()+(calculateSlope()*x));
        System.out.println("La prediccion de "+ x+ " es: "+ predictY);
    }
}
