package lambda.simple;

public interface IMyNum<T extends Comparable<T>>{
    T getObj();
}
