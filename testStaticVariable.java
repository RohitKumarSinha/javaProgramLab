class Student {
   int rollno;
   String first_name;
   String last_name;
   int age;
   
   // constructor
   Student(int r, String fn, String ln, int a){
     rollno = r;
     first_name = fn;
     last_name = ln;
     age = a;
   
   }
   
   void display () {
      System.out.println("Hi my name is " + first_name + " " + last_name + " and my roll no is " + rollno + " and my age is " + age + " years old ");
   
   }

}




public class testStaticVariable {
   public static void main(String args[]){
   
     Student s1 = new Student(101, "Rohit", "Sinha", 21);
     Student s2 = new Student(102, "Ritik", "Sinha", 20);
     
     s1.display();
     s2.display();
   }
}
