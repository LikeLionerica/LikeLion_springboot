package class3;

import class3.role.Lion;
import class3.role.Role;
import class3.role.Staff;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 아기사자 정보 입력 =====");
        System.out.print("이름: "); String lName = sc.nextLine();
        System.out.print("전공: "); String lDep = sc.nextLine();
        System.out.print("기수: "); int lNum = sc.nextInt();
        sc.nextLine();
        System.out.print("파트 (백엔드/프론트엔드/기획/디자인): "); String lPart = sc.nextLine();
        System.out.print("학번: "); int lId = sc.nextInt();
        sc.nextLine();

        Role lion = new Lion(lName, lDep, lNum, lPart, lId);

        System.out.println("\n===== 운영진 정보 입력 =====");
        System.out.print("이름: "); String sName = sc.nextLine();
        System.out.print("전공: "); String sDep = sc.nextLine();
        System.out.print("기수: "); int sNum = sc.nextInt();
        sc.nextLine();
        System.out.print("파트 (백엔드/프론트엔드/기획/디자인): "); String sPart = sc.nextLine();
        System.out.print("직책 (대표/부대표/파트장/멘토): "); String sRole = sc.nextLine();

        Role staff = new Staff(sName, sDep, lNum, sPart, sRole);

        System.out.println("\n===== 결과 출력 =====\n");
        printInfo(lion);
        printInfo(staff);

        sc.close();
    }

    public static void printInfo(Role role) {
        System.out.println(role.getDetails());
        System.out.println("과제 제출 가능 여부: " + (role.checkCanSubmit() ? "가능" : "불가능"));
        System.out.println("-----------------------------------------");
    }
}
