package class3.policy;

public class AlumniAssignmentPolicy implements AssignmentPolicy {
    @Override
    public boolean canSubmit() {
        return true;
    }
}