import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String args[]){
        double amount,ruppee,dollar,pound,euro,yen;
        System.out.println("Emter a choice for base currency");
        System.out.println(" 1.Ruppee\n 2.Dollar\n 3.Pound\n 4.Euro\n 5.Yen");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        System.out.println("Emter a choice for Target currency");
        System.out.println(" 1.Ruppee\n 2.Dollar\n 3.Pound\n 4.Euro\n 5.Yen");
        int choice2=sc.nextInt();
        DecimalFormat f=new DecimalFormat("##.##");
        switch(choice)
        {
            case 1:
                System.out.println("Enter an Ruppee amount:");
                     amount=sc.nextDouble();
                     switch (choice2){
                         case 1:
                             ruppee=amount*1;
                             System.out.println(amount+" Ruppee:"+f.format(ruppee)+" Ruppee");
                                break;
                         case 2:
                                dollar=amount*.012;
                             System.out.println(amount+" Ruppee:"+f.format(dollar)+" Dollar");
                             break;
                         case 3:
                             pound=amount*.0094;
                             System.out.println(amount+" Ruppee:"+f.format(pound)+" Pound");
                             break;
                         case 4:
                             euro=amount*.011;
                             System.out.println(amount+" Ruppee"+f.format(euro)+" Euro");
                             break;
                         case 5:
                             yen=amount*3.019;
                             System.out.println(amount+" Ruppee:"+f.format(yen)+" Yen");
                             break;
                         default:System.out.println("Invalid input");
                             break;
                     }
                     break;
            case 2:
                System.out.println("Enter an Dollar amount:");
                amount=sc.nextDouble();
                switch (choice2){
                    case 1:
                            ruppee=amount*82.99;
                        System.out.println(amount+" Dollar"+f.format(ruppee)+" Ruppee");
                        break;
                    case 2:
                        dollar=amount*1;
                        System.out.println(amount+" Dollar:"+f.format(dollar)+" Dollar");
                        break;
                    case 3:
                        pound=amount*0.79;
                        System.out.println(amount+" Ruppee:"+f.format(pound)+" Pound");
                        break;
                    case 4:
                        euro=amount*.91;
                        System.out.println(amount+" Ruppee"+f.format(euro)+" Euro");
                        break;
                    case 5:
                        yen=amount*250.35;
                        System.out.println(amount+" Ruppee:"+f.format(yen)+" Yen");
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                break;
            case 3:
                System.out.println("Enter an Pound amount:");
                amount=sc.nextDouble();
                switch (choice2){
                    case 1:
                        ruppee=amount*106.03;
                       System.out.println(amount+" Pound:"+f.format(ruppee)+" Ruppee");
                        break;
                    case 2:
                        dollar=amount*1.28;
                        System.out.println(amount+" Pound:"+f.format(dollar)+" Dollar");
                        break;
                    case 3:
                        pound=amount*1;
                        System.out.println(amount+" Pound:"+f.format(pound)+" Pound");
                        break;
                    case 4:
                        euro=amount*1.16;
                        System.out.println(amount+" Pound:"+f.format(euro)+" Euro");
                        break;
                    case 5:
                        yen=amount*319.66;
                        System.out.println(amount+" Pound:"+f.format(yen)+" Yen");
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                break;

            case 4:
                System.out.println("Enter an Euro amount:");
                amount=sc.nextDouble();
                switch (choice2){
                    case 1:
                        ruppee=amount*91.15;
                        System.out.println(amount+" Euro:"+f.format(ruppee)+" Ruppee");
                        break;
                    case 2:
                        dollar=amount*1.10;
                        System.out.println(amount+" Euro:"+f.format(dollar)+" Dollar");
                        break;
                    case 3:
                        pound=amount*.86;
                        System.out.println(amount+" Euro:"+f.format(pound)+" Pound");
                        break;
                    case 4:
                        euro=amount*1;
                        System.out.println(amount+" Euro:"+f.format(euro)+" Euro");
                        break;
                    case 5:
                        yen=amount*274.93;
                        System.out.println(amount+" Euro:"+f.format(yen)+" Yen");
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                break;

            case 5:
                System.out.println("Enter an Yen amount:");
                amount=sc.nextDouble();
                switch (choice2){
                    case 1:
                        ruppee=amount*.33;
                        System.out.println(amount+" Yen:"+f.format(ruppee)+" Ruppee");
                        break;
                    case 2:
                        dollar=amount*.0040;
                        System.out.println(amount+" Yen:"+f.format(dollar)+" Dollar");
                        break;
                    case 3:
                        pound=amount*.0031;
                        System.out.println(amount+" Yen:"+f.format(pound)+" Pound");
                        break;
                    case 4:
                        euro=amount*.0036;
                        System.out.println(amount+" Yen:"+f.format(euro)+" Euro");
                        break;
                    case 5:
                        yen=amount*1;
                        System.out.println(amount+" Yen:"+f.format(yen)+" Yen");
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                break;
        }
    }
}
