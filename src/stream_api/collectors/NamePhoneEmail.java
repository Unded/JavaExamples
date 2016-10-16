package stream_api.collectors;

public class NamePhoneEmail {
    Integer id;
    String name;
    String phone;
    String email;

    NamePhoneEmail(int id, String name, String phone, String email){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Phone: "+ this.phone + ", E-mail: " + this.email;
    }
}
