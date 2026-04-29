package class3.role;

import class3.policy.AlumniAssignmentPolicy;
import class3.policy.AssignmentPolicy;

public class Alumni extends Member {
    private final String company;

    public Alumni(String name, String major, int generation, String part, String company) {
        super(name, major, generation, part);
        this.company = company;
    }

    @Override
    protected AssignmentPolicy getAssignmentPolicy() {
        return new AlumniAssignmentPolicy();
    }

    @Override
    public String getDetailInfo() {
        return "[알럼나이 정보]\n" +
                "이름: " + getName() + "\n" +
                "전공: " + getMajor() + "\n" +
                "기수: " + getGeneration() + "기\n" +
                "파트: " + getPart() + "\n" +
                "직장: " + company;
    }
}