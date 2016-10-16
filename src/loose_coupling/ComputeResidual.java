package loose_coupling;

public class ComputeResidual implements ICompute {
    @Override
    public int toCompute(int a, int b) {
        return a - b;
    }
}
