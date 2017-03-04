package collections.map.hashmap_test;

public class PPerson {
    String name;
    Integer age;

    public PPerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object person) {
        if (this == person) return true;
        if (person == null || getClass() != person.getClass()) return false;
        PPerson tempPerson = (PPerson) person;

        return ((age.equals(tempPerson.age)) | (!name.equals(tempPerson.name)));
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31 * result + age.hashCode() + name.hashCode();
        return result;
    }
}
