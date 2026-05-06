package class4.package1;

import class4.role.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Role> member = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        while
    }

    private static void registerMember() {
        System.out.println("-- 멤버 등록 --");
        System.out.print("역할 선택 (1: 아기 사자, 2: 운영진): "); String type = sc.nextLine();

        System.out.print("이름: "); String name = sc.nextLine();

        for (Role r : member) {
            if (r.getName().equals(name)) {
                System.out.println("이미 존재하는 이름입니다.");
                return;
            }
        }

        System.out.print("전공: "); String dep = sc.nextLine();
        System.out.print("기수: "); int num = Integer.parseInt(sc.nextLine());
        System.out.print("파트 (백엔드/프론트엔드/기획/디자인): "); String part = sc.nextLine();

        if (type.equals("1")){
            System.out.print("학번: "); int id = Integer.parseInt(sc.nextLine());
            member.add(new Lion(name, dep, num, part, id));
        } else {
            System.out.print("직책 (대표/부대표/파트장/멘토): "); String role = sc.nextLine();
            member.add(new Staff(name, dep, num, part, role));
        }
    }
    private static void showAllMembers() {
        if (member.isEmpty()) {
            System.out.println("fuck");
            return;
        } else {
            for (Role r : member) {
                if (r.checkCanSubmit() == true){
                    System.out.println(+"] "+r.getName());
                    System.out.println("총 "+ member.size()+"명");

                }
                System.out.println(+"] "+r.getName());
                System.out.println("총 "+ member.size()+"명");
            }
        }
    }
}
