package week3.role;

import week3.policy.GenerationPolicy;
import week3.policy.SubmitPolicy;

public class Alumni extends Role {
    private String currentJob;

    public Alumni(String name, String major, int generation, String part, String currentJob) {
        super(name, major, generation, part);
        this.currentJob = currentJob;
    }

    public SubmitPolicy getPolicy() {
        return new GenerationPolicy(getGeneration());
    }

    public String getInfo() {
                return "Role: Likelion\n"
                +"Name: "+getName()
                +"\nMajor: " + getMajor()
                +"\nGeneration: "+getGeneration()
                +"\nPart: "+getPart()
                +"\nCurrentJob: "+currentJob;
    }
}