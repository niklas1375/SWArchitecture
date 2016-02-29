package designPattern.abstractFactory;

import designPattern.abstractFactory.zutaten.*;

public class HeidelbergZF extends ZutatenFabrik {

	@Override
	public Kaese createKaese() {
		return new AnalogKaese();
	}

	@Override
	public Schinken createSchinken() {
		return new FormVorderSchinken();
	}

	@Override
	public Salami createSalami() {
		return new SalamiItaliano();
	}

}
