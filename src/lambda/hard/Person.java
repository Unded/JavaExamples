package lambda.hard;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return builder.get().append("Name = ").append(this.name).append(", age = ").append(age).toString();
    }

    private ThreadLocal<StringBuilder> builder = new ThreadLocal<StringBuilder>(){
        @Override
        protected StringBuilder initialValue() {
            return new StringBuilder();
        }
    };
}
