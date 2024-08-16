public class ReportCard2 {
    /**
     * Die Methode "convertGrades" akzeptiert ein ganzzahliges Argument - das
     * Testergebnis - und gibt
     * abhaengig von diesem Argument das Zeichen A, B, C oder D zurueck
     */
    public char convertGrades(int testResult) {
        char grade;
        if (testResult >= 90) {
            grade = 'A';
        } else if (testResult >= 80 && testResult < 90) {
            grade = 'B';
        } else if (testResult >= 70 && testResult < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }

    public static void main(String[] args) {
        ReportCard rc = new ReportCard();
        char yourGrade = rc.convertGrades(88);
        switch (yourGrade) {
            case 'A':
                System.out.println("great!");
                break;
            case 'B':
                System.out.println("good!");
                break;
            case 'C':
                System.out.println("not bad!");
                break;
            case 'D':
                System.out.println("try harder!");
                break;
        }
    }
}