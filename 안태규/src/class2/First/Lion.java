package class2.First;

public class Lion {
    public String name;
    String department;
    private int no;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void validate() {
        if (this.name == ""){
            System.out.println("이름이 비어 있습니다.");
            System.out.println("잘못된 아기사자 정보입니다.");
        } else if (this.department == ""){
            System.out.println("전공이 비어 있습니다.");
            System.out.println("잘못된 아기사자 정보입니다.");
        } else if (this.no < 1){
            System.out.println("기수가 1보다 작습니다.");
            System.out.println("잘못된 아기사자 정보입니다.");
        } else {
            System.out.println("아기사자 객체가 자신의 상태를 정상으로 판단했습니다.\n" +
                    "아기사자 정보를 출력합니다.");
            this.show();
        }
    }

    public void show() {
        System.out.println("이름: "+this.name+" | 전공: "+this.department+" | 기수: "+this.no);
    }

    public Lion(String name, String department, int no) {
        this.name = name;
        this.department = department;
        this.no = no;
        //this.validate();
        //this.show();
    }
}
