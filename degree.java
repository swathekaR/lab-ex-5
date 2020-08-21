package details;
public class degree {
    void getdegree()
    {
        System.out.println("I got a degree");
    }
    public static void main(String[] args)
      {
        degree obj=new degree();
        obj.getdegree();
        obj=new undergraduate();
        obj.getdegree();
        obj=new postgraduate();
        obj.getdegree();
        }
}
  class undergraduate extends degree
{
     public void getdegree()
     {
        System.out.println("I am an undergraduate");
       }
}

class postgraduate extends degree
{
  void getdegree()
    {
        System.out.println("I am a postgraduate");
        
    }
    
}