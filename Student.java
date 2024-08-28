class Student {
    String name;
    int age ;
    
     public void info (String name) {
        System.out.println(name); 
     }
     public void info (int age){
       System.out.println(age); 
     }
     public void info (String name , int age){
       System.out.println(name);
       System.out.println(age);
     }
      }
      class Polymorphism{
        public static void main(String[] args) {
          Student s1 =new Student ();
         s1.name="venkat";
         s1.age=21;


        // s1.info(s1.age);
         s1.info(s1.name);
         s1.info(s1.name , s1.age);
        }
    }
