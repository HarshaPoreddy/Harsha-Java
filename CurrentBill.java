class CurrentBill{
public static void main(String[] args){

int consumption = 125;

if(consumption >=100 && consumption<110){

System.out.println("You Bill is " + consumption * 2 );
}
else if(consumption >=110 && consumption <=120)
{
System.out.println("You Bill is " + consumption * 2.5);
}

else if(consumption >120 && consumption <=150){
System.out.println("You Bill is " + consumption * 3);
}
else 
System.out.println("You Bill is " + consumption * 4);

}
}