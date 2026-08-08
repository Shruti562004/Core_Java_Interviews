package com.rays.program;

public class TypeCasting {
	
	public static void main(String[] args) {
		//String-->int
		
		
		String num="677";
		int op=Integer.parseInt(num);
		System.out.println(op);
		System.out.println("==============================");
		//String → long
		
		String s1="676657777";
		long lg=Long.parseLong(s1);
		System.out.println(lg);
		System.out.println("==============================");
		//String → float
		String s2="676.657777";
		float fl=Float.parseFloat(s2);
		System.out.println(fl);
		System.out.println("==============================");
		//String → boolean
		String s3="false";
		boolean bg=Boolean.parseBoolean(s3);
		System.out.println(bg);
		System.out.println("==============================");
		//String → double
				String s4="6676.67667676776766";
				double db=Double.parseDouble(s4);
				System.out.println(db);
				System.out.println("==============================");
				
				
				
			//	int → String
				
				int number=56756;
			String y1=	String.valueOf(number);
			System.out.println(y1);
			System.out.println("==============================");
			
			//String → double
			double d1=6676.676;
			String y2= String.valueOf(d1);
			System.out.println(y2);
			System.out.println("==============================");
	}

}
