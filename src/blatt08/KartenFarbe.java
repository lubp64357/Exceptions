package blatt08;

enum KartenFarbe {
	KARO, HERZ, PIK, KREUZ;
	
	 static int farbenWert(KartenFarbe farbe) {
		switch(farbe) {
		case KARO: {return 9;}
		case HERZ: {return 10;}
		case PIK: {return 11;}
		case KREUZ: {return 12;}
		default: {return 0;}
		}
	}

}
