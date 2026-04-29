package week1;

import java.util.Scanner;

public class LionList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");
        int count = sc.nextInt();
        boolean flag = false;

        while(flag == false)
            if (count < 5) {
                System.out.println("[오류] 5 이상 입력해주세요.");
                System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");
                count = sc.nextInt();
            }
            else {
                flag = true;
            }

        sc.nextLine(); // 엔터 제거
        // nextInt()는 정수부분만 읽기 때문에 count를 입력 받을 때 입력한 enter가 버퍼에 그대로 남아있음

        String[] nameArray = new String[count];

        System.out.println("아기사자 이름을 입력해주세요.");
        for (int i = 0; i < count; i++) {
            nameArray[i] = sc.nextLine();
        }

        System.out.println("아기사자 명단을 최종적으로 출력합니다.");
        for ( int i = 0; i < count; i++) {
            System.out.println(i+1 + ". " + nameArray[i]);
        }
    }
}
