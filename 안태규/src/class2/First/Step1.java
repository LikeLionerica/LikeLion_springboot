package class2.First;

import java.util.Scanner;

public class Step1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("아기사자 이름을 입력해주세요.");
        String nameIn = sc.nextLine();
        System.out.println("전공을 입력해주세요.");
        String depIn = sc.nextLine();
        System.out.println("기수를 입력해주세요.");
        int noIn = sc.nextInt();

        System.out.println("입력값 겁증을 진행합니다.");
        if (nameIn == ""){
            System.out.println("이름은 비어있을 수 없습니다.");
        } else if (depIn == ""){
            System.out.println("전공은 비어있을 수 없습니다.");
        } else if (noIn < 1){
            System.out.println("기수는 1보다 작을 수 없습니다.");
        } else {
            System.out.println("입력값 겁증을 통과하여 아기사자 객체 생성을 진행합니다.");
            Lion cub = new Lion(nameIn, depIn, noIn);
            System.out.println("아기사자 객체를 성공적으로 생성하였습니다.");
            System.out.println("아기사자 정보를 출력합니다.");
            cub.show();
            //System.out.println("이름: "+cub.name+" | 전공: "+cub.department+" | 기수: "+cub.no);
        }
    }
}
