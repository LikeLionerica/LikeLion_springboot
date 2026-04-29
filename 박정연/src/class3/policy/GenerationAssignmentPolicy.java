package class3.policy;

public class GenerationAssignmentPolicy implements AssignmentPolicy {
    private final int generation;
    private final int minimumGeneration;

    public GenerationAssignmentPolicy(int generation, int minimumGeneration) {
        this.generation = generation;
        this.minimumGeneration = minimumGeneration;
    }

    @Override
    public boolean canSubmit() {
        return generation >= minimumGeneration;
    }
}