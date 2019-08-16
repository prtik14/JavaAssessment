
public class Prime {
	public static int isPrime(int a) {
		int f = 1;
		for(int i=2;i*i<=a;i++) {
			if(a%i==0) {
				f = 0;
				break;
			}
		}
		return f;
	}
	public static int sumOfDigits(int a) {
		int s=0;
		while(a!=0) {
			s+=a%10;
			a/=10;
		}
		return s;
	}
	
	public static void main(String args[]) {
		int A[] = {2,4,6,11,12,23,7};
		int B[] = {0,0,0,0,0,0,0};
		int sum[] = {0,0,0,0,0,0,0};
		for(int i=0;i< A.length ;i++) {
			B[i] = isPrime(A[i]);
			sum[i] = sumOfDigits(A[i]);
		}
		
//		for(int i=0;i< A.length ;i++) {
//			System.out.println(B[i] + "  " + sum[i]);
//			System.out.println();
//		}
		
		for(int i=0;i<A.length;i++) {
			if(B[i]==1 && isPrime(sum[i])==1) {
				System.out.println(A[i]+ " ");
			}
		}
		
	}
}

//TIME COMPLEXITY : N*sqrt(N)
