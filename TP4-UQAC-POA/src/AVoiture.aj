import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public aspect AVoiture {
	
	pointcut ajoutVoiture() : execution(void deplacement(..));

	after() : ajoutVoiture() {
		System.out.println(formatDateTime(LocalDateTime.now()) + " - Info logged transversalement: état voiture : Voiture a fini d'avancer");
	}

	before() : ajoutVoiture() {
		System.out.println(formatDateTime(LocalDateTime.now()) + " - Info logged transversalement: état voiture : Voiture prete a avancer");
	}

	pointcut getSpeed() : call(int getVitesse(..));

	after() returning(Object o) : getSpeed() {
		System.out.println(formatDateTime(LocalDateTime.now()) + " - Info logged transversalement: Speed info: " + o.toString());
	}

	before() : getSpeed() {
		System.out.println(formatDateTime(LocalDateTime.now()) + " - Info logged transversalement: speed info");
	}

	private String formatDateTime(LocalDateTime now) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		return now.format(format);
	}

	
}
