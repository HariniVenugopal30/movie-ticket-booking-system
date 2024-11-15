import java.util.*;
class theater
{
public
int ub,lb;
theater()
{
ub=190;
lb=170;
}
}
class movie1 extends theater
{
public int seatbook(int a)
{
if(a==1)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter total number of seat : ");
int no=sc.nextInt();
int tot=no*ub;
System.out.println("Total amount = "+tot);
System.out.println("Thanks for visiting");
}
else if(a==2)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter total number of seat : ");
int no=sc.nextInt();
int tot=no*lb;
System.out.println("Total amount = "+tot);
System.out.println("Thanks for visiting");
}
return 0;
}
}
class movie2 extends theater
{
public int seatbook(int a)
{
if(a==1)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter total number of seat : ");
int no=sc.nextInt();
int tot=no*ub;
System.out.println("Total amount = "+tot);
System.out.println("Thanks for visiting");
}
else if(a==2)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter total number of seat : ");
int no=sc.nextInt();
int tot=no*lb;
System.out.println("Total amount = "+tot);
System.out.println("Thanks for visiting");
}
return 0;
}
}
class ticketbooking
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("1.Hotstar movie timing\n10.30 am and 6.30 pm\n2.Black movie timing\n2.30 pm and 10.30 pm");
System.out.println("Enter the movie\n1.Hotstar\n2.Black");
int mv=sc.nextInt();
movie1 m1=new movie1();
movie2 m2=new movie2();

System.out.println("Enter the bolcany type");
System.out.println("1.Upper Bolcany = 190");
System.out.println("2.Lower Bolcany = 170");
int tp=sc.nextInt();
if(mv==1){
m1.seatbook(tp);
}
else if(mv==2){
m2.seatbook(tp);
}
}
}