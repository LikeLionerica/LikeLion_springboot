package class2.First;

import java.util.Scanner;

public class Step2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("아기사자 이름을 입력해주세요.");
        String nameIn = sc.nextLine();
        System.out.println("전공을 입력해주세요.");
        String depIn = sc.nextLine();
        System.out.println("기수를 입력해주세요.");
        int noIn = sc.nextInt();
        Lion cub = new Lion(nameIn, depIn, noIn);
        System.out.println("객체 생성이 완료되었습니다. 아기사자 객체의 상태를 확인합니다.");
        cub.validate();
    }
}
