public aspect AVoiture {
	
	pointcut ajoutVoiture() : execution(void deplacement(..));

	after() : ajoutVoiture() {
		System.out.println("Voiture a fini d'avancer");
	}

	before() : ajoutVoiture() {
		System.out.println("Voiture prete a avancer");
	}
}