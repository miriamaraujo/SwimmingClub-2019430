package CoachingStaff;

import java.util.Random;

public class CoachFactory {
	private String[] coachNames = { "Daphne", "Derek", "Kristen", "Leticia", "Kieth", "Carletta", "Carolyne", "Jada",
			"Monserrate", "Hung", "Tia", "Halley", "Marlena", "Evelyne", "Reynaldo", "Cristie", "Penny", "Krystina",
			"Tori", "Ruthie", "Vallie", "Roni", "Pierre", "Gaylord", "Katharina", "Sherman", "Dodie", "Leisa", "Merri",
			"Renae" };
	private String[] coachSurnames = { "Shaffer", "Landry", "Landry", "Rocha", "Craig", "Bailey", "Colon", "Thornton",
			"Wilson", "Decker", "Hatfield", "Spence", "Armstrong", "Cameron", "Moses", "Moses", "Lopez", "Stanton",
			"Jordan", "Wong", "Abbott", "Vazquez", "Branch", "Mendez", "Swanson", "Stark", "Mcintosh",

	};
	private String[] coachTitles = { "Head Coach", "Swimming Coach", "Educational Assistant" };

	public CoachFactory() {
		super();
	}

	Random rd = new Random();

	public String getRandomCoachName() {
		String coachNameGenerator = coachNames[rd.nextInt(coachNames.length)];
		return coachNameGenerator;

	}

	public String getRandomCoachSurname() {
		String coachLastNameGenerator = coachSurnames[rd.nextInt(coachSurnames.length)];
		return coachLastNameGenerator;

	}

	public String getRandomCoachTitle() {
		String coachTitleGenerator = coachTitles[rd.nextInt(coachTitles.length)];
		return coachTitleGenerator;

	}

}
