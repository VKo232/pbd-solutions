public class BasicRecord { 

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Scanner sc = new Scanner(System.in);
        double average;
        
        System.out.print("Enter name1: ");
        stu1.name = sc.nextLine();
        System.out.print("Enter grade1: ");
        stu1.grade = Integer.parseInt(sc.nextLine());
        System.out.print("Enter average1: ");
        stu1.average = Double.parseDouble(sc.nextLine());
        
        System.out.print("Enter name2: ");
        stu2.name = sc.nextLine();
        System.out.print("Enter grade2: ");
        stu2.grade = Integer.parseInt(sc.nextLine());
        System.out.print("Enter average2: ");
        stu2.average = Double.parseDouble(sc.nextLine());
        
        System.out.print("Enter name3: ");
        stu3.name = sc.nextLine();
        System.out.print("Enter grade3: ");
        stu3.grade = Integer.parseInt(sc.nextLine());
        System.out.print("Enter average3: ");
        stu3.average = Double.parseDouble(sc.nextLine());
        
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
