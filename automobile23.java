import java.util.Scanner;
public class automobile {
     public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int ch;
        System.out.println("1.car"+"2.truck");
        System.out.println("enter your choice");
   
             ch=a.nextInt();
        switch(ch)
        {
            case 1:
            {
                Car c =new Car();
                break;
                
            }
            case 2:
            {
                Truck t= new Truck();
                break;
            }
        }
    }
    
}
class Common
{
    String maker,vehicleid;
    float bbvalue;
    int year,noofpassengers;
    Scanner e=new Scanner(System.in);
    Common()
    {
        System.out.println("enter the maker name");
        maker=e.next();
        System.out.println("enter the vehicle identification number");
        vehicleid=e.next();
        System.out.println("enter the blue book value");
        bbvalue=e.nextFloat();
        System.out.println("enter the year");
        year=e.nextInt();
        System.out.println("enter the number of passengers");
        noofpassengers=e.nextInt();
        
        
    }
    public void detail()
    {
        System.out.println("the details are");
        System.out.println("the name of the maker is"+maker);
        System.out.println("the vehicle identification number is"+vehicleid);
        System.out.println("the blue book value is"+bbvalue);
        System.out.println("the year is"+year);
        System.out.println("the number of passengers is"+noofpassengers);
    }
  
}
class Car extends Common
{
    Boolean warranty=true;
    Boolean imported=true;
    int doors,topspeed;
    String size;
    String reardoor;
    Scanner r=new Scanner(System.in);
    Car()
    {
        System.out.println("do the car have warranty");
        warranty=r.hasNextBoolean();
        if(warranty==true)
        {
            System.out.println("the car has the warranty ");
        }
        else
        {
            System.out.println("the car does not have warranty card ");
        }
        System.out.println("is the car imported are native to the country");
        imported=r.hasNextBoolean();
        if(imported==true)
        {
            System.out.println("the car is impoerted");
            
        }
        else
        {
            System.out.println("the car is native to the country");
        }
        System.out.println("enter the number of doors");
        doors=r.nextInt();
        System.out.println("the number of doors in the car is"+doors);
        System.out.println("enter the topspeed of the car");
        topspeed=r.nextInt();
        System.out.println("the topspeed of the car "+topspeed+"miles/hour");
        System.out.println("enter the size of the car");
        size=r.next();
        System.out.println("the size of the car is"+size);
        System.out.println("enter the rear door");
        reardoor=r.next();
        System.out.println("the rear door of the car is"+reardoor);
    }
}
class Truck extends Common
{
    Boolean topper=true;
    String wheels;
    int racks;
    Scanner n=new Scanner(System.in);
    Truck()
    {
        System.out.println("does the truck have the topper");
        topper=n.hasNextBoolean();
        if(topper==true)
        {
            System.out.println("the truck has topper");
        }
        else
        {
            System.out.println("the truck does not have topper");
        }
        System.out.println("enter the wheel type in the truck ");
        wheels=n.next();
        System.out.println("the wheel type in the truck is"+wheels);
        System.out.println("enter the number of racks in the truck");
        racks=n.nextInt();
        System.out.println("the number of tracks in the truck is"+racks);
        
        }
    }
    