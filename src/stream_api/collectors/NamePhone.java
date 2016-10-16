package stream_api.collectors;

public class NamePhone implements Comparable<NamePhone> {
    Integer id;
    String name;
    String phone;

    NamePhone(int id,String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Phone: "+ this.phone;
    }

    @Override
    public int compareTo(NamePhone element) {
        int result = name.compareTo(element.name);
        if (result != 0) return result;
        return 0;
    }
}
