package qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("perro")
public class Perro extends Animal {

	public Perro(@Value("10") Integer edad, @Value("Simon") String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}

}
