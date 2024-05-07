package ar.edu.unju.fi.ejercicio06.main;

import ar.edu.unju.fi.ejercicio06.interfaces.funcionales.Converter;
import ar.edu.unju.fi.ejercicio06.model.FelinoDomestico;
import ar.edu.unju.fi.ejercicio06.model.FelinoSalvaje;

public class Main {

	public static void main(String[] args) {
		FelinoSalvaje salvaje1 = new FelinoSalvaje("Tanner", (byte)20, 186f);
		Converter<FelinoSalvaje, FelinoDomestico> converter = x -> new FelinoDomestico(x.getNombre(), x.getEdad(), x.getPeso());
		
		if(Converter.isNotNull(salvaje1)) {
			FelinoDomestico domestico1 = converter.converter(salvaje1);
			converter.MostrarObjeto(domestico1);
		}
		
		
		FelinoDomestico domestico2 = new FelinoDomestico("Garfield", (byte) 45, 12f);
		Converter<FelinoDomestico, FelinoSalvaje> converter1 = x -> new FelinoSalvaje(x.getNombre(), x.getEdad(), x.getPeso());
		
		if(Converter.isNotNull(domestico2)) {
			FelinoSalvaje salvaje2 = converter1.converter(domestico2);
			converter1.MostrarObjeto(salvaje2);
		}
	}

}
