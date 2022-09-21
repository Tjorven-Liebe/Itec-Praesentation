class Unnamed {
	/**
	* Hier wird das imperative Programm gestartet
	* 
	* Das imperative Programm extendet auf der Hamster.java Klasse
	* also kann man direkt auf ihre Methoden zugreifen.
	* @return void
	*/
	void main() {
		rechtsUm();
		kehrt();
	}

	/**
	* RechtsUm
	* dreht den hamster drei mal nach links, damit dieser nach rechts schaut
	* @return void
	*/
	void rechtsUm() {
		linksUm();
		linksUm();
	}

	/**
	* kehrt
	* dreht den Hamster zwei mal nach links damit er sich um 180° gedreht hat
	* @return void
	*/
	void kehrt() {
		linksUm();
		linksUm();
	}
}
