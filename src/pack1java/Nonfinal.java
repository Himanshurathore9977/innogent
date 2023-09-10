package pack1java;

abstract class Final {
	public final int a = 10 ; 
	public abstract void absMeth() ; 
	public void normalMeth() {
		System.out.println("hello normal from abstract class  ");
	}
}
interface Second{
	
	 void check(); 
	 static void check2() {
		 System.out.println("Interface static check2 ");
	 } ; 
	 default void check3() {
		System.out.println("Interface Default check3 ");
	};
	 void meth  () ; 
}

class Third {
	static int  var = 10 ; 
	
	int car ; 
	final int inno = 10 ; 
	final int gent ; 
	Third( ){
		gent = 45 ; 
	}
	Third(int val ){
		gent = val ; 
	}
	Third(int gent, int var, int car){
		this.gent = gent ;
		this.car = car ; 
		this.var = var ; 
	}
	//copy constructor 
	Third(Third T1){
		gent = T1.gent ; 
		car = T1.car ; 
		var = T1.var ; 
	}
}

 class GetterSetter{
	private int var1 ;
	private int var2 ; 
	public int getVar1() {
		return var1;
	}
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	public int getVar2() {
		return var2;
	}
	public void setVar2(int var2) {
		this.var2 = var2;
	}
	public int getVar3() {
		return var3;
	}
	public void setVar3(int var3) {
		this.var3 = var3;
	}
	private int var3 ; 
	
}


public class Nonfinal extends   Final implements Second{
	//initialise interface second 
	public void check() {
		System.out.println("Interface public abstract  checked ");
		 check3() ; 
		 Second.check2() ; 
	}
	
	public  void meth() {
		 System.out.println("nonfinal ");
	}
	
	public final void absMeth() {
		System.out.println("hellow");
	}
	public static void methstatic(){
		
	}
	public static void methstatic(int a ) {
		
	}
	public static void main(String[] args) {
		Final f = new Nonfinal() ;
		Nonfinal nf = new Nonfinal() ; 
		Nonfinal nf1 = new Nonfinal() ; 
		nf.absMeth();
		f.absMeth()  ; 
		 // f.meth() ; 
		f.normalMeth();
		nf.meth();
		
		System.out.println(nf.a);
		System.out.println(f.a);
		System.out.println(nf1.a);
		
		
		nf1.check();  
		nf1.check3();
		//nf1.check2() ; 
		Second.check2();
		Third T0 = new Third() ; 
		
		Third T1 = new Third(33) ; 
		System.out.println(T1.var);
		
		T1.var = 20 ; 
		System.out.println(T1.var);
		Third T2 = new Third(66 , 99  , 88) ;
		System.out.println(T2.var );
		System.out.println(T1.car);
		
		System.out.println("t1 " +T1.car);
		System.out.println(T2.car);
		System.out.println(T1.inno);
		
		
		System.out.println(T1.gent);
		System.out.println(T2.gent);
		//System.out.println(T1.inno);
		System.out.println(T0.gent);
		
		//copy  constuctor 
		Third T3 = new Third(T2) ; 
		System.out.println("copy constructor ");
		System.out.println(T3.car);
		System.out.println(T3.gent);
		System.out.println(T3.var);
		
		GetterSetter G1 = new GetterSetter() ; 
		G1.setVar1(10);
		G1.setVar2(30);
		G1.setVar3(40);
		System.out.println(G1.getVar1() ); 
		System.out.println(G1.getVar2()) ; 
		System.out.println(G1.getVar3()); 
		GetterSetter G2 = new GetterSetter() ; 
		System.out.println(G2.getVar1() ); 
		System.out.println(G2.getVar2()) ; 
		System.out.println(G2.getVar3()); 
		
	}

}
class Nonfinal2 extends Final {
	public void absMeth() {
		System.out.println("override");
	}
}
