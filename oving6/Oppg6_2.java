/*
Øving 6
Oppgave 2
 */

package oving6;

public class Oppg6_2 {

}

/*
I denne oppgaven skal du lage en klasse for tekstanalyse. Teksten er et objekt av klassen
String, og du får tak i tegnet på en bestemt posisjon ved å bruke metoden charAt(). Lengden
av teksten er gitt ved metoden length(). Følgende kodebit illustrerer bruken av metodene
charAt() og length() og gir også tips om hvordan resten av oppgaven kan løses (a-z og A-Z
ligger rett etter hverandre i Unicode-tegnsettet).
Som objektvariabel i klassen Tekstanalyse skal du ha en tabell av int:
Int antallTegn = new int(30)
I denne tabellen gjelder at indeks 0-28 inneholder antall forekomster i en tekst av bokstavene
a-å, mens indeks 29 inneholder antall forekomster av alle andre tegn enn bokstaver, for
eksempel mellomrom, komma og punktum. Vi skiller ikke mellom store og små utgaver av en
bokstav.
Konstruktøren skal ta den aktuelle teksten som argument og fylle opp tabellen antallTegn med
antall tegn av hver type. Etter at tabellen antallTegn er fylt opp, skal en klient kunne få utført
følgende tjenester:
• Finn antall forskjellige bokstaver i teksten. Her ser vi altså bort fra alle andre tegn enn
bokstaver.
• Finn totalt antall bokstaver i teksten.
• Hvor stor del av teksten (prosent) er ikke bokstaver?
• Finn antall forekomster av en bestemt bokstav. Bokstaven skal være parameter til
metoden.
• Hvilken – eller hvilke, om det er flere som forekommer like ofte – bokstaver
forekommer oftest i teksten?
Lag et klientprogram som går i løkke. I hvert løkkegjennomløp skal klienten skrive inn en
tekst, og resultatet av alle analysene foran skal skrives ut.
*/
