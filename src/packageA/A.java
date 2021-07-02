package packageA;

 class B {
       // Default data member
  void displayB()
	{
		System.out.println("In DisplayB() method");
	}
 }
 public class A {
     protected void displayA()
		{
			System.out.println("In DisplayA() method");
		}

		public static void main(String[] args) 
		{
			B obj = new B();
			obj.displayB(); // Accessed displayB() from another class "B" within the same package.

		}

	}
 
