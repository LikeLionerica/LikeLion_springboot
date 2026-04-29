package class3.role;

import class3.policy.AssignmentPolicy;
import class3.policy.GenerationAssignmentPolicy;

public class Lion extends Member {
    private final String studentId;
    private static final int MINIMUM_GENERATION = 12; // 12기 이상만 제출 가능

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    @Override
    protected AssignmentPolicy getAssignmentPolicy() {
        return new GenerationAssignmentPolicy(getGeneration(), MINIMUM_GENERATION);
    }

    @Override
    public String getDetailInfo() {
        return "[아기사자 정보]\n" +
                "이름: " + getName() + "\n" +
                "전공: " + getMajor() + "\n" +
                "기수: " + getGeneration() + "기\n" +
                "파트: " + getPart() + "\n" +
                "학번: " + studentId;
    }
}