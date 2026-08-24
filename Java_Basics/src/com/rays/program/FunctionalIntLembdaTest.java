     package com.rays.program;

public class FunctionalIntLembdaTest {
	
	public static void main(String[] args) {
		
	
FunctionalInt f = (a , b) -> {
	return a+b;
	
};

int a = 30;
int b = 30;

System.out.println(f.sum(a, b));


}
}
/*Anonymous Inner Class	Lambda Expression
new FunctionalInt() use hota hai	-> use hota hai
Anonymous class create hoti hai	Lambda expression use hota hai
Code lengthy hai	Code short hai
@Override likhte hain	@Override nahi likhte
this anonymous class ko refer karta hai	this enclosing class ko refer karta hai
Functional interface ke saath use ho sakta hai	Functional Interface ke saath hi use hota hai*/