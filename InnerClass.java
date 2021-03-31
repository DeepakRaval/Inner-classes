package singletonClassExample;

public class InnerClass {

	public static void main(String[] args) {
		// creating object of classA i.e. upper class
		classA a = new classA();

		/* Way to access inner class which is instance */
		classA.Student std = a.new Student();
		std.stdId = 1;
		std.stdName = "Ram";
		System.out.println("Student persentile = " + std.getPercentile() + " %");

		/* Way to access static inner class */
		classA.Employee emp = new classA.Employee();
		System.out.println("from classC in its method " + emp.getTotalSalary() + " lac/annum");
		
		/*Anonymous class or in line implementation*/
		I ineterface = new I() {
			public void m1(){
				System.out.println("inside m1 method");
			}
		};
		ineterface.m1();
		
		/*Way to acces local class*/
		InnerClass ic = new InnerClass();
		ic.method1();
	}
	
	public void method1(){
		// Local class
		class LocalClass {
			int i;
			void m1(){
				System.out.println("inside m1 of local class");
			}
		}
		LocalClass lc = new LocalClass();
		lc.m1();
		lc.i = 10;
		System.out.println(lc.i);
 	}

}

// upper class
class classA {

	double no_Team;

	// first inner class student
	class Student {
		int stdId;
		String stdName;

		double getPercentile() {
			return 6.2;
		}
	}

	// second static inner class Employee
	static class Employee {
		double empId;
		String EmpName;

		double getTotalSalary() {
			return 5.6;
		}
	}

}
// interface 
interface I {
	void m1();
}
