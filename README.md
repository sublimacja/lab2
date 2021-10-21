**PPKWU lab2**
----
Rest API umożliwiające sprawdzenie jaki String został przekazany. Zlicza występowanie dużych i małych liter, liczb,
znaków specjalnych i dowolnej ich kombinacji(znaki ktore NIE SĄ dużymi i NIE SĄ małymi literami). Zwraca STRING, który
zawiera odpowiednio nazwy grup oraz ilości zliczeń.

* **URL**
  http://localhost:8080/api/ppkwu/lab2/string/{example}

* **Parametry**
  {example} - String poddawany analizie

* **Metoda**
  `GET`

* **Przykład użycia:**
  http://localhost:8080/api/ppkwu/lab2/string/ala,.A13344

  `wejście:` ala,.A13344

  `wyjście:`UPPER: 1 LOWER: 3 DIGIT: 5 SPECIAL: 5 OWN: 10