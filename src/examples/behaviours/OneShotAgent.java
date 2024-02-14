package examples.behaviours;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
public class OneShotAgent extends Agent {

  protected void setup() {
    System.out.println("Agent "+ getLocalName() + " started.");
    addBehaviour(new MyOneShotBehaviour());
  } 

  private class MyOneShotBehaviour extends OneShotBehaviour {

    public void action() {
      float x;
      DataSet dataSet = new DataSet();
      DiscreteMaths discreteMaths = new DiscreteMaths();
      SLR slr = new SLR(dataSet, discreteMaths);

      System.out.println("Beta 0 = "+ slr.calculateIntersection());
      System.out.println("Beta 1 = "+ slr.calculateSlope());
      slr.printRegEquation(); //imprime la ecuacion de regresion

      System.out.println("Advertising: 20"); //para la prediccion
      x = 20;
      slr.predict(x);
      System.out.println("Advertising: 56"); //para la prediccion
      x = 56;
      slr.predict(x);
      System.out.println("Advertising: 60"); //para la prediccion
      x = 60;
      slr.predict(x);
    } 

    public int onEnd() {   
       myAgent.doDelete();
       return super.onEnd();
    } 
  }    // END of inner class ...Behaviour
}  
