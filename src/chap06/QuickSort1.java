package chap06;

import java.util.Scanner;

public class QuickSort1 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	static void quickSort(int[] a, int left, int right) {
		int pl=left;
		int pr=right;
		int pivot=a[(pl+pr)/2];
		
		System.out.printf("a[%d]~a[%d]: {", left, right);
		for(int i=left; i<right; i++) {
			System.out.printf("%d, ",a[i]);
		}
		System.out.printf("%d}%n", a[right]);
		
		do {
			while(a[pl]<pivot) pl++;
			while(a[pr]>pivot) pr--;
			if(pl<=pr)
				swap(a, pl++,pr--);
		}while(pl<=pr);
		
		if(left<pr) quickSort(a, left, pr);
		if(pl<right) quickSort(a, pl, right);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("퀵정렬");
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		quickSort(arr, 0, num-1);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}

	}

}
