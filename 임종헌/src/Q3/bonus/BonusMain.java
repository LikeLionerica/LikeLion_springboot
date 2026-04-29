package Q3.bonus;

import Q3.role.Lion;
import Q3.role.Role;
import Q3.role.Staff;

import java.util.Scanner;

public class BonusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 아기사자 정보 입력
        System.out.println("══════ 🦁 아기사자 정보 입력 ══════");
        System.out.print("👤 이름: ");
        String lionName = scanner.nextLine();

        System.out.print("🎓 전공: ");
        String lionMajor = scanner.nextLine();

        System.out.print("📌 기수: ");
        int lionGeneration = scanner.nextInt();
        scanner.nextLine();

        System.out.print("💻 파트 (백엔드/프론트엔드/기획/디자인): ");
        String lionPart = scanner.nextLine();

        System.out.print("🆔 학번: ");
        String studentId = scanner.nextLine();

        // 운영진 정보 입력
        System.out.println("\n══════ 🧑‍💼 운영진 정보 입력 ══════");
        System.out.print("👤 이름: ");
        String staffName = scanner.nextLine();

        System.out.print("🎓 전공: ");
        String staffMajor = scanner.nextLine();

        System.out.print("📌 기수: ");
        int staffGeneration = scanner.nextInt();
        scanner.nextLine();

        System.out.print("💻 파트 (백엔드/프론트엔드/기획/디자인): ");
        String staffPart = scanner.nextLine();

        System.out.print("⭐ 직책 (대표/부대표/파트장/멘토): ");
        String position = scanner.nextLine();

        // 보너스 1: 알럼나이 정보 입력
        System.out.println("\n══════ 🎓 알럼나이 정보 입력 ══════");
        System.out.print("👤 이름: ");
        String alumniName = scanner.nextLine();

        System.out.print("🎓 전공: ");
        String alumniMajor = scanner.nextLine();

        System.out.print("📌 기수: ");
        int alumniGeneration = scanner.nextInt();
        scanner.nextLine();

        System.out.print("💻 파트 (백엔드/프론트엔드/기획/디자인): ");
        String alumniPart = scanner.nextLine();

        System.out.print("💼 현재 직무: ");
        String job = scanner.nextLine();

        // 보너스 2: 조건 정책 테스트를 위한 기수 제한 입력
        System.out.println("\n══════ 📋 조건 정책 테스트 ══════");
        System.out.print("🔢 제출 가능한 최소 기수를 입력하세요: ");
        int minGeneration = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n══════ 📋 결과 출력 ══════\n");

        Role lion = new Lion(lionName, lionMajor, lionGeneration, lionPart, studentId);
        Role staff = new Staff(staffName, staffMajor, staffGeneration, staffPart, position);
        Role alumni = new Alumni(alumniName, alumniMajor, alumniGeneration, alumniPart, job);

        run(lion);
        run(staff);
        run(alumni);

        // 보너스 2: 조건 정책 테스트
        System.out.println("══════ 🔍 조건 정책 결과 ══════\n");
        System.out.println("📌 최소 기수 조건: " + minGeneration + "기 이상");
        System.out.println();

        testGenerationPolicy(lion, minGeneration);
        testGenerationPolicy(staff, minGeneration);
        testGenerationPolicy(alumni, minGeneration);
    }

    private static void run(Role role) {
        System.out.println("🎭 역할: " + role.roleName());
        System.out.println(role.getInfo());
        System.out.println("📝 과제 제출 가능 여부: " + (role.canSubmitAssignment() ? "✅ 가능" : "❌ 불가능"));
        System.out.println("──────────────────────");
    }

    private static void testGenerationPolicy(Role role, int minGeneration) {
        GenerationSubmissionPolicy policy = new GenerationSubmissionPolicy(minGeneration, role.getGeneration());
        System.out.println("👤 " + role.getName() + " (" + role.getGeneration() + "기)");
        System.out.println("📝 기수 조건 충족 여부: " + (policy.canSubmit() ? "✅ 충족" : "❌ 미충족"));
        System.out.println("──────────────────────");
    }
}
