public class Grade {

  static char gradeFunction(double avg) {
    if (avg >= 90) return 'A';
    else if (avg >= 80) return 'B';
    else if (avg >= 70) return 'C';
    else if (avg >= 60) return 'D';
    else return 'F';
  }

  public static void main(String[] args) {

    double[] grades = {85, 78, 92, 88, 76};

    double sum = 0;
    for (double g : grades) {
      sum += g;
    }

    double avg = sum / grades.length;

    System.out.println("Average: " + avg);
    System.out.println("Grade: " + gradeFunction(avg));
  }
}