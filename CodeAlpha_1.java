/* Student Grade Tracker Develop a program that allows a teacher to 
enter students' grades and compute their average, highest, and lowest scores. 
You can use arrays or ArrayLists to store the student data.*/



import java.util.*;
import java.util.Collections;
class CodeAlpha_1
{
    static public void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int sum=0,highest,lowest,n,i;
        float avg;
        System.out.println("Enter number of students : ");
        n=ob.nextInt();
        int students_grade[]=new int[n];

        System.out.println("Enter the students grade : ");
        for(i=0;i<n;i++)
        {
            students_grade[i]=ob.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum+=students_grade[i];
        }
        highest=students_grade[0];
        lowest=students_grade[0];
        for(i=0;i<n;i++)
        {
            if(lowest>students_grade[i])
            {
                lowest=students_grade[i];
            }
            if(highest<students_grade[i])
            {
                highest=students_grade[i];
            }
        }
        System.out.println("Lowest grade : "+lowest+"\nHighest grade : "+highest);
        avg=sum/n;
        System.out.println("Average of grades : "+avg);




    }
}
