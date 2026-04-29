package week3.policy;

public class GenerationPolicy implements SubmitPolicy {
    private int generation;

    public GenerationPolicy(int generation) {
        this.generation = generation;
    }

    public boolean canSubmit() {
        return generation >= 14;
    }
}