package designPattern.abstractFactory;

import java.util.HashMap;
import designPattern.abstractFactory.zutaten.*;

public abstract class ZutatenFabrik {
	private static HashMap<String, ZutatenFabrik> fabrikListe = new HashMap<>();

	public ZutatenFabrik() {
		fabrikListe.put("Mannheim", new MannheimZF());
		fabrikListe.put("Heidelberg", new HeidelbergZF());
	}

	public static ZutatenFabrik getMultiton(String location) {
		return fabrikListe.get(location);
	}

	public abstract Kaese createKaese();

	public abstract Schinken createSchinken();

	public abstract Salami createSalami();
}
