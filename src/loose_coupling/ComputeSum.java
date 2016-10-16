package loose_coupling;

public class ComputeSum implements ICompute {
    @Override
    public int toCompute(int a, int b) {
        return a + b;
    }
}
