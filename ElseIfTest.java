class ElseIfTest{
public static void main(String[] args){

float percentage = 42.02f;
String Name = "Harsha";
if(percentage >=70)
System.out.println(Name + " got first class");

else if (percentage >=60 && percentage <70)    //both conditions needs to be true to pass//
System.out.println(Name + " got second class");

else if (percentage>=50 &&percentage<60)
System.out.println(Name + " got third class");

else if(percentage>=40 &&percentage<50)
System.out.println(Name + " got fourth class");

else
System.out.println(Name +"Faliled");

}
}