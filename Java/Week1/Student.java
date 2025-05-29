// class Student{

//     String name;
//     int rollno;
//     int marks;

//     void introduce(){
//         System.out.println("Hi, I am " + name + " and my roll number is " + rollno + ".");
//     }

//     void checkResult(){
//         if(marks >= 40){
//             System.out.println(name + "has passed.");
//         } else{
//             System.out.println(name + "has failed.");

//         }
//     }
// }

//     public class Main {
//         public static void main(String[] args) {
//             Student s1 = new Student();

//             s1.name = "Alok";
//             s1.rollno = 40;
//             s1.marks = 41;

//             s1.introduce();
//             s1.checkResult();
//         }
//     }

class Student {

    String name;
    int rollno;
    int marks;

    void introduce() {
        System.out.println("Hi, I am " + name + " and my roll number is " + rollno + ".");
    }

    void checkResult() {
        if (marks >= 40) {
            System.out.println(name + " has passed.");
        } else {
            System.out.println(name + " has failed.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Alok";
        s1.rollno = 40;
        s1.marks = 41;

        s1.introduce();
        s1.checkResult();
    }
}
