package week3.bonus;

import week3.policy.SubmissionPolicy;

public class GenerationSubmissionPolicy implements SubmissionPolicy {
    private final int minGeneration;
    private final int userGeneration;

    public GenerationSubmissionPolicy(int minGeneration, int userGeneration) {
        this.minGeneration = minGeneration;
        this.userGeneration = userGeneration;
    }

    @Override
    public boolean canSubmit() {
        return userGeneration >= minGeneration;
    }
}
