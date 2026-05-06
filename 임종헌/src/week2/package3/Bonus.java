package week2.package3;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 객체 생성
        System.out.println("🦁 아기사자 이름을 입력해주세요.");
        String name = sc.nextLine();

        System.out.println("🎓 전공을 입력해주세요.");
        String major = sc.nextLine();

        System.out.println("📌 기수를 입력해주세요.");
        int generation = sc.nextInt();
        sc.nextLine();

        Lion_Bonus lion = new Lion_Bonus(name, major, generation);
        System.out.println("✅ 유효한 값으로 아기사자 객체가 생성되었습니다.");
        lion.printInfo();


        // 2. 상태 변경 루프
        while (true) {
            System.out.println(" ===================\n" +
                    "❓아기사자 정보를 수정하시겠습니까? (네 / 아니요)");
            String answer = sc.nextLine();

            if (answer.equals("아니요")) {
                System.out.println("📌 아기사자 정보 수정을 종료합니다.");
                break;
            }

            if (!answer.equals("네")) {
                System.out.println("❌ '네' 또는 '아니요'로 입력해주세요.");
                continue;
            }

            System.out.println("✏️ 수정할 정보를 입력해주세요. (이름 / 전공 / 기수)");
            String updateField = sc.nextLine();

            switch (updateField) {
                case "이름":
                    System.out.println("✏️ 변경할 이름을 입력해주세요.");
                    String newName = sc.nextLine();
                    lion.changeName(newName);
                    break;

                case "전공":
                    System.out.println("✏️ 변경할 전공을 입력해주세요.");
                    String newMajor = sc.nextLine();
                    lion.changeMajor(newMajor);
                    break;

                case "기수":
                    System.out.println("✏️ 변경할 기수를 입력해주세요.");
                    int newGeneration = sc.nextInt();
                    sc.nextLine();
                    lion.changeGeneration(newGeneration);
                    break;

                default:
                    System.out.println("❌ '이름', '전공', '기수' 중 하나를 입력해주세요.");
                    continue;
            }

            lion.printInfo();
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
