package class3.role;

import class3.policy.Policy;
import class3.policy.StaffPolicy;

public class Staff extends Role {
    private String role;

    public Staff(String name, String dep, int num, String part, String role) {
        super(name, dep, num, part);
        this.role = role;
    }

    public Policy getPolicy() {
        return new StaffPolicy();
    }

    public String getDetails() {
        return String.format("역할: 아기사자\n" +
                "이름: %s | 전공: %s | 기수: %d | 파트: %s\n" +
                "직책: %s",
                name, dep, num, part, role);
    }
}
