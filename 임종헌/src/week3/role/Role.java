package week3.role;

import week3.policy.SubmissionPolicy;

public abstract class Role {
    private String name;
    private String major;
    private int generation;
    private String part;

    protected Role(String name, String major, int generation, String part) {
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
    }

    public final String getName() {
        return name;
    }

    public final String getMajor() {
        return major;
    }

    public final int getGeneration() {
        return generation;
    }

    public final String getPart() {
        return part;
    }

    public abstract SubmissionPolicy submissionPolicy();

    public boolean canSubmitAssignment(){
        return submissionPolicy().canSubmit();
    }

    /** 콘솔에서 역할 확인용 */
    public abstract String roleName();

    /** 역할별 상세 정보 반환 */
    public abstract String getInfo();
}