package presentationlayer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

import beans.Question;
public class Result 
{
	public static void main(String[] args) 
	{
		Question q1= new Question();
		Question q2= new Question();
		Question q3= new Question();
		
		q1.setQuestionTitle("Maths");
		q2.setQuestionTitle("Science");
		q3.setQuestionTitle("GK");
		
		q1.setQuestionAnswer(1);
		q2.setQuestionAnswer(2);
		q3.setQuestionAnswer(3);
		
		ArrayList<Question> al= new ArrayList<Question>();
		al.add(q1);
		al.add(q2);
		al.add(q3);
		
		Scanner sc = new Scanner(System.in);
		int p=0;
		int marks1=0,marks2=0,marks3=0;
		do
		{
		System.out.println(" 1: Maths\n 2: Science\n 3: GK \n Enter your choice.");
		
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Ques: What is the area of a circle?");
			System.out.println("1. 3.14*r*r");
			System.out.println("2. 3.14*r");
			System.out.println("3. 2.14*r*r");
			System.out.println("4. 3.14*r*r*r");
			System.out.println("Enter your Answer: ");
			int ans=sc.nextInt();
			if(ans==q1.getQuestionAnswer())
			{
				marks1++;
				System.out.println("Correct Answer");
			}
			else if(ans==2||ans==3||ans==4)
			{
				
				System.out.println("Wrong Answer");
			}	
			else
			{
			System.out.println("Invalid Answer Choice.");
			}
			break;
			
		case 2:
			System.out.println("Ques: What is the powerhouse of the cell?");
			System.out.println("1. Nucleus");
			System.out.println("2. Mitochondria");
			System.out.println("3. Ribosomes");
			System.out.println("4. Cell Wall");
			System.out.println("Enter your Answer: ");
			int ans1=sc.nextInt();
			if(ans1==q2.getQuestionAnswer())
			{
				marks2++;
				System.out.println("Correct Answer");
			
			}
			else if(ans1==1||ans1==3||ans1==4)
			{
				System.out.println("Wrong Answer");
			}
			else
			{
			System.out.println("Invalid Answer Choice.");
			}
		break;
		
		case 3:
			System.out.println("Ques: What is the capital of India?");
			System.out.println("1. Kanpur");
			System.out.println("2. Bangalore ");
			System.out.println("3. New Delhi");
			System.out.println("4. Agra");
			System.out.println("Enter your Answer: ");
			int ans2=sc.nextInt();
			if(ans2==q3.getQuestionAnswer())
			{
				marks3++;
				System.out.println("Correct Answer");
			}
			else if(ans2==1||ans2==2||ans2==4)
			{
				
				System.out.println("Wrong Answer");
			}
			else
			{
			System.out.println("Invalid Answer Choice.");
			}
			break;
		
		default:
			System.out.println("the choice you entered is incorrect");
		}
		System.out.println("If you want to continue press 1:");
		p=sc.nextInt();
	}
		while(p==1);
		if(marks1>0)
		{
			BigDecimal bg;
			Long l=new Long("10");
			bg = BigDecimal.valueOf(l*marks1);
			q1.setMarksScored(bg);
		}
		else
		{
			BigDecimal bg;
			Long l=new Long("0");
			bg = BigDecimal.valueOf(l);
			q1.setMarksScored(bg);
		}
		
		if(marks2>0)
		{
			BigDecimal bg;
			Long l=new Long("10");
			bg = BigDecimal.valueOf(l*marks2);
			q2.setMarksScored(bg);
		}
		else
		{
			BigDecimal bg;
			Long l=new Long("0");
			bg = BigDecimal.valueOf(l);
			q2.setMarksScored(bg);
		}
		
		if(marks3>0)
		{
			BigDecimal bg;
			Long l=new Long("10");
			bg = BigDecimal.valueOf(l*marks3);
			q3.setMarksScored(bg);
		}
		else
		{
			BigDecimal bg;
			Long l=new Long("0");
			bg = BigDecimal.valueOf(l);
			q3.setMarksScored(bg);
		}
		
		System.out.println("Your Marks:");
		System.out.println("In Maths: "+q1.getMarksScored());
		System.out.println("In Science: "+q2.getMarksScored());
		System.out.println("In GK: "+q3.getMarksScored());
			
	}
}