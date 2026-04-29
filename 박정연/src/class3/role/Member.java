package class3.role;

import class3.policy.AssignmentPolicy;

public abstract class Member {
    private final String name;
    private final String major;
    private final int generation;
    private final String part;

    public Member(String name, String major, int generation, String part) {
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getGeneration() {
        return generation;
    }

    public String getPart() {
        return part;
    }

    protected abstract AssignmentPolicy getAssignmentPolicy();

    public abstract String getDetailInfo();

        public boolean canSubmitAssignment() {
            return getAssignmentPolicy().canSubmit();
        }

        public void printInfo() {
            System.out.println(getDetailInfo());
            System.out.println("과제 제출 가능 여부: " + (canSubmitAssignment() ? "제출 가능" : "제출 불가"));
        }
}