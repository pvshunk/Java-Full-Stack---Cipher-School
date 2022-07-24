package Bus_reservation_system;

public class Address {
    private String street;
    private String city;
    private String State;

    public Address()
    {

    }

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        State = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
