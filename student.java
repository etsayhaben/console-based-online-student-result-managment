class student
{
private String name;
private String sex;
private String id;
private String department;
private int credithours;
private double no_points_earned;  
private double gradeaverage;
private String status;
private String eoutput;
public student()
{
  name="unknown";
  sex="unknown";
  id="9999";
  department="unknown";
  credithours=12;
  gradeaverage=4.0;
  no_points_earned=0.0;
  status="unknown";
  }
public void setname(String name)
{
 this.name=name;
 }
 public String getname()
 {
  return name;
  }
  
   public void setidno(String idno)
{
id=idno;
}
public String getidno()
{
 return id;
 }
public void setsex(String sex)
{
this.sex=sex;
}
public String getsex()
{
 return sex;
 }
 
public void setdepartment(String department)
{
this.department=department;
}
public String getdepartment()
{
 return department;
 }
public void calpointsearned(int crhr,String score)
{
switch(score)
{
case "a+":
case "A+":
case "a":
case "A":
no_points_earned=crhr*4.0;
break;
case "a-":
case "A-":
no_points_earned=crhr*3.75;
break;
case "b+":
case "B+":
no_points_earned=crhr*3.5;
break;
case "b":
case "B":
no_points_earned=crhr*3.0;
break;
case "b-":
case "B-":
no_points_earned=crhr*2.75;
break;
case "c+":
case "C+":
no_points_earned=crhr*2.5;
break;
case "c":
case "C":
no_points_earned=crhr*2.0;
break;
case "c-":
case "C-":
no_points_earned=crhr*1.75;
break;
case "d":
case "D":
no_points_earned=crhr*1.0;
break;
case "f":
case "fx":
System.out.print("ADD THE COURSE");
break;
default:
System.out.print("the grade you entered is invalid");
break;
}
 

  }
public double geteachpointsearned()
{
  return no_points_earned;
  }  
  
  public void calgradeaverage(double totalpoint,int credithours)
  {
     gradeaverage=totalpoint/credithours;
     }
     public double getgradeaverage()
     {
     return gradeaverage;
     }
  
  public void checkstatus(double gradeaverag)
  {
     if(gradeaverag>=2.0)
       status="pass";
       else
       status="fall";
       }
       public String displayStatus()
         {
           return status;
           }
  
    public void seteoutput(String eoutput)
    {
      this.eoutput=eoutput;
          }
           public String geteoutput()
     {
      return eoutput;
      }
      }
   

    
 
