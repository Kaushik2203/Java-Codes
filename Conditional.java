public class Conditional {
    private int marks;

    public Conditional(int marks) {
        this.marks = marks;
      
    }

    public char assignGrade() {
        if(marks < 0 || marks > 100){
            return 'X';
        }
        if(marks >= 90){
            return 'A';
        }
        if(marks >= 80){
            return 'B';
        }
        if(marks >= 70){
            return 'C';
        }
        if(marks >= 60){
            return 'D';
        }
        if(marks >= 50){
            return 'E';
        }
        
        return 'F';
    }
    public static void main(String[] args) {
        Conditional student = new Conditional(85); 
        System.out.println("The grade is: " + student.assignGrade());

    }
}
