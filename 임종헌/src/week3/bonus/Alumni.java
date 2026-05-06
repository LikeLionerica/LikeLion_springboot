package week3.bonus;

import week3.policy.SubmissionPolicy;
import week3.role.Role;

public class Alumni extends Role {
    private String job;

    public Alumni(String name, String major, int generation, String part, String job) {
        super(name, major, generation, part);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    @Override
    public SubmissionPolicy submissionPolicy() {
        return new AlumniSubmissionPolicy();
    }

    @Override
    public String roleName() {
        return "알럼나이";
    }

    @Override
    public String getInfo() {
        return "👤 이름: " + getName() + " | 🎓 전공: " + getMajor() + " | 📌 기수: " + getGeneration() + " | 💻 파트: " + getPart() + "\n💼 현재 직무: " + job;
    }
}
