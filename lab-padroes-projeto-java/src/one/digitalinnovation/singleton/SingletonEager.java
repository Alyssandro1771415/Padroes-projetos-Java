package one.digitalinnovation.singleton;

/**
 * *Singleton "apressado".
 * @author Alyssandro1771415
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
