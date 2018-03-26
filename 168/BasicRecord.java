public class BasicRecord { 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double average;
        Student[] stu = new Student[3];
        
        for(int i = 0; i < 3; i++) {
            stu[i] = new Student();
            System.out.print("Enter name: ");
            stu[i].name = sc.nextLine();
            System.out.print("Enter grade: ");
            stu[i].grade = Integer.parseInt(sc.nextLine());
            System.out.print("Enter average: ");
            stu[i].average = Double.parseDouble(sc.nextLine());
        }
    }
}
class Student {
    String name;
    int grade;
    double average;
}
