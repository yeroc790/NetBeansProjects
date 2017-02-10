/*
 * This class uses Pizza.java to keep track of pizza orders
 */
package project15;

/**
 *
 * @author hansenc
 */
public class PizzaOrder {

    private int numPizzas;
    private Pizza[] orders;
    private double cost = 0;
    
    public void setNumPizzas(int numPizzas){
        if(numPizzas<=0){
            System.out.println("Invalid number");
            System.exit(0);
        }else{
            this.numPizzas = numPizzas;
            orders = new Pizza[this.numPizzas];
        }
    }
    
    public void setPizza(int index, Pizza pizza){
        if((index<0)||(index>=numPizzas)){
            System.out.println("Invalid number");
            System.exit(0);
        }else
            orders[index] = pizza;
    }
    /**
     * Precondition: setPizzas has been called
     * @return 
     */
    public double getCost(){
        cost = 0;
        for(Pizza temp: orders){
            cost += temp.getCost(); //Pizza.getCost()
        }
        return cost;
    }
    
    public Pizza getOrder(int index){
        return orders[index];
    }
}
