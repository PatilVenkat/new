
 public class parent {
    void Print()
    {
        System.out.println("parent class");
    }
}
class subclass1 extends parent {
    void Print() { System.out.println("subclass1"); 
}
}

class subclass2 extends parent {
    void Print()
    {
        System.out.println("subclass2");
    }
}
class GFG {
    public static void main(String[] args)
    {
      parent a;
        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}