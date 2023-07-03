import java.util.Scanner;

interface Student {
    void displayAcademicScore();
}

interface Sports {
    void displaySportsScore();
}

class Result implements Student, Sports {
    private String name;
    private int academicScore;
    private int sportsScore;

    public Result(String name, int academicScore, int sportsScore) {
        this.name = name;
        this.academicScore = academicScore;
        this.sportsScore = sportsScore;
    }

    public void displayAcademicScore() {
        System.out.println("Academic Score of " + name + ": " + academicScore);
    }

    public void displaySportsScore() {
        System.out.println("Sports Score: " + sportsScore);
    }

    public void displayScores() {
        displayAcademicScore();
        displaySportsScore();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter academic score: ");
        int academicScore = scanner.nextInt();

        System.out.print("Enter sports score: ");
        int sportsScore = scanner.nextInt();

        Result result = new Result(name, academicScore, sportsScore);
        System.out.println("Student Result:");
        result.displayScores();
    }
}
