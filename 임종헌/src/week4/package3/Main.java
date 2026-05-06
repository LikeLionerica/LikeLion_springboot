package week4.package3;

import week4.role.Lion;
import week4.role.Role;
import week4.role.Staff;

import java.util.*;

/**
 * Step 3: 보너스 기능 구현
 * - 멤버 삭제 기능
 * - 기수 순 정렬 기능
 * - 파트별 통계 출력
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Role> members = new ArrayList<>();
        Map<String, List<Role>> membersByPart = new HashMap<>();

        boolean running = true;

        while (running) {
            System.out.println("══════ 🦁 멤버 관리 시스템 ══════");
            System.out.println("1. 멤버 등록");
            System.out.println("2. 전체 멤버 조회");
            System.out.println("3. 이름으로 검색");
            System.out.println("4. 파트별 조회");
            System.out.println("5. 멤버 삭제");
            System.out.println("6. 기수 순 정렬 조회");
            System.out.println("7. 파트별 통계");
            System.out.println("8. 종료");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                // 멤버 등록
                System.out.println("\n── 📝 멤버 등록 ──");
                System.out.print("역할 선택 (1: 아기사자, 2: 운영진): ");
                int roleChoice = scanner.nextInt();
                scanner.nextLine();

                System.out.print("👤 이름: ");
                String name = scanner.nextLine();

                // 중복 검사
                boolean isDuplicate = false;
                for (Role member : members) {
                    if (member.getName().equals(name)) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println("❌ 등록 실패: 이미 존재하는 이름입니다.\n");
                    continue;
                }

                System.out.print("🎓 전공: ");
                String major = scanner.nextLine();

                System.out.print("📌 기수: ");
                int generation = scanner.nextInt();
                scanner.nextLine();

                System.out.print("💻 파트 (백엔드/프론트엔드/기획/디자인): ");
                String part = scanner.nextLine();

                Role member;
                if (roleChoice == 1) {
                    System.out.print("🆔 학번: ");
                    String studentId = scanner.nextLine();
                    member = new Lion(name, major, generation, part, studentId);
                } else {
                    System.out.print("⭐ 직책 (대표/부대표/파트장/멘토): ");
                    String position = scanner.nextLine();
                    member = new Staff(name, major, generation, part, position);
                }

                members.add(member);

                if (!membersByPart.containsKey(part)) {
                    membersByPart.put(part, new ArrayList<>());
                }
                membersByPart.get(part).add(member);

                System.out.println("✅ 등록 완료: " + name + "\n");

            } else if (choice == 2) {
                // 전체 멤버 조회
                System.out.println("\n── 📋 전체 멤버 목록 ──");

                if (members.isEmpty()) {
                    System.out.println("📭 등록된 멤버가 없습니다.\n");
                    continue;
                }

                int index = 1;
                for (Role member : members) {
                    System.out.println(index + ". [" + member.roleName() + "] " + member.getName() + " - " + member.getGeneration() + "기");
                    index++;
                }
                System.out.println("📊 총 " + members.size() + "명\n");

            } else if (choice == 3) {
                // 이름으로 검색
                System.out.println("\n── 🔍 이름으로 검색 ──");
                System.out.print("검색할 이름: ");
                String searchName = scanner.nextLine();

                Role found = null;
                for (Role member : members) {
                    if (member.getName().equals(searchName)) {
                        found = member;
                        break;
                    }
                }

                if (found == null) {
                    System.out.println("🔎 검색 결과 없음\n");
                } else {
                    System.out.println("\n✨ [검색 결과]");
                    System.out.println("🎭 역할: " + found.roleName());
                    System.out.println(found.getInfo());
                    System.out.println("📝 과제 제출 가능 여부: " + (found.canSubmitAssignment() ? "✅ 가능" : "❌ 불가능"));
                    System.out.println();
                }

            } else if (choice == 4) {
                // 파트별 조회
                System.out.println("\n── 💻 파트별 조회 ──");

                if (membersByPart.isEmpty()) {
                    System.out.println("📭 등록된 멤버가 없습니다.\n");
                    continue;
                }

                System.out.println("📂 등록된 파트: " + membersByPart.keySet());
                System.out.print("조회할 파트: ");
                String searchPart = scanner.nextLine();

                if (!membersByPart.containsKey(searchPart)) {
                    System.out.println("🔎 해당 파트에 멤버가 없습니다.\n");
                    continue;
                }

                List<Role> partMembers = membersByPart.get(searchPart);
                System.out.println("\n✨ [" + searchPart + " 파트 멤버]");
                int index = 1;
                for (Role member : partMembers) {
                    System.out.println(index + ". " + member.getName() + " (" + member.roleName() + ") - " + member.getGeneration() + "기");
                    index++;
                }
                System.out.println();

            } else if (choice == 5) {
                // 멤버 삭제
                System.out.println("\n── 🗑️ 멤버 삭제 ──");
                System.out.print("삭제할 이름: ");
                String deleteName = scanner.nextLine();

                Role toDelete = null;
                for (Role member : members) {
                    if (member.getName().equals(deleteName)) {
                        toDelete = member;
                        break;
                    }
                }

                if (toDelete == null) {
                    System.out.println("🔎 해당 이름의 멤버가 없습니다.\n");
                } else {
                    // List에서 삭제
                    members.remove(toDelete);

                    // Map에서도 삭제
                    String part = toDelete.getPart();
                    List<Role> partList = membersByPart.get(part);
                    if (partList != null) {
                        partList.remove(toDelete);
                        if (partList.isEmpty()) {
                            membersByPart.remove(part);
                        }
                    }

                    System.out.println("✅ 삭제 완료: " + deleteName + "\n");
                }

            } else if (choice == 6) {
                // 기수 순 정렬 조회
                System.out.println("\n── 📊 기수 순 정렬 조회 ──");

                if (members.isEmpty()) {
                    System.out.println("📭 등록된 멤버가 없습니다.\n");
                    continue;
                }

                List<Role> sortedMembers = new ArrayList<>(members);
                sortedMembers.sort(Comparator.comparingInt(Role::getGeneration));

                int index = 1;
                for (Role member : sortedMembers) {
                    System.out.println(index + ". [" + member.getGeneration() + "기] " + member.getName() + " (" + member.roleName() + ")");
                    index++;
                }
                System.out.println();

            } else if (choice == 7) {
                // 파트별 통계
                System.out.println("\n── 📈 파트별 통계 ──");

                if (membersByPart.isEmpty()) {
                    System.out.println("📭 등록된 멤버가 없습니다.\n");
                    continue;
                }

                for (String part : membersByPart.keySet()) {
                    int count = membersByPart.get(part).size();
                    System.out.println(part + ": " + count + "명");
                }
                System.out.println("───────────");
                System.out.println("총 멤버: " + members.size() + "명\n");

            } else if (choice == 8) {
                running = false;
                System.out.println("👋 프로그램을 종료합니다.");
            } else {
                System.out.println("⚠️ 잘못된 입력입니다.\n");
            }
        }
    }
}
