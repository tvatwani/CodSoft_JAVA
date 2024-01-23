import javax.swing.*;

public class GradeClacluatror {
    public static void main(String args[]){
        int marks1,marks2,marks3;
        marks1=Integer.parseInt(JOptionPane.showInputDialog("enter the marks of subject 1:"));
        marks2=Integer.parseInt(JOptionPane.showInputDialog("enter the marks of subject 2:"));
        marks3=Integer.parseInt(JOptionPane.showInputDialog("enter the marks of subject 3:"));
        int total=marks2+marks1+marks3;
        int percentage=total/3;
        System.out.print("Total Marks:"+total+" Percentage:"+percentage+"% Grade:");
        if(percentage>=85)
        {
            System.out.println("A");
        }
        if (percentage>=75&&percentage<85)
        {
            System.out.println("B");
        }
        if (percentage>=60&&percentage<75){
            System.out.println("C");
        }
        if (percentage>=50&&percentage<60){
            System.out.println("D");
        }
        if(percentage<50){
            System.out.println("E");
        }
    }
}
