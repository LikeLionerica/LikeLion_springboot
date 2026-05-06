package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j;
        ArrayList lion = new ArrayList();
        do {
            System.out.println("\uD83E\uDD81 저장할 아기사자 수를 5 이상 입력해주세요.");
            int usernumber = Integer.parseInt(sc.nextLine());
            if (usernumber >= 5){
                i = usernumber;
            } else {
                System.out.println("❗ [오류] 5 이상 입력해주세요.");
            }
        } while (i < 5);
        for (j = 0; j < i; j++){
            System.out.println("아기사자 이름을 입력해주세요.");
            String username = sc.nextLine();
            lion.add(username);

        }
        System.out.println("\uD83D\uDCD1 아기사자 명단을 최종적으로 출력합니다.");
        for (j = 0; j < lion.toArray().length; j++){
            System.out.printf("\uD83E\uDD81 %d. %s\n",j+1,lion.get(j));
        }
    }
}
