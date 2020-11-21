package test;
import domain.Customer;
public class CustomerTest {
    
    public static void main(String[] args){
        Customer cus = new Customer();
        cus.displayCustomerInfo();
        cus.setIsNew(false);
        cus.setID(21);
        cus.setTotal(993.12);
        cus.displayCustomerInfo();
        
    }
    
}