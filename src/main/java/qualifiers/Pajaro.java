package qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("pajaro")
public class Pajaro extends Animal implements Volador {

	
	public Pajaro(Integer edad, String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}


	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

	
	@Override
	public void volar() {
		log.info("Soy un pájaro volando");
	}
}
