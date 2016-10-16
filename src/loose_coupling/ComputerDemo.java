package loose_coupling;

public class ComputerDemo {
    public static void main(String[] args) {
        ICompute compSum = new ComputeSum();
        Compute comp = new Compute(compSum);
        comp.toCompute(10,234);

        ICompute compResid = new ComputeResidual();
        comp = new Compute(compResid);
        comp.toCompute(15, 908);

    }
}
