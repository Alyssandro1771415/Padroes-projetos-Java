package one.digitalinnovation;

import one.digitalinnovation.facade.Facade;
import one.digitalinnovation.singleton.SingletonEager;
import one.digitalinnovation.singleton.SingletonLazy;
import one.digitalinnovation.singleton.SingletonLazyHolder;
import one.digitalinnovation.strategy.CmportamentoAgressivo;
import one.digitalinnovation.strategy.Comportamento;
import one.digitalinnovation.strategy.ComportamentoDefensivo;
import one.digitalinnovation.strategy.ComportamentoNormal;
import one.digitalinnovation.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//Singleton:
		
		SingletonLazy Lazy= SingletonLazy.getInstancia();
		System.out.println(Lazy);
		Lazy= SingletonLazy.getInstancia();
		System.out.println(Lazy);
		
		SingletonEager Eager= SingletonEager.getInstancia();
		System.out.println(Eager);
		Eager= SingletonEager.getInstancia();
		System.out.println(Eager);
		
		SingletonLazyHolder Holder= SingletonLazyHolder.getInstancia();
		System.out.println(Holder);
		Holder= SingletonLazyHolder.getInstancia();
		System.out.println(Holder);
		
		// Strategy:
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new CmportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();

		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();

		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Alyssandro", "58465-000");
		
	}

}
