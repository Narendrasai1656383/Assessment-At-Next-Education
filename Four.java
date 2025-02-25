package Assessment;

public class Four {

	public static void main(String[] args) {
		Singleton s=new Singleton(); // here the object for singleton class is created only once and we can use this object for multiple threads
		CustomThread t1=new CustomThread(s);
		t1.start();
	}

}
class CustomThread extends Thread{
	Singleton singleton;
	CustomThread(Singleton singleton){
		this.singleton=singleton; //here we are initializing the object created for singleton class in main method 
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++)
		singleton.display();
	}
}
class Singleton{
	int count=0;
	public synchronized void display() {
		count++;
		System.out.println(count);
	}
}