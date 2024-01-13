import java.util.Scanner;

public class test {
    public  static  void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name,tnak,sex;
        int age;
        String grade = "";
        float s1,s2,s3,average = 0;

        System.out.print("Please Enter your name : "); name = scanner.nextLine();
        System.out.print("Please Enter your sex : "); sex = scanner.next();
        System.out.print("Please Enter your Age : ");age = scanner.nextInt();
        System.out.print("Please Enter your Class : ");tnak = scanner.next();
        System.out.print("Please Enter your Math : ");s1 = scanner.nextFloat();
        System.out.print("Please Enter your Java : ");s2 = scanner.nextFloat();
        System.out.print("Please Enter your Graphic : ");s3 = scanner.nextFloat();

        average = ((s1 + s2 + s3) / 3);

        if (average <= 100 && average > 90) {
             grade = "A";
        } else if (average <= 90 && average > 80){
            grade = "B";
        } else if (average <= 80 && average > 70){
            grade = "C";
        } else if (average <= 70 && average > 60){
            grade = "D";
        }  else if (average <= 60 && average > 50){
            grade = "E";
        }else {
            grade = "F";
        }

        System.out.println("Your Name is : " + name);
        System.out.println("Your Name Sex : " + sex);
        System.out.println("Your Age is : " + age);
        System.out.println("Your Age Class : " + tnak);
        System.out.println("Your Age Math : " + s1);
        System.out.println("Your Age Java : " + s2);
        System.out.println("Your Age Java : " + s3);
        System.out.println("Your Age Average : " + average);
        System.out.println("Your Age Grade : " + grade);

    }
}
