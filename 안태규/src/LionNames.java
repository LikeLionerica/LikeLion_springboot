import java.util.Scanner;

public class LionNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean go = true;

        while (go) {
            int number = 0;

            while (number < 5) {
                System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");
                try {
                    number = Integer.parseInt(sc.nextLine()); // ✅ Scanner로 통일
                    if (number < 5) {
                        System.out.println("!! [오류] 5 이상 입력해주세요.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("!! [오류] 숫자만 입력할 수 있습니다.");
                }
            }

            String[] namelist = new String[number];

            System.out.println("아기사자 " + number + "명의 이름을 입력해주세요.");
            for (int i = 0; i < number; i++) {
                while (true) {
                    boolean err = true;
                    String input = sc.nextLine();

                    if (input.isEmpty()) {
                        System.out.println("이름이 비어있습니다. 다시 입력해주세요.");
                        err = false;
                    } else {
                        for (int j = 0; j < i; j++) {
                            if (namelist[j].equals(input)) {
                                System.out.println("이미 등록된 이름입니다. 다시 입력해주세요.");
                                err = false;
                                break;
                            }
                        }
                    }

                    if (err) {
                        namelist[i] = input;
                        break;
                    }
                }
            }

            System.out.println("\n아기사자 명단을 최종적으로 출력합니다.");
            for (int i = 1; i <= number; i++) {
                System.out.println(i + ". " + namelist[i - 1]);
            }

            System.out.println("===============");
            System.out.println("프로그램을 종료하려면 'exit'을 입력하세요.");
            System.out.println("계속 아기사자를 등록하려면 'restart'를 입력하세요.");

            while (true) {
                String cmd = sc.nextLine();
                if (cmd.equals("exit")) {
                    go = false;
                    break;
                } else if (cmd.equals("restart")) {
                    break;
                } else {
                    System.out.println("다시 입력해주세요.");
                }
            }
        }

        sc.close();
    }
}