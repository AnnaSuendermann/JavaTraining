# U23* Benutzereingaben und Programmlogik

Schreiben Sie ein Programm Jahreszeit.java, das vom Benutzer zwei Zahlen einfordert. Die erste Zahl bezeichnet den
Tag (1-31) und die zweite Zahl den Monat (1-12). 

Das Programm soll ausgeben, ob das Datum im WInter, Frühling, Sommer oder Herbst liegt. Dabei nehmen Sie folgende
Daten an: Frühlingsanfang ist der 20. März, Sommeranfang der 21. Juni, Herbstanfang der 22. September, Winteranfang
der 21. Dezember.

Das Programm soll prüfen, ob gültige Eingaben vorliegen. Insb. bei EIngabe nicht-numerischer Werte darf das Programm
nicht abbrechen, sondern soll erneut zur Eingabe auffordern. Weiterhin soll das Programm das Datum auf semantische
Gültigkeit prüfen, und z.B. die Eingabe 31 für Tag und 4 für Monat zurückweisen. Da Sie das Jahr nicht kennen, ist 
die Kombination 29 und 2 (29. Februar) eine gültige Eingabe.

Bitte strukturieren Sie ihr Programm in sinnvolle Unterprogramme. Insbesondere das Einlesen sollten Sie in separaten 
Methoden erledigen.

Sie dürfen keine Bibliotheksfunktion für Datum und Zeit benutzen.

Beispiel-Methoden:  
ganzZahlLesen(Scanner console, String prompt)  
ganzZahlInBereichLesen(Scanner console, String prompt, int max)

## Beispielabläufe:

a)

Tag (1-31): 4  
Monat (1-12): 11  
Herbst

b)

Tag (1-31): 31   
Monat (1-12): 9  
Datum ist ungültig. Wiederholen.  
Tag (1-31): 31  
Monat (1-12): 6  
Sommer

c)

Tag (1-31): unsinn  
Bitte eine ganze Zahl eingeben.  
Tag (1-31): 32  
Nicht im geforderten Bereich.  
Tag (1-31): 29  
Monat (1-12): bloedsinn  
Bitte eine ganze Zahl eingeben.  
Monat (1-12): 2  
Winter