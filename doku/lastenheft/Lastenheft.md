# Lastenheft Team 3

**Entwicklung einer Hello-world Anwendung in Java**

| Stand        | 16.11.2022                                                  |
|--------------|-------------------------------------------------------------|
| Auftraggeber | Hermann-Emanuel-Berufskolleg Informatik LK Abschlussprojekt |

# Inhaltsverzeichnis
1. [Einleitung](#1-einleitung)
2. [Soll-Konzept](#2-soll-konzept)
3. [Anforderungen](#3-anforderungen)
4. [Entwürfe](#4-entwrfe)


## 1 Einleitung
*Eine kurze Einstimmung zum Projekthintergrund*

Im Informatik Leistungskurs entwickeln die Lernenden ein Softwareprojekt. Im Rahmen des
Softwareentwicklungsprozesses sind typische Dokumente wie das Lastenheft zu erstellen. Mit der Entwicklung der Spiel-Anwendung von "Wer wird Millionär?" soll der
Softwareentwicklungsprozess praktisch mit den entsprechenden Dokumenten aufgezeigt werden.

## 2 Soll-Konzept

### 2.1 Anwendungsbereiche
*Beschreibung der vorgesehenen Anwendungsfälle des zu schaffenden Systems.*

Das System hat nur beispielhaften Charakter. Somit ist eine klassische Hello-world-Anwendung ausreichend.
Eventuell soll noch optional ein Hilfetext ausgegeben werd

Das System soll mithilfe von dynamischen Datenstrukturen (Stack, Queue, Liste) das Spiel "Wer wird Millionär?" darstellen.
Außerdem soll eine GUI implementiert werden. Drei Joker und eine Bestenliste sind ebenfalls zu implementieren.

### 2.2 Systemidee
*Welche Idee wird mit dem System umgesetzt?*

Eine einfache und übersichtliche Java-Anwendung, welche in der Konsole zu starten ist, gibt einen kurzen
Text aus. Wird die Anwendung mit einem entsprechenden Parameter gestartet, wird ein Hilfetext
ausgegeben

Eine kompakte Java-Anwendung, welche in der Konsole zu starten ist, soll das Spiel "Wer wird Millionär?" darstellen. 
Bei Ausführung wird eine GUI gestartet, in welcher man das Spiel spielen kann.

### 2.3 Ziele
*Welche konkreten Ziele sollen erreicht werden? (Aufteilung der Idee in Teilziele)*

Nicht mit dem System, sondern anhand des Systems soll der Softwareentwicklungsprozess veranschaulicht
werden

Anhand des Systems wird der Softwareentwicklungsprozess weiter ausgebildet. Konkret soll das Spiel im Einzel- und Mehrspielermodus
spielbar sein. Auch Cheats und eine GUI sollen enthalten sein. Mithilfe von 3 Jokern und einer Bestenliste soll
das Spielerlebnis aufgewertet werden. Die Implementation soll nach den Vorgaben des Lastenhefts durchgeführt werden.

### 2.4 Zielgruppe
*Benennung der Anforderungsbeitragenden mit Bezug zu deren Anforderungen*

Aus dem Ziel, den Softwareentwicklungsprozess zu veranschaulichen und andererseits das Spiel "Wer wird Millionär?" zu entwickeln, lassen sich folgende Beteiligte den folgenden erfassten Anforderungen zuordnen:

| **Anforderungsbeitragende** | **Anforderung**                                                                                                                                                                                          |
|-----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Lernende                    | Anhand des Systems soll der Softwareentwicklungsprozess praktisch veranschaulicht und lösungsorientiertes Arbeiten gefördert werden.                                                                                                                 |
| Nutzer                      | Das System soll das Spiel "Wer wird Millionär?" darstellen. Das Spiel soll in Form einer GUI angezeigt werden.                                  |
| Lehrkräfte                  | Die Analyse des Systems soll objektorientiert erfolgen. Für Modellierung und Dokumentation soll PlantUML genutzt werden. Die Implementierung soll in Java erfolgen, der Code soll gewisse Vorgaben erfüllen. |

## 3 Anforderungen

### 3.1 Funktionale Anforderungen
*Hier sind die Anforderungen in einer einheitlichen
und übersichtlichen Form darzustellen.*

*Als Template eignet sich z. B. eine Tabelle.
Eine Gruppierung nach Prozessen, Nutzerrollen
oder fachlichen Bereichen und das Vergeben
eines Identifikators, sowie Verweise auf verwandte
Anforderungen ist ratsam*

Es gibt nur zwei Anforderungen: die Hauptfunktion und eine Hilfefunktion. Der am Betriebssystem angemeldete Nutzer führt das Programm in der Konsole aus. Der Aufruf erfolgt mittels Java-Interpreter.

| Kürzel | Funktionsname                  | Funktionsbeschreibung                   |
|--------|--------------------------------|-----------------------------------------|
| F1     | Anzeige des Hello-world-Textes | Der Text "hello world" wird ausgegeben. |
| F2     | Anzeigen des Hilfe-Textes      | Ein Hilfetext wird ausgegeben.          |

### 3.2 Nicht-funktionale Anforderungen

| Kürzel | Funktionsname         | Funktionsbeschreibung                                                              |
|--------|-----------------------|------------------------------------------------------------------------------------|
| NF1    | Lock and feel         | Der Text "hello world" wird ausgegeben.                                            |
| NF2    | Lock and feel         | Die Ausgabe der Texte soll unmittelbar erfolgen.                                   |
| NF3    | Internationalisierung | Es ist langfristig vorgesehen, die Texte in verschiedenen Übersetzungen anzuzeigen |
| NF4    | Sicherheit            | Diesbezüglich liegen keine Anforderungen vor.                                      |
| NF5    | Normen                | EDie Anwendung braucht keine besonderen Normen zu erfüllen.                        |

## 4 Entwürfe

### 4.1 Klassendiagramm
*Bevor Sie Beginnen zu implementieren ist hier ein Klassendiagramm anzugeben.*

![Klassendiagramm](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/dynamische-Datenstrukturen-Team-3/master/doku/lastenheft/Diagramme/Klassendiagramm.puml)

### 4.2 Objektdiagramm
*Auf Basis Ihres Klassendiagramms ist hier ein Objektdiagramm anzugeben.*

![Objektdiagramm](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/dynamische-Datenstrukturen-Team-3/master/doku/lastenheft/Diagramme/Objektdiagramm.puml)

### 4.3 Sequenzdiagramm
*Hier wird ein Sequenzdiagramm zu einer Funktion aus 3.1 dargestellt.*

![Sequenzdiagramm](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/dynamische-Datenstrukturen-Team-3/master/doku/lastenheft/Diagramme/Sequenzdiagramm.puml)