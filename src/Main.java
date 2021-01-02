import java.util.Scanner;

public class Main {
    public static CandidateManagement candidateManagement = new CandidateManagement();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter number of candidate you want to add");
                    int number = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNewCandidate();
                    }
                    break;
                case 2:
                    System.out.println("Enter code number of candidate");
                    int codeNumber = Integer.parseInt(scanner.nextLine());
                    candidateManagement.findCandidateByCode(codeNumber);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);

    }

    private static void showMenu() {
        System.out.println("1.Add new candidate");
        System.out.println("2.Find candidate by code");
        System.out.println("0.Exit");
        System.out.println("Enter your choice");
    }

    private static void addNewCandidate() {
        System.out.println("Enter code number of candidate");
        int codeNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name of candidate");
        String name = scanner.nextLine();
        System.out.println("Enter address of candidate");
        String address = scanner.nextLine();
        System.out.println("Enter priority area of candidate (1/2/3)");
        int priorityArea = Integer.parseInt(scanner.nextLine());
        String kindOfGroup;
        boolean invalidGroup = true;
        do {
            System.out.println("Enter group of candidate (A/B/C only)");
            kindOfGroup = scanner.nextLine();
            if (kindOfGroup.equals("A")) {
                invalidGroup = false;
                System.out.println("Enter Math score of candidate");
                double scoreMath = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter Physical score of candidate");
                double scorePhysical = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter Chemistry score of candidate");
                double scoreChemistry = Double.parseDouble(scanner.nextLine());
                CandidateGroupA candidateGroupA = new CandidateGroupA(codeNumber,name,address,priorityArea,scoreMath,scorePhysical,scoreChemistry);
                candidateManagement.addCandidate(candidateGroupA);
                System.err.println("Added successfully");
            } else if(kindOfGroup.equals("B")){
                invalidGroup = false;
                System.out.println("Enter Math score of candidate");
                double scoreMath = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter Chemistry score of candidate");
                double scoreChemistry = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter Biology score of candidate");
                double scoreBiology = Double.parseDouble(scanner.nextLine());
                CandidateGroupB candidateGroupB = new CandidateGroupB(codeNumber,name,address,priorityArea,scoreMath,scoreChemistry,scoreBiology);
                candidateManagement.addCandidate(candidateGroupB);
                System.err.println("Added successfully");
            } else if(kindOfGroup.equals("C")){
                invalidGroup=false;
                System.out.println("Enter Literature score of candidate");
                double scoreLiterature = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter History score of candidate");
                double scoreHistory = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter Geography score of candidate");
                double scoreGeography = Double.parseDouble(scanner.nextLine());
                CandidateGroupC candidateGroupC = new CandidateGroupC(codeNumber,name,address,priorityArea,scoreLiterature,scoreHistory,scoreGeography);
                candidateManagement.addCandidate(candidateGroupC);
                System.err.println("Added successfully");
            }
        } while (invalidGroup);
    }

}
