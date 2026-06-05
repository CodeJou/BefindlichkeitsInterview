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
		System.out.println("Hallo "+name+", es freut mich dich kennenzulernen :-).");
		
		//(1) Erläuterung des Programms
		System.out.println("Dieses kleine Programm führt ein Interview durch, um deine Befindlichkeit festzustellen.");
		System.out.println("Es warten ein paar einfach gehaltene Fragen zur Beantwortung auf dich.");
		System.out.println("Auch ein paar Fakten stehen bereit, die du bei Bedarf überspringen kannst.");
		System.out.println("");
		
		//(2) Frage nach Einverständnis
		System.out.println("Hast du Lust auf ein kleines Interview? (Eingabe ja oder nein)");
		
		//(2) Antwort via Scanner ermöglichen
		String antwort_2 = scanner.nextLine();
		
		//(2) If else Abfrage
		if (antwort_2.equalsIgnoreCase("ja"))
		{ System.out.println("Super, dann pack ich Notitzheft und Kugelschreiber auf den Tisch!"); }
		else
		{ System.out.println("Na gut, dann ein anderes mal :-).");
		  return; }
		
		
		//(3) Frage Schlafquallität
		System.out.println(name+", auf einer Skala von 1 (sehr schlecht) bis 10 (sehr gut): Wie hast du die letzte Nacht geschlafen? (Nenne mir die passende Zahl) ");
		
		//(3) Antwort via Scanner ermöglichen
		int antwort_3 = scanner.nextInt();
		
		//(3) Wenn Eingabe kleiner als 1 und größer als 10 ist, kommt while-schleife
		while (antwort_3<1|antwort_3>10)
		{ System.out.println("Meldung: Bitte gib eine ganze Zahl von 1 bis 10 ein!");
		  antwort_3 = scanner.nextInt();}
		
		//Enter aufräumen
		scanner.nextLine();
		
		//(3) Danke
		System.out.println("Danke für deine Eingabe.");
		
		//(3) Fakt zur Schlafqualität
		System.out.println("Möchtest du einen kleinen Fakt zur Schlafqualität hören? (Eingabe ja oder nein)");
		
		//(3) Antwort via Scanner ermöglichen
		String antwort_fakt = scanner.nextLine();
		
		//(3) If else Anweisung
		if (antwort_fakt.equalsIgnoreCase("ja"))
		{ System.out.println("Fakt : Schon eine Nacht mit zu wenig Schlaf kann die Gedächnisleistung verschlechtern.");
		  System.out.println("Die gute Nachricht: Eine anschließende Nacht mit qualitativ hochwertigem Schlaf, ");
	      System.out.println("kann einen Teil dieser Einbußen wieder ausgleichen.");
	      System.out.println("Quellenangabe Baena et al. (2020): Weakly encoded momories due to acute sleep restriction (...), veröffentlicht in Scientific Reports.");
	      System.out.println("");}
		else 
		{ System.out.println("Dann ein anderes mal :-).");}
		
		
		//(4) Frage zur Stimmung
		System.out.println("Okey "+name+" machen wir weiter mit der nächsten Frage.");
		System.out.println("Wie ist deine Stimmung gerade auf einer Skala von 1 (sehr schlecht) bis 10 (sehr gut)? (Nenn mir die passende Zahl)");
		
		//(4) Antwort via Scanner ermöglichen
		int antwort_4 = scanner.nextInt();
		
		//(4) Wenn Eingabe kleiner als 1 oder größer als 10 ist, kommt eine while-schleife
		while (antwort_4<1|antwort_4>10)
		{ System.out.println("Meldung: Bitte gib eine ganze Zahl von 1 bis 10 an!");
		  antwort_4 = scanner.nextInt();}
		
		//Enter aufräumen
		scanner.nextLine();
		
		//(4) Danke
		System.out.println("notiert!");
		
		//(4)Fakt zur Stimmung
		System.out.println(name+", ich hätte da einen kleinen Fakt zum Thema Stimmung für dich. Möchtest du ihn hören? (Eingabe ja oder nein)");
		
		//(4)Antwort via Scanner ermöglichen
		String antwort_fakt_2 = scanner.nextLine();
		
		//(4) If else Anweisung
		if (antwort_fakt_2.equalsIgnoreCase("ja"))
		{ System.out.println("Fakt : Lächeln ist nicht nur ein Ausdruck von Freude - es kann auch ein Werkzeug sein, um die eigene ");
		  System.out.println("Stimmung ein wenig anzuheben. (Wir sollten alle viel mehr für uns selbst Lächeln, ist meine Meinung)");
		  System.out.println("Quelle : Coles, Larsen & Lech (2019), A meta-analysis of the facial feedback literature, veröffentlicht in Psychological Bulletin.");
		  System.out.println("");}
		else
		{ System.out.println("Dann ist jetzt Fakt, das wir weiter machen :-).");}
		
		
		//(5)Info zum Stresslevel
		System.out.println("In der nachfolgenden Frage wirst du dein Stresslevel in Prozenten einschätzen, ");
		System.out.println("möchtest du zuvor eine Erklärung zur Anspannungskurve um dich besser einschätzen zu können? (Eingabe ja oder nein)");
		
		//(5)Antwort via Scanner ermöglichen
		String antwort_erklärung = scanner.nextLine();
		
		//(5) if else Anweisung
		if  (antwort_erklärung.equalsIgnoreCase("ja"))
		{ System.out.println("Erklärung: Als Instrument verwenden wir die Anspannungskurve. Diese findet in der DBT (Dialektisch Behaviorale Therapie) Anwendung.");
		  System.out.println("Anspannung bezeichnet hier den allgemeinen Erregungszustand einer Person");
		  System.out.println("Die Einschätzung deiner Anspannung kann zwischen 0 und 100% liegen");
		  System.out.println("");
		  System.out.println("10%     - bezeichnet einen Zustand mit geringster Anspannung (Zb, beim Schlafen).");
		  System.out.println("Ab 70%  - befindest du dich im Hochstress. Denken, Fühlen und die Wahrnehmung sind durch dein Spannungslevel beeinflusst.");
		  System.out.println("          Das kann z.B. dazu führen, das du dieses Stressniveau so schnell wie möglich vermindern möchtest.");
		  System.out.println("100%    - bezeichnet einen Zustand mit extrem hoher Anspannung. In diesem Bereich kannst du dich evtl. zum Zerreißen fühlen und deine Gedanken rasen.");
		  System.out.println("");
		  System.out.println(name+" weiter gehts!");
		  System.out.println("");}
		else
		{ System.out.println("Gut, dann kommen wir direkt zur Frage.");}
		
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
		{ System.out.println("Meldung: Bitte gib eine ganze Zahl von 1 bis 100 an!");
		  antwort_5 = scanner.nextLine();
	       
		  if (antwort_5.contains("%"))
		      { antwort_5 = antwort_5.replace("%", "");
		        antwort_5 = antwort_5.toUpperCase();}
		
		 antwort_anspannung = Integer.parseInt(antwort_5);}
				
		//(5)Danke
		System.out.println("Danke für deine Offenheit :-).");
		
		
		//(6)Eine Gute Nachricht
		System.out.println("");
		System.out.println("Eine gute Nachricht für dich: Du kannst mithilfe von Skills aktiv Einfluss auf dein Anspannungsniveau nehmen um es zu senken!");
		
		//(6)Vorschlag zu Skills
		System.out.println("Möchtest du ausführliche Informationen zur Anspannungskurve, Skills und DBT? (Eingabe ja oder nein)");
		
		//(6)Antwort via Scanner ermöglichen
		String antwort_skills = scanner.nextLine();
		
		//(6)if else Anweisung
		if (antwort_skills.equalsIgnoreCase("ja"))
		{ System.out.println("");
		  System.out.println("Okey, hier eine Übersicht zum Thema:");
		  System.out.println("");
		  System.out.println("----------------------------------------------------------------------------------------------------------");
		  System.out.println("");
		  System.out.println("Was ist ein Skill?");
		  System.out.println("Ein Skill ist im Grunde ein Werkzeug mit dem du aktiv positiven Einfluss auf dein Empfinden nehmen kannst");
		  System.out.println("");
		  System.out.println("Wann brauchst du Skills zur Bewältigung anspruchsvoller Situationen?");
		  System.out.println("1.    Um unangenehme Ereignisse und Gefühle ertragen zu können, wenn sich die Situation nicht verändern lässt");
		  System.out.println("2.    Um zu vermeiden, dass du eine anspruchsvolle Situation noch schlimmer machst");
		  System.out.println("3.    Um Krisen auszuhalten (Krisen sind oft Hochstressphasen, d.h. Phasen der Anspannung, die auf der ");
		  System.out.println("      individuellen Spannungsskala über 70% gewertet werden");
		  System.out.println("");
		  System.out.println("So kann die Lebensqualität langfristig verbessert werden.");
		  System.out.println("");
		  System.out.println("Wann solltest du keine Skills anwenden?");
		  System.out.println("1.    Um schwierige Probleme zu lösen");
		  System.out.println("2.    Um wichtige Entscheidungen im Leben zu treffen");
		  System.out.println("3.    Um herauszufinden, wie du verändern kannst, was du im Leben verändern möchtest");
		  System.out.println("4.    Um dein Leben Lebenswert zu machen");
		  System.out.println("");
		  System.out.println("Fakt: Da die Wahrnehmung durch Stress beeinflusst werden kann, kann es sogar zu einer Minderung oder Verlust von einzelnen Sinnen kommen");
		  System.out.println("");
		  System.out.println(name+", lass uns wetten! Du wendest vermutlich ohne es zu wissen bereits ein paar Skills in deinem Alltag an :-)");
		  System.out.println("");
		  System.out.println("Hier sind ein paar Skills:");
		  System.out.println("1.    Durchatmen         - Atme zweimal tief ein und langsam wieder aus (Es gibt einige Atemtechniken, recherchier sie doch einfach mal)");
		  System.out.println("2.    Aktivität          - Setz dich in Bewegung z.B. Laufen, Spazieren oder Kniebeugen");
		  System.out.println("3.    Übungen zum Spüren - Lenke dich ab, indem du dir kaltes Wasser über die Hände laufen lässt");
		  System.out.println("4.    Die 5 Sinne        - höre aktiv den Vögeln zu, konzentrier dich auf ein scharfes Kaugummi oder schau aus dem Fenster ");
		  System.out.println("");
		  System.out.println("Es gibt unzählige Arten, wie du dein Stressniveau senken kannst, und die Wirkung ist sehr individuell für jeden Menschen.");
	      System.out.println("Die Thematik wird in der DBT (Dialektisch Behaviorale Therapie) behandelt, meine gegebenen Vorschläge ersetzen keine ärztliche oder therapeutische Behandlung!");
		  System.out.println("Auch wenn Skillstraining Teil der DBT ist, profitieren viele Menschen von den positiven Auswirkungen");
		  System.out.println("Quelle DBT Manual zum Skillstraining/Modul Stresstoleranz nach: Bohus/Wolf-Arehult: Interaktives Skilltraining/Schauer Verlag 2009/2013");
		  System.out.println("");
		  System.out.println("Wir sind am Ende angekommen!");
		  System.out.println("");}
		else
		{ System.out.println("Na gut, du bist bestimmt schon gespannt auf die kleine Auflistung am Ende des Dialogs...");}
		
		
		//(7)Frage bevor Auflistung kommt
		System.out.println("Möchtest du die Liste sehen? (Eingabe ja oder nein)");
		
		//(7)Antwort via Scanner ermöglichen
		String antwort_7 = scanner.nextLine();
		
		//(7)if else anweisung
		if (antwort_7.equalsIgnoreCase("ja"))
		{ System.out.println("");
		  System.out.println("Auflistung der abgefragten Parameter");
		  System.out.println("---------------------------------------------------------------------------------------------------------");
		  System.out.println("Name          : "+name);
		  System.out.println("Schlafqualität: "+antwort_3);
		  System.out.println("Stimmung      : "+antwort_4);
		  System.out.println("Stresslevel   : "+antwort_5);
		  System.out.println("");
		  System.out.println("Übersicht, welche Infos du von mir erhalten hast");
		  System.out.println("");
		  System.out.println("Fakt zur Schlafqualität erhalten       :"     +antwort_fakt);
		  System.out.println("Fakt zur Stimmung erhalten             :"     +antwort_fakt_2);
		  System.out.println("Erklärung zur Anspannungskurve erhalten:"     +antwort_erklärung);
		  System.out.println("Infos zur Stressbewälltigung erhalten  :"     +antwort_skills);
		  System.out.println("");}
		else
		{ System.out.println("Na gut, dann hab noch einen schönen Tag :-)");}
		
		
		//Abschied
		System.out.println("Wow, geschafft! Ich hoffe, es hat dir gefallen");
		}
		
		}
		
		
		
			
			
		
		
	      
		
		

		
		
		
		
		

	


