//5 Different Ways to sum of an array in java8
import java.util.Arrays;
import java.util.stream.IntStream;

public class SumEle {

	public static void main(String[] args) {
		
		int [] arr= {2,3,4,5,7};
		int sum=Arrays.stream(arr).sum();
		System.out.println(sum);
		
		int sum1=IntStream.of(arr).sum();
		System.out.println(sum1);
		
	   int sum2=Arrays.stream(arr).reduce((x,y)->x+y).getAsInt();
	   System.out.println(sum2);
	   
	   int sum3=Arrays.stream(arr).reduce(Integer::sum).getAsInt();
	   System.out.println(sum3);
	   
	   long sum4=Arrays.stream(arr).summaryStatistics().getSum();
	   System.out.println(sum4);

	}
}
