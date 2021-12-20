class AtmPinTest{
public static void main(String[] args){

int AtmPin = 1234;
double BalAmount =50000.00;
double WithDrawAmount = 70000.00;

if(AtmPin == 1234){ //goes to invalid pin statemnt//

if(WithDrawAmount %100 ==0){ //if the given amount is dived with 100 goes to next if condition //
			//or else goes to invalid amount statement//

if(BalAmount >= WithDrawAmount){ //if bal amount is > withdrawl amount goes to insufficient funds //

System.out.println("Please take your amount");
System.out.println("Your current Balance is :" + (BalAmount - WithDrawAmount));
System.out.println("Please Visit again");

}else{
System.out.println("Insufficient Funds");
}

}else{
System.out.println("Invalid Amount");
}
}else{
System.out.println("Invalid Pin-Please try again!");
}



}
}