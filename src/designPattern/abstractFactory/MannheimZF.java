package designPattern.abstractFactory;

import designPattern.abstractFactory.zutaten.*;

public class MannheimZF extends ZutatenFabrik {

	@Override
	public Kaese createKaese() {
		return new Mozarella();
	}

	@Override
	public Schinken createSchinken() {
		// TODO Auto-generated method stub
		return new PremiumSchinken();
	}

	@Override
	public Salami createSalami() {
		// TODO Auto-generated method stub
		return new SalamiItaliano();
	}
	
}
