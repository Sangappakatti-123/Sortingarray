package com.jspider.p11;

import java.util.Arrays;

public class Mainclass1 {
public static void main(String[] args) {
	int []a= {1,5,6,8,2,7,9};
	sort(a);
}

public static void sort(int[] a) {
	
	/*for(int i=0;i<=a.length-1;i++) {
		for(int j=i+1;j<=a.length-1;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;}}
		System.out.print(a[i]+" ");}
	
}*/  
	Arrays.sort(a);
	
	int[] res=new int[a.length];
	 int x=0;
	 int y=a.length-1;
	 int z=a.length-1;
	 for(int i=0;i<=a.length-1;i++) {
		 if(a[i]%2==0) {
			 res[x]=a[i];
			 x++;
		 }
		 if(a[z]%2==1) {
			 res[y]=a[z];
			 y--;
		 }
		 z--;
	 } 
	 System.out.println(Arrays.toString(res));
	 
	 
}
}
