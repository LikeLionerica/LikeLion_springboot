package week3.bonus;

import week3.policy.SubmissionPolicy;

public class AlumniSubmissionPolicy implements SubmissionPolicy {

    @Override
    public boolean canSubmit() {
        return false;
    }
}
