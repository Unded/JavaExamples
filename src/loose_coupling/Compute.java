package loose_coupling;

public class Compute {
    private ICompute comp;

    public Compute(ICompute comp){
        this.comp = comp;
    }

    public void toCompute(int a, int b){
        System.out.println(comp.toCompute(a,b));

    }
}
