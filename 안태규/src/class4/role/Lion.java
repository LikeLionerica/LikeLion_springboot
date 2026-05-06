package class4.role;

import class4.policy.LionPolicy;
import class4.policy.Policy;

public class Lion extends Role {
    private int stuId;

    public Lion(String name, String dep, int num, String part, int stuId) {
        super(name, dep, num, part);
        this.stuId = stuId;
    }

    public Policy getPolicy() {
        return new LionPolicy();
    }

    public String getDetails() {
        return String.format("역할: 아기사자\n" +
                "이름: %s | 전공: %s | 기수: %d | 파트: %s\n" +
                "학번: %d",
                name, dep, num, part, stuId );
    }
}
