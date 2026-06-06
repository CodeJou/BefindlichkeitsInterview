package befindlichkeitsinterview;

import java.util.Scanner;

public class Befindlichkeitsinterview {

	public static void main(String[] args) {
		// Hier startet das Interview zur Feststellung des Befindens
		
		//(1) Frage nach dem Namen
	    System.out.println("Hey, mein Name ist Lou. Wie heißt du?");
		
		//(1) Antwort via Scanner ermöglichen
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		//(1) Begrüßung mit Namen
		System.out.println("");
		System.out.println("Hallo "+name+", es freut mich dich kennenzulernen :-).");
		
		//(1) Erläuterung des Programms
		System.out.println("");
		System.out.println("Dieses kleine Programm führt ein Interview durch, um deine Befindlichkeit festzustellen.");
		System.out.println("Es warten ein paar einfach gehaltene Fragen zur Beantwortung auf dich.");
		System.out.println("Auch ein paar Fakten stehen bereit, die du bei Bedarf überspringen kannst.");
		System.out.println("");
		
		//(2) Frage nach Einverständnis
		System.out.println("Hast du Lust auf ein kleines Interview? (Eingabe ja oder nein)");
		
		
		//(2) Antwort via Scanner ermöglichen
		String antwort_2 = scanner.nextLine();
		
		//(2) Eingabe überprüfen ob JA/Nein eingegeben wurde (Erneutes Fragen, falls eine andere Eingabe getätigt wurde)
		while (!antwort_2.equalsIgnoreCase("ja")&&!antwort_2.equalsIgnoreCase("nein"))
		{ System.out.println("");
		  System.out.println("[ Meldung: Es sind nur Ja/Nein Aussagen gestattet! ]");
		  antwort_2 = scanner.nextLine();
		  antwort_2 = antwort_2.toUpperCase();}
		
		//(2) If else Abfrage
		if (antwort_2.equalsIgnoreCase("ja"))
		{ System.out.println("");
          System.out.println("Super, dann pack ich Notitzheft und Kugelschreiber auf den Tisch!"); }
		else
		{ System.out.println("");
		  System.out.println("Na gut, dann ein anderes mal :-).");
		  return; }
		
		
		//(3) Frage Schlafquallität
		System.out.println(name+", auf einer Skala von 1 (sehr schlecht) bis 10 (sehr gut): Wie hast du die letzte Nacht geschlafen? (Nenne mir die passende Zahl) ");
		
		//(3) Antwort via Scanner ermöglichen
		int antwort_3 = scanner.nextInt();
		
		//(3) Eingabe prüfen ob Zahl von 1 bis 10 eingegeben wurde
		while (antwort_3<1|antwort_3>10)
		{ System.out.println("");
		  System.out.println("[ Meldung: Bitte gib eine ganze Zahl von 1 bis 10 ein! ]");
		  antwort_3 = scanner.nextInt();}
		
		//Enter aufräumen
		scanner.nextLine();
		
		//(3) Danke
		System.out.println("");
		System.out.println("Danke für deine Eingabe.");
		
		//(3) Fakt zur Schlafqualität
		System.out.println("Möchtest du einen kleinen Fakt zur Schlafqualität hören? (Eingabe ja oder nein)");
		
		
		//(3) Antwort via Scanner ermöglichen
		String antwort_fakt = scanner.nextLine();
		
		//(3) Eingabe prüfen ob JA/NEIN eingegeben wurde
		while (!antwort_fakt.equalsIgnoreCase("ja")&&!antwort_fakt.equalsIgnoreCase("nein"))
		{ System.out.println("");
		  System.out.println("[ Meldung: Es sind nur Ja/Nein Aussagen gestattet! ]");
		  antwort_fakt = scanner.nextLine();
		  antwort_fakt = antwort_fakt.toUpperCase();}
			
		//(3) If else anweisung
		if (antwort_fakt.equalsIgnoreCase("ja"))
		{ System.out.println("");
		  System.out.println("  [ Fakt zur Schlafqualität ]");
		  System.out.println("");
		  System.out.println("  Schon eine Nacht mit zu wenig Schlaf kann die Gedächnisleistung verschlechtern.");
		  System.out.println("  Die gute Nachricht: Eine anschließende Nacht mit qualitativ hochwertigem Schlaf, ");
	      System.out.println("  kann einen Teil dieser Einbußen wieder ausgleichen.");
	      System.out.println("");
	      System.out.println("  Quellenangabe Baena et al. (2020): Weakly encoded momories due to acute sleep restriction (...), veröffentlicht in Scientific Reports.");
	      System.out.println("");}
		else 
		{ System.out.println("");
		  System.out.println("Kein Fakt erwünscht! verstehe :-).");}
		    
		    
		  //(4) Frage zur Stimmung
		System.out.println("Okey "+name+" machen wir weiter mit der nächsten Frage.");
		System.out.println("Wie ist deine Stimmung gerade auf einer Skala von 1 (sehr schlecht) bis 10 (sehr gut)? (Nenn mir die passende Zahl)");
		
		//(4) Antwort via Scanner ermöglichen
		int antwort_4 = scanner.nextInt();
		
		//(4) Wenn Eingabe kleiner als 1 oder größer als 10 ist, kommt eine while-schleife
		while (antwort_4<1|antwort_4>10)
		{ System.out.println("");
		  System.out.println("[ Meldung: Bitte gib eine ganze Zahl von 1 bis 10 an! ]");
		  antwort_4 = scanner.nextInt();}
		
		//Enter aufräumen
		scanner.nextLine();
		
		//(4) Danke
		System.out.println("");
		System.out.println("notiert!");
		
		//(4)Fakt zur Stimmung
		System.out.println(name+", ich hätte da einen kleinen Fakt zum Thema Stimmung für dich. Möchtest du ihn hören? (Eingabe ja oder nein)");
		
		//(4)Antwort via Scanner ermöglichen
		String antwort_fakt_2 = scanner.nextLine();
		
		//(4)Eingabe prüfen ob JA/NEIN eingegeben wurde
		while (!antwort_fakt_2.equalsIgnoreCase("ja")&&!antwort_fakt_2.equalsIgnoreCase("nein"))
		{ System.out.println("");
		  System.out.println("[ Meldung: es sind nur Ja/Nein Aussagen gestattet! ]");
		  System.out.println("");
		  antwort_fakt_2 = scanner.nextLine();
		  antwort_fakt_2 = antwort_fakt_2.toUpperCase();}
		
		//(4) If else Anweisung
		if (antwort_fakt_2.equalsIgnoreCase("ja"))
		{ System.out.println("");
		  System.out.println("  [ Fakt zur Stimmung ]");
		  System.out.println("");
		  System.out.println("  Lächeln ist nicht nur ein Ausdruck von Freude - es kann auch ein Werkzeug sein, um die eigene ");
		  System.out.println("  Stimmung ein wenig anzuheben. (Wir sollten alle viel mehr für uns selbst Lächeln, ist meine Meinung)");
		  System.out.println("");
		  System.out.println("  Quelle : Coles, Larsen & Lech (2019), A meta-analysis of the facial feedback literature, veröffentlicht in Psychological Bulletin.");
		  System.out.println("");}
		else
		{ System.out.println("");
		  System.out.println("Dann ist jetzt Fakt, das wir weiter machen :-).");}
		
		
		//(5)Info zum Stresslevel
		System.out.println("In der nachfolgenden Frage wirst du dein Stresslevel in Prozenten einschätzen. ");
		System.out.println("Möchtest du zuvor eine Erklärung zur Anspannungskurve um dich besser einschätzen zu können? (Eingabe ja oder nein)");
		
		//(5)Antwort via Scanner ermöglichen
		String antwort_erklärung = scanner.nextLine();
		
		//(5)Eingabe prüfen ob JA/NEIN eingegeben wurde
		while (!antwort_erklärung.equalsIgnoreCase("ja")&&!antwort_erklärung.equalsIgnoreCase("nein"))
		{ System.out.println("");
		  System.out.println("[ Mitteilung: Es sind nur Ja/Nein Aussagen gestattet! ]");
		  antwort_erklärung = scanner.nextLine();
		  antwort_erklärung = antwort_erklärung.toUpperCase();}
		
		//(5) if else Anweisung
		if  (antwort_erklärung.equalsIgnoreCase("ja"))
		{ System.out.println("");
		  System.out.println("  [ Erklärung zur Selbsteinschätzung der Anspannung ]");
		  System.out.println("");
		  System.out.println("  Als Instrument verwenden wir die Anspannungskurve. Diese findet in der DBT (Dialektisch Behaviorale Therapie) Anwendung.");
		  System.out.println("  Anspannung bezeichnet hier den allgemeinen Erregungszustand einer Person");
		  System.out.println("  Die Einschätzung deiner Anspannung kann zwischen 0 und 100% liegen");
		  System.out.println("  Ein gewisses Maß an Anspannung ist wichtig und gehört zum Alltag dazu, z.B. beim Einkaufen oder wenn du deinen Bus erwischen möchtest. ");
		  System.out.println("");
		  System.out.println("  10 %      - bezeichnet einen Zustand mit geringster Anspannung (Zb, beim Schlafen).");
		  System.out.println("  70 %      - ab hier befindest du dich im Hochstress.");
		  System.out.println("              Das kann z.B. dazu führen, das du dieses Stressniveau so schnell wie möglich vermindern möchtest.");
		  System.out.println("  100 %     - bezeichnet einen Zustand mit extrem hoher Anspannung. In diesem Bereich kannst du dich evtl. zum Zerreißen fühlen und deine Gedanken rasen.");
		  System.out.println("");
		  System.out.println(name+" weiter gehts!");
		  System.out.println("");}
		else
		{ System.out.println("");
		  System.out.println("Gut, dann kommen wir direkt zur Frage.");}
		
		//(5)Frage zum Anspannungslevel
		System.out.println("Wie schätzt du gerade deine Anspannung ein? (Verwende eine Zahl von 1 (ohne Anspannung) bis 100 (extreme Anspannung)");
		
		//(5)Antwort via Scanner ermöglichen
		String antwort_5 = scanner.nextLine();
		
		//(5)Falls ein % Zeichen enthalten ist, entfernen
		if (antwort_5.contains("%"))
		{ antwort_5 = antwort_5.replace("%", "");
		  antwort_5 = antwort_5.toUpperCase();}
		
		//(5)Datentyp String in Integer umwandeln
		int antwort_anspannung = Integer.parseInt(antwort_5);
		
		//(5)Falls die Eingabe nicht im Bereich von 1 bis 100 angegeben wurde kommt eine while-schleife
		while (antwort_anspannung<1|antwort_anspannung>100)
		{ System.out.println("");
		  System.out.println("[ Meldung: Bitte gib eine ganze Zahl von 1 bis 100 an! ]");
		  antwort_5 = scanner.nextLine();
	       
		  if (antwort_5.contains("%"))
		      { antwort_5 = antwort_5.replace("%", "");
		        antwort_5 = antwort_5.toUpperCase();}
		
		 antwort_anspannung = Integer.parseInt(antwort_5);}
				
		//(5)Danke
		System.out.println("");
		System.out.println("Danke für deine Offenheit :-).");
		
		
		//(6)Eine Gute Nachricht
		System.out.println("Eine gute Nachricht für dich: Du kannst mithilfe von Skills aktiv Einfluss auf dein Anspannungsniveau nehmen um es zu senken!");
		
		//(6)Vorschlag zu Skills
		System.out.println("Möchtest du ausführliche Informationen zur Anspannungskurve, Skills und DBT? (Eingabe ja oder nein)");
		
		//(6)Antwort via Scanner ermöglichen
		String antwort_skills = scanner.nextLine();
		
		//(6)Eingabe prüfen ob JA/NEIN eingegeben wurde
		while (!antwort_skills.equalsIgnoreCase("ja")&&!antwort_skills.equalsIgnoreCase("nein"))
		{ System.out.println("");
	      System.out.println("[ Meldung: Es sind nur Ja/Nein Aussagen gestattet! ] ");
	      antwort_skills = scanner.nextLine();
		  antwort_skills = antwort_skills.toUpperCase();}
		
		//(6)if else Anweisung
		if (antwort_skills.equalsIgnoreCase("ja"))
		{ System.out.println("");
          System.out.println("  _____INFORMATIONSBLATT____ ");
          System.out.println("");
		  System.out.println("");
		  System.out.println("  [ Was ist ein Skill ]");
		  System.out.println("");
		  System.out.println("    Ein Skill ist im Grunde ein Werkzeug, das du gelernt hast anzuwenden");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("    [ Wann brauchst du Skills ]  ");
		  System.out.println("");
		  System.out.println("    WENN...                         ");
		  System.out.println("");
		  System.out.println("    ... die Situation sich gerade nicht verändern lässt und du einen guten Umgang mit deinem aufkommende Gefühl suchst");
		  System.out.println("    ... du vermeiden möchtest, eine anspruchsvolle Situation noch schlimmer zu machen");
		  System.out.println("    ... du eine Krise bewältigen möchtest (Eine Krise meint hier einen Zustand, bei dem sich deine Anspannung über 70% befindet) ");
		  System.out.println("");              
		  System.out.println("");
		  System.out.println("");
		  System.out.println("    [ Wann solltest du keine Skills anwenden ]");
		  System.out.println("");
		  System.out.println("    WENN..."                          );
		  System.out.println("");
		  System.out.println("    ... du ein schwieriges Problem lösen möchtest");
		  System.out.println("    ... eine wichtige Entscheidung getroffen werden muss");
		  System.out.println("    ... du herausfinden möchtest, welche Veränderungen du in deinem Leben vornehmen möchtest");
		  System.out.println("    ... du dir ausschließlich mit Skills dein Leben Lebenswert gestalten möchtest");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("    [ Fakt ]");
		  System.out.println("");
		  System.out.println("    Unsere Wahrnehmung wird durch unsere Anspannung beeinflusst");
		  System.out.println("    Einzelne Sinne können bei Hochstress eingeschränkt sein oder sogar vollständig versagen ");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("  "+name+", lass uns wetten! Du wendest vermutlich bereits einige Skills in deinem Alltag, ohne es bewusst zu merken!");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("    [ Skills ]");
		  System.out.println("");
		  System.out.println("    Durchatmen         - Atme zweimal tief ein und langsam wieder aus (Es gibt einige Atemtechniken, recherchier sie doch einfach mal)");
		  System.out.println(".   Aktivität          - Setz dich in Bewegung z.B. Laufen, Spazieren oder Kniebeugen");
		  System.out.println("    Übungen zum Spüren - Lenke dich ab, indem du dir kaltes Wasser über die Hände laufen lässt");
		  System.out.println("    Die 5 Sinne        - höre aktiv den Vögeln zu, konzentrier dich auf ein scharfes Kaugummi oder schau aus dem Fenster ");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("    [ Fakte ]");
		  System.out.println("");
		  System.out.println("    Es gibt unzählige Arten, wie du dein Stressniveau senken kannst, und die Wirkung ist sehr individuell für jeden Menschen.");
	      System.out.println("    Auch wenn Skillstraining Bestandteil der DBT ist, profitieren viele Menschen von den positiven Auswirkungen");
	      System.out.println("");
	      System.out.println("");
	      System.out.println("    [ Wichtig ]");
	      System.out.println("");
	      System.out.println("    Die genannten Vorschläge und INformationen ersetzen keine ärztliche oder therapeutische Behandlung.");
	      System.out.println("");
          System.out.println("Quelle DBT Manual zum Skillstraining/Modul Stresstoleranz nach: Bohus/Wolf-Arehult: Interaktives Skilltraining/Schauer Verlag 2009/2013");
		  System.out.println("");
		  System.out.println("");}
		else
		{ System.out.println("");
		  System.out.println("Na gut, du bist bestimmt schon gespannt auf die kleine Auflistung am Ende des Dialogs...");}
		
		
		//(7)Frage bevor Auflistung kommt
		System.out.println("");
		System.out.println("Ich lege meinen Stift weg!");
		System.out.println("Wir haben jetzt deine Schlafqualität ermittelt, deine Stimmung und dein Anspannungsniveau.");
		System.out.println("Möchtest du meine Auflistung deiner Eingaben zu den Themenbereichen sehen? (Eingabe ja oder nein)");
		
		//(7)Antwort via Scanner ermöglichen
		String antwort_7 = scanner.nextLine();
		
		//(7)Eingabe prüfen auf JA/NEIN
		while (!antwort_7.equalsIgnoreCase("ja")&&!antwort_7.equalsIgnoreCase("nein"))
		{ System.out.println("");
		  System.out.println("[ Meldung: Es sind nur Ja/Nein Aussagen gestattet! ]");
		  antwort_7 = scanner.nextLine();
		  antwort_7 = antwort_7.toUpperCase();}
		
		//(7)if else anweisung
		if (antwort_7.equalsIgnoreCase("ja"))
		{ System.out.println("");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("__________________________________________________________________________________________________________________________________________");
		  System.out.println("");
		  System.out.println("                                                     DIE AUSWERTUNG DES INTERVIEWS");
		  System.out.println("__________________________________________________________________________________________________________________________________________");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("                                      [ DEINE ANGABEN ]");
		  System.out.println("");
		  System.out.println("                                      Name                      : "+name);
		  System.out.println("                                      Schlafqualität            : "+antwort_3);
		  System.out.println("                                      Stimmung                  : "+antwort_4);
		  System.out.println("                                      Stresslevel in Prozent    : "+antwort_5);
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("                                      [ MEINE INFOS ]");
		  System.out.println("");
		  System.out.println("                                      Fakt zur Schlafqualität erhalten        :"     +antwort_fakt);
		  System.out.println("                                      Fakt zur Stimmung erhalten              :"     +antwort_fakt_2);
		  System.out.println("                                      Erklärung zur Anspannungskurve erhalten :"     +antwort_erklärung);
		  System.out.println("                                      Infos zu Skills/DBT erhalten            :"     +antwort_skills);
		  System.out.println("");
		  System.out.println("");
		  System.out.println("________________________________________________________________________________________________________________________________________");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("________________________________________________________________________________________________________________________________________");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");}
		else
		{ System.out.println("");
		  System.out.println("Na gut, dann hab noch einen schönen Tag :-)");}
		
		
		//Abschied
		System.out.println("Wow, geschafft! Ich hoffe, es hat dir gefallen");
		}
		
		}
		
		
		
			
			
		
		
	      
		
		

		
		
		
		
		

	


