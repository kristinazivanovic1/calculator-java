Assignment – Metrika, pregled i statička analiza
Repozitorijum
https://github.com/vladimir-dresevic/calculator-java
LOC metrika
Ukupan broj linija koda (LOC) za kompletan projekat iznosi:
•	Calculator.java → 134 LOC
•	Start.java → 19 LOC
Ukupno:
153 LOC
Neformalni pregled i statička analiza
Format: fajl – broj linije koda – zapažanje
Calculator.java
•	Calculator.java – linija 5 – Korišćenje globalne promenljive finalResult može izazvati probleme ukoliko više niti koristi kalkulator istovremeno.
•	Calculator.java – linija 17 – Metoda ToString() nije napisana u skladu sa Java konvencijama imenovanja metoda. Ispravnije bi bilo koristiti naziv toString().
•	Calculator.java – linija 27 – Ne postoji provera da li je prosleđeni string prazan, što može izazvati StringIndexOutOfBoundsException.
•	Calculator.java – linija 34 – Parsiranje operacija prolaskom kroz svaki karakter povećava kompleksnost koda i može otežati održavanje.
•	Calculator.java – linija 57 – Korišćenje catch (Exception) predstavlja previše širok pristup hvatanju grešaka.
•	Calculator.java – linija 69 – Rekurzivna metoda Calculate() može dovesti do problema sa performansama kod veoma dugih izraza.
•	Calculator.java – linija 75 – Promenljiva result inicijalizuje se sa 0 i zatim koristi sa operatorom +=, što smanjuje čitljivost koda.
•	Calculator.java – linija 82 – Kod za množenje i deljenje se ponavlja više puta, što ukazuje na mogućnost refaktorisanja.
•	Calculator.java – linija 100 – Ne postoji validacija deljenja nulom.
•	Calculator.java – linija 120 – Korišćenje tipa float može izazvati probleme sa preciznošću kod matematičkih operacija.
Start.java
•	Start.java – linija 10 – Scanner objekat se kreira unutar petlje, što predstavlja nepotrebno zauzimanje resursa.
•	Start.java – linija 15 – Poređenje stringova može biti unapređeno korišćenjem equalsIgnoreCase() metode.
•	Start.java – linija 18 – Nema obrade potencijalnih grešaka prilikom korisničkog unosa.
Zaključak
Kod projekta je funkcionalan i relativno jednostavan za razumevanje, ali postoje određeni problemi koji mogu uticati na održavanje, čitljivost i stabilnost aplikacije. Najveći problemi odnose se na ponavljanje koda, nedostatak validacije korisničkog unosa i korišćenje globalnih promenljivih.
Statičkom analizom mogu se uočiti potencijalni Code Smell problemi i mogućnosti za refaktorisanje koje bi unapredile kvalitet softverskog proizvoda.



