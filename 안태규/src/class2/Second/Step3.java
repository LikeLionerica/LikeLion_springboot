package class2.Second;

import class2.First.Lion;

public class Step3 {
    static void main(String[] args) {
        System.out.println("아기사자 객체를 생성합니다.");
        Lion cub = new Lion("안태규", "컴퓨터", 12);
        System.out.println("아기사자 정보를 출력합니다.");
        cub.show();

        System.out.println("Step 3-1. public 필드 접근을 시도합니다.");
        cub.name = "홍길동";
        //System.out.println("Step 3-2. defualt 필드 접근을 시도합니다.");
        //cub.department = "대학";
        //System.out.println("Step 3-1. private 필드 접근을 시도합니다.");
        //cub.no = 34;
    }
}
