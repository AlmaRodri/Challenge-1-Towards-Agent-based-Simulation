package examples.behaviours;
public class DiscreteMaths {
    public float sumX(float x[]) {
        float totalX = 0;

        for (int i = 0; i < x.length; i++)
            totalX = totalX + x[i];
        return totalX;
    }

    public float sumY(float y[]) {
        float totalY = 0;
        for (int i = 0; i < y.length; i++)
            totalY = totalY + y[i];
        return totalY;
    }


    public float sumXY(float x[], float y[]) {

        float totalXY = 0;
        for (int i = 0; i < x.length; i++)
            totalXY = totalXY + (x[i] * y[i]);

        return totalXY;

    }

    public float sumXPow(float x[]) {
        float totalX = 0;

        for (int i = 0; i < x.length; i++)
            totalX = (float) (totalX + Math.pow(x[i], 2));
        return totalX;
    }
}
