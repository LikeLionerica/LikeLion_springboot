package week3;

import week3.role.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //-------
        System.out.print("likelion information\n");
        System.out.print("Name: ");
        String lionname = sc.next();
        System.out.print("Major: ");
        String lionmajor = sc.next();
        System.out.print("Gen: ");
        int liongen = sc.nextInt();
        System.out.print("Part: ");
        String lionpart = sc.next();
        System.out.print("StudenId: ");
        String studentId = sc.next();
        Role lion = new Lion(lionname, lionmajor, liongen, lionpart, studentId);

        System.out.print("\nStaff Info ");
        System.out.print("Name: ");
        String staffname = sc.next();
        System.out.print("Major: ");
        String staffmajor = sc.next();
        System.out.print("Gen: ");
        int staffgen = sc.nextInt();
        System.out.print("Part: ");
        String staffpart = sc.next();
        System.out.print("Position: ");
        String position = sc.next();
        Role staff = new Staff(staffname, staffmajor, staffgen, staffpart, position);

        System.out.print("\nAlumni Info ");
        System.out.print("Name: ");
        String aluminame = sc.next();
        System.out.print("Major: ");
        String alumimajor = sc.next();
        System.out.print("Gen: ");
        int alumigen = sc.nextInt();
        System.out.print("Part: ");
        String alumipart = sc.next();
        System.out.print("CurrentJob: ");
        String currentjob = sc.next();
        Role alumni = new Alumni(aluminame, alumimajor, alumigen, alumipart, currentjob);

        System.out.print("\n\n");
        infoprint(lion);
        infoprint(staff);
        infoprint(alumni);
        sc.close();
    }
    static void infoprint(Role role) {
        System.out.println(role.getInfo());
        
        boolean result = role.getPolicy().canSubmit();

        System.out.println("Assignment: "+ (result ? "Possible": "Impossible\n"));
    }

    static void pfpolicy(Role role) {
        boolean result = new week3.policy.GenerationPolicy(role.getGeneration()).canSubmit();
        System.out.print("Submit Policy P/F: "+(result ? "Possible" : "Impossible"));
        
    }
}
