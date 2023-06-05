package student;
/**
 * This class is responsible for keeping student track
 */
class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.totalFees = 30000;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;  
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void getRemainingBalance(int feesPaid) {
        this.totalFees -= feesPaid;
    }
    
    @Override
    public String toString(){
        return "Student's name "+ name + " " + "Total fees paid so far $" + feesPaid;
    }
    
    
    

    

}