import javax.swing.*;

public class NumberGame {
    public static void main(String[] args) {
        int a=(int) (Math.random()*(100-0+1)+0);
        System.out.println("You have four chances to guess the number");
        int f=0;
        for (int i=0;i<4;i++)
        {
            int b=Integer.parseInt(JOptionPane.showInputDialog("Enter a number to compare"));
            if (a>b)
            {
                System.out.println("number is high");
            }
            if (a<b)
            {
                System.out.println("number is low");
            }
            if (a==b)
            {
                System.out.println("You guess the correct number");
                f=1;
                break;

            }
        }
        if (f==0)
        {
            System.out.println("you haven't guess the correct number if you want the more rounds for that press 1 or press 2 for exit");
            int c=Integer.parseInt(JOptionPane.showInputDialog("press 1 or 2"));
            switch (c){
                case 1:

                    for (int i=0;i<4;i++)
                    {
                        int b=Integer.parseInt(JOptionPane.showInputDialog("Enter a number to compare"));
                        if (a>b)
                        {
                            System.out.println("number is high");
                        }
                        if (a<b)
                        {
                            System.out.println("number is low");
                        }
                        if (a==b)
                        {
                            System.out.println("You guess the correct number");
                            f=1;
                            break;

                        }
                    }
                    break;

                case 2:
                        break;
                default: break;
            }
        }
        System.out.println("the number is:"+a);
    }
}
