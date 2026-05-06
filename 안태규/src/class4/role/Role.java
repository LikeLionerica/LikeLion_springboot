package class4.role;

import class4.policy.Policy;

public abstract class Role {
    protected String name;
    protected String dep;
    protected int num;
    protected String part;

    public Role(String name, String dep, int num, String part) {
        this.name = name;
        this.dep = dep;
        this.num = num;
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public abstract Policy getPolicy();

    public abstract String getDetails();

    public boolean checkCanSubmit() {
        return getPolicy().canSubmit();
    }
}
