import java.util.*;
public class showstudent
{
public static void main(String args[])
{

 int noofstudents,noofcourses;
 System.out.println("how many students do you want to register");
 Scanner input=new Scanner(System.in);
 noofstudents=input.nextInt();
  student[] students=new student[noofstudents];  
System.out.println("enter data for the students");
System.out.print("===================================\n");
 String[] idno=new String[noofstudents];
 String[] name=new String[noofstudents];
 String[] gender=new String[noofstudents];
 String[] department=new String[noofstudents];
  String eoutput;
  for(int i=0;i<noofstudents;i++)
students[i]=new student();
for(int i=0;i<noofstudents;i++)
{
 System.out.print("enter name of the students  "+(i+1)+" ");
  name[i]=input.next();
 students[i]=new student();
 students[i].setname(name[i]);
 System.out.printf("%15s%5s%8s","enter ",name[i],"\'s gender ");
 gender[i]=input.next();
 students[i].setsex(gender[i]);
 System.out.printf("%15s%5s%8s","enter ",name[i],"\'s department ");
 department[i]=input.next();
 students[i].setdepartment(department[i]);
 System.out.printf("%15s%5s%8s","enter ",name[i],"\'s idno ");
 idno[i]=input.next();
  students[i].setidno(idno[i]);
  System.out.println("how many courses "+name[i]+" has taken ");
  noofcourses=input.nextInt(); 
 eoutput=""; 
   String[] grade=new String[noofcourses];
   eoutput+=String.format("%-1s",i+1);
eoutput +=String.format(". name:-%-15sidno:-%-8ssex:-%-8sdepartment:-%-5s\n\n",students[i].getname(),students[i].getidno(),students[i].getsex(),students[i].getdepartment());
eoutput+=String.format("%-8s%10s%8s%8s\n","coursename","crhr","grade","gpoint");    
 int sum1=0; 
  int[] credithour=new int[noofcourses];
   String[] coursename=new String[noofcourses];
    int[] totalcrhr=new int[noofstudents];
totalcrhr[i]=0;
 for(int j=0;j<noofcourses;j++)
   {
   
   System.out.print("enter course "+(j+1)+" name:-");
   coursename[j]=input.next();
   System.out.print(coursename[j]+" credit hour:-");
   credithour[j]=input.nextInt();
   totalcrhr[i]+=credithour[j];
   System.out.print(coursename[j]+"\'s grade(a-f):-");
   grade[j]=input.next();
   students[i].calpointsearned(credithour[j],grade[j]);
 eoutput+=String.format("%-8s%10s%8s%8s\n",coursename[j],credithour[j],grade[j],students[i].geteachpointsearned());
sum1+=students[i].geteachpointsearned();
      students[i].seteoutput(eoutput);  
   }
   students[i].calgradeaverage(sum1,totalcrhr[i]);
   students[i].checkstatus(students[i].getgradeaverage());
   
   totalcrhr[i]=0;
  
 }
 System.out.println("================================================================================");
 System.out.println("students detail:");
  System.out.println("===============================================================================");
  eoutput="";
  for(int i=0;i<noofstudents;i++)
    {
   System.out.print(students[i].geteoutput());
     System.out.printf("cumulative gpa:%5.2f",students[i].getgradeaverage());
      System.out.print("\tstatus:-"+students[i].displayStatus());
      System.out.print("\n------------------------------------------\n");
      System.out.println();

    
 }
 }
 }
    
