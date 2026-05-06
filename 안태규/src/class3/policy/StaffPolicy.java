package class3.policy;

public class StaffPolicy implements Policy {
    @Override
    public boolean canSubmit() {
        return false;
    }
}
