package com.example.demo;

import com.example.demo.Repository.DozentRepository;
import com.example.demo.Repository.LernthemenRepository;
import com.example.demo.Repository.TeilnehmendeRepository;
import com.example.demo.Repository.WochentagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Autowired
	private TeilnehmendeRepository teilnehmendeRepository;

	@Autowired
	private WochentagRepository wochentagRepository;

	@Autowired
	private LernthemenRepository lernthemenRepository;

	@Autowired
	DozentRepository dozentRepository;

	@Override
	public void run(String... args) throws Exception {

		//Beispielobjekt erstellen, testen ob Bild in Datenbank eingefügt wird
		//Blob blob = new SerialArray();

		//Einmaliges einfügen von Daten in die Datenbanken
/**
		 Teilnehmende eintrag1 = new Teilnehmende("Manuel", "Gruber", "bla@gmail.com");
		teilnehmendeRepository.save(eintrag1);

		Teilnehmende eintrag2 = new Teilnehmende("Denis", "Reichert", "nochmehrbla@gmail.com");
		teilnehmendeRepository.save(eintrag2);

		Wochentag wochentag1 = new Wochentag("keine", "keine", "keine", "keine",
				"keine", "keine", LocalDate.now());
		wochentagRepository.save(wochentag1);
		Lernthemen lernthemen1 = new Lernthemen("Projektmanagement");
		lernthemenRepository.save(lernthemen1);
		Lernthemen lernthemen2 = new Lernthemen("Anwendungsentwicklung");
		lernthemenRepository.save(lernthemen2);
		Lernthemen lernthemen3 = new Lernthemen("BWL");
		lernthemenRepository.save(lernthemen3);

		Dozent dozent = new Dozent("Bernhard", "Lang", "bernhard.lang@mischok.academy");
		dozentRepository.save(dozent);
		Dozent dozent1 = new Dozent("Matthias", "Hartmann", "matthias.hartmann@dozent.mischok.academy");
		dozentRepository.save(dozent1);
		Dozent dozent2= new Dozent("Sebastian", "Vater", "sebastian.vater@dozent.mischok.academy");
		dozentRepository.save(dozent2);
		Dozent dozent3 = new Dozent("Marina", "Lang", "marina.lang@dozent.mischok.academy");
		dozentRepository.save(dozent3);
		Dozent dozent4 = new Dozent("Kajetan", "Mischok", "kajetan.mischok@dozent.mischok.academy");
		dozentRepository.save(dozent4);
		Dozent dozent5 = new Dozent("Tobias", "Kurz", "tobias.kurtz@dozent.mischok.academy");
		dozentRepository.save(dozent5);
		Dozent dozent6 = new Dozent("Shkelzen", "Veliqi", "shkelzen.veliqi@dozent.mischok.academy");
		dozentRepository.save(dozent6);
		Dozent dozent7 = new Dozent("Jonas", "Franz", "jonas.franz@dozent.mischok.academy");
		dozentRepository.save(dozent7);
		Dozent dozent8 = new Dozent("Julius", "Mischok", "julius.mischok@dozent.mischok.academy");
		dozentRepository.save(dozent8);
*/

	}
}