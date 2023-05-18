// The annual examination results of 5 students are tabulated as follows:
 
// WAP to read the data and determine the following:		
// •	Total marks obtained by each student
// •	The student who obtained the highest total marks

import java.util.*;
public class exp4{
    public static void main(String Args[]){
        int n=5,max=0,max_rollno=0;
        int marks[] = new int[3];
        int total[] = new int[5];
        int rollno[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++){
            System.out.println("Enter roll number of student ");
            rollno[i] = sc.nextInt();
            System.out.println("Enter marks of student ");
            marks[0] = sc.nextInt();
            marks[1] = sc.nextInt();
            marks[2] = sc.nextInt();
            total[i] = marks[0]+marks[1]+marks[2];
            if(total[i]>max){
                max=total[i];
                max_rollno=rollno[i];
            }
        }

        System.out.println("Roll No\tMarks");
        for(int i=0;i<n;i++){
            System.out.println(rollno[i]+"\t"+total[i]);
        }
        System.out.println("Student with Max Marks: "+ max_rollno);
    }
}