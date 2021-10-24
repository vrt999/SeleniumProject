package Practice;


abstract class MyAbstractClass {

    public abstract void a();
    public abstract void b();
}


class foo extends MyAbstractClass {

    @Override
	public void a() {
        System.out.println("hello");
    }

    @Override
	public void b(){
        System.out.println("bye");
    }
}


public abstract class bar extends MyAbstractClass {

    @Override
	public void a() {
        System.out.println("hello");
    }

    public void delta() {
        System.out.println("gamma");
    }
    public static void main(String args[]) {
    	
    }
}
