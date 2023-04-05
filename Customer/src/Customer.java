public class Customer {

    //States
    private String name;
    private Address homeAddress;
    private Address workAdress;

    //creating
    public Customer(String name,Address homeAd){
        this.name=name;
        this.homeAddress=homeAd;

    }
    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Customer setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }



    public String toString(){
        return String.format("name - [%s] home address - [%s]   work address - [%s]",name,homeAddress,workAdress);
    }
}
