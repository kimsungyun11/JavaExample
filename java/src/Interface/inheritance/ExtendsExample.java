package Interface.inheritance;

public class ExtendsExample {

	public static void main(String[] args) {
		
		InterfaceClmpl impl = new InterfaceClmpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		// ia.methodB(); x
		System.out.println();
		
		InterfaceB ib = impl;
		// ib.methodA(); x
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();

	}

}
