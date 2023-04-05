public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress=new Address("line 2 ","Hyderabad","501401");
        Customer customer=new Customer("Ranga",homeAddress);
        System.out.println(customer);

        Address workAddress=new Address("new Line2 Hitch city","Hyderabad","501222");
        customer.setWorkAdress(workAddress);

        System.out.println(customer);



    }
}
