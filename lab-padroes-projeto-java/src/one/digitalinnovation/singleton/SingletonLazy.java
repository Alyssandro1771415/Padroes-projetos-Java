package one.digitalinnovation.singleton;

/**
 * *Singleton "pregiçoso".
 * @author Alyssandro1771415
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
			}
		return instancia;
	}
}
