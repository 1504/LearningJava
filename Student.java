public class Student {
  int age;
  String race;
  String gender;
  double GPA;
  int grade;
  String name;

  public Student()
  {
    age = 14;
    grade = 9; 
  }

  public Student(int a, String r, String g, double p, int gr, String n)
  {
    age = a;
    race = r;
    gender = g;
    GPA = p;
    grade = gr;
    name = n;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int newAge)
  {
    age = newAge;
  }

  public String getName()
  {
    return name;
  }


  public static void main (String[] args)
  {
    Student test1 = new Student(); 
    Student test2 = new Student(69, "Asian","Male", 4.0, 19, "Doofus");
    int test3 = test2.getAge();
    System.out.println(test3);
    
    test2.setAge(420);
    test3 = test2.getAge();
    System.out.println(test3);

    String test4 = test2.getName();
    System.out.println(test4);
  }
}
