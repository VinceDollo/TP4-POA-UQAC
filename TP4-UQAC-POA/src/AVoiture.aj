import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public aspect AVoiture {
	
	pointcut ajoutVoiture() : execution(void deplacement(..));

	after() : ajoutVoiture() {
		System.out.println("Voiture a fini d'avancer");
	}

	before() : ajoutVoiture() {
		System.out.println("Voiture prete a avancer");
	}
	
	pointcut getSpeed() : execution(int getVitesse(..));

	after() returning(Object o): getSpeed() {
		System.out.println(formatDateTime(LocalDateTime.now()) + "Info logged transversalement. Speed info: " + 0);
	}

	before() : getSpeed() {
		System.out.println("Info logged transversalement: speed info");
	}
}
