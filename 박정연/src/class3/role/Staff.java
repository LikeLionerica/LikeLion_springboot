package class3.role;

import class3.policy.AssignmentPolicy;
import class3.policy.StaffAssignmentPolicy;

public class Staff extends Member {
    private final String position;

    public Staff(String name, String major, int generation, String part, String position) {
        super(name, major, generation, part);
        this.position = position;
    }

    @Override
    protected AssignmentPolicy getAssignmentPolicy() {
        return new StaffAssignmentPolicy();
    }

    @Override
    public String getDetailInfo() {
        return "[운영진 정보]\n" +
                "이름: " + getName() + "\n" +
                "전공: " + getMajor() + "\n" +
                "기수: " + getGeneration() + "기\n" +
                "파트: " + getPart() + "\n" +
                "직책: " + position;
    }
}