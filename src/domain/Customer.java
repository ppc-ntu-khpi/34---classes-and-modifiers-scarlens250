package domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private double total;
    
    public Customer(){
            ID=345;
            isNew=true;
            total=45055;
            
        }
    
    public void displayCustomerInfo(){
        System.out.println("ID= "+ID);
        System.out.println("isNew= "+isNew);
        System.out.println("Total purchases are= "+ total);
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int newID) {
      if( newID >= 0){
        ID = newID;}
      else{
        System.out.println("Error: newID:"+newID +" < 0 ");
      }
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean newIsNew) {
        isNew = newIsNew;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double newTotal) {
      if( newTotal >= 0){
        total = newTotal;
      }
      else{
        System.out.println("Error: newTotal:"+newTotal +" < 0 ");
      }
    }
    
}
