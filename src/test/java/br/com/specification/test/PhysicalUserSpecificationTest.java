package br.com.specification.test;

//import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class PhysicalUserSpecificationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		/*Irá trabalhar com a instância de Specification*/
		//Specification spec = Specification.getInstance();
		//ou
		//Specification spec = Specification.for(User.class);
		
		/*Através desta instância adiciona novas especificações*/
		//spec = spec.addNewSpecificationFor(User.class);
		
		/*Inicia a especificação do objeto verificando se o atributo nome não é vazio*/
		//spec.where('name').isNotEmpty()
		
		/*Verifica se o type está naquele alcance de valores*/
		//.and('type').inRange(Type.values());
		//.and('type').inRange(Type.values(), 'id');
		
		/*Adicionando mais um validador para o mesmo contexto do que foi criado inicialmente*/
		//spec.addNewSpecificationFor(Endereco.class);
		//spec.where('endereco', 'estado', 'cidade', 'pais').isNotNull()
		//.and('number').isGreaterThan(0);
		
		
		/* OUTROS USOS*/
		//Specification spec = Specification.getInstance();
		
	}

}
