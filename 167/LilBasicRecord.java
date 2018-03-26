public class LilBasicRecord { 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double average;
        Student[] stu = new Student[3];
        
        for(int i = 0; i < 3; i++) {
            stu[i] = new Student();
        }
        
        System.out.print("Enter name1: ");
        stu[0].name = sc.nextLine();
        System.out.print("Enter grade1: ");
        stu[0].grade = Integer.parseInt(sc.nextLine());
        System.out.print("Enter average1: ");
        stu[0].average = Double.parseDouble(sc.nextLine());
        
        System.out.print("Enter name2: ");
        stu[1].name = sc.nextLine();
        System.out.print("Enter grade2: ");
        stu[1].grade = Integer.parseInt(sc.nextLine());
        System.out.print("Enter average2: ");
        stu[1].average = Double.parseDouble(sc.nextLine());
        
        System.out.print("Enter name3: ");
        stu[2].name = sc.nextLine();
        System.out.print("Enter grade3: ");
        stu[2].grade = Integer.parseInt(sc.nextLine());
        System.out.print("Enter average3: ");
        stu[2].average = Double.parseDouble(sc.nextLine());
        
        System.out.println("The names are " + stu1.name + " " + stu2.name + " " +stu3.name)
        System.out.println("The grades are " + stu1.grade + " " + stu2.grade + " " +stu3.grade);
        System.out.println("The averages are " + stu1.average + " " + stu2.average + " " +stu3.average);

        average = stu1.average + stu2.average + stu3.average;
        average /= 3;
        System.out.println("Total average : " + average);
        
    }
}
class Student {
    String name;
    int grade;
    double average;
}
