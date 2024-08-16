public class ReportCard {
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
        System.out.println("your first grade " + yourGrade);
        yourGrade = rc.convertGrades(76);
        System.out.println("your second grade " + yourGrade);
    }
}
