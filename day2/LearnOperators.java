package week1.day2;

public class LearnOperators {
	public static void main(String[] args)	{
			//ArithmeticOperators
			System.out.println(2+5);
			System.out.println(8/2);//4-->quotient
			System.out.println(11%2);//1->remainder
			//AssignmentOperators
			int a=10,b=5;
			a+=5;//a=a+5
			System.out.println(a);
			b-=15;//b=b-15
			System.out.println(b);//-10
			b*=2;//b=b*2-->-1082=-20
			System.out.println(b);
			//Comparison
			System.out.println(8==8);
			System.out.println(7>=5);
			//LogicalOperators
			System.out.println((5==5)&&(7>=5));//t*t-->1*1--->1--->true
			System.out.println((6<10)&&(7>2));//t*t--->true
			System.out.println((8>9)||(2==1));//false--->0+false(0)--->0--->false
			System.out.println((5==5)&&(7>=5)||(6>3));//t8t--->t+f--->1+0--->1
			
	}
}
	
	