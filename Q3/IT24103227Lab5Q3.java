import java.util.Scanner;
public class IT24103227Lab5Q3{
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int start,end,ReservedDays,price; 
    System.out.print("Enter start date (1-31): ");
    start=input.nextInt();
    System.out.print("Enter start date (1-31): ");
    end=input.nextInt();
    final int PerDayCharge=48000;
    final String lessthan3= "No Discount";
    final int days3_4=10;
    final int MoreOr5=20;

    if (start<0 || start>31 || end>31 || start==0 || end==0){
       System.out.println("Error : Days must be between 1 and 31");
       return;}

    ReservedDays=end-start;

    if (end-start<=0){
       System.out.println("Error : Days must be less than end date");
       return;}

    System.out.println("Room charge Per Day : Rs." + PerDayCharge+"/=");
    System.out.println("Number of days reserved : "+ReservedDays);

    if(ReservedDays>=5){
        price=PerDayCharge*ReservedDays*(100-MoreOr5)/100;
        System.out.println("Total amount to be paid: " +price);}
    else if(ReservedDays>=3){
        price=PerDayCharge*ReservedDays*(100-days3_4)/100;
        System.out.println("Total amount to be paid: "+price);}
    else{
        price=PerDayCharge*ReservedDays;
        System.out.println("Total amount to be paid:" +price+""+"("+lessthan3+")");}
    }

}