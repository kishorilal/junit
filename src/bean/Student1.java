package bean;

public class Student1 {
    private int sid;
    private Address address;
    public Student1(Address address) {
        this.address = address;
    }



    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void displayInfo(){
        System.out.println("Hello: "+getSid());
        System.out.println(address.toString());
    }
}
