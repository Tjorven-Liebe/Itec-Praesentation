
## Paketdatenbanken aktuallisieren
```BASH
yay -Syy
```
Der Pacman Paketmanager (yay ist ein fork) benötigt aktuelle Paketdatenbanken um Programme installieren zu können.
Wenn diese nicht aktuell sind, werden bestimmte Pakete zum Beispiel garnicht gefunden. Was nicht gefunden wird kann auch nicht installiert werden.

## Entwicklungsumgebungen installieren
Andere Apps und Entwicklungsumgebungen mit yay installieren und nutzen.<br/>
Bei der Installation immer “a” oder „y“ oder „q“ um Vortzufahren
```BASH
yay -S
```
In erster Linie, kann man damit alles in den Paketlisten aktuallisieren. Wenn man die Tabulator Taste drückt, (Links neben Q) kann man sog. Installationskandidaten auflisten
<br/>
Zum installieren von IntelliJ sieht das so aus:
```BASH
yay -S intellij-idea-community-edition
```
<br/>
Zum auflisten anderer Yay-Befehle kann man das hier nutzen:

```BASH
yay --help
```
#Python im Terminal
Zuerst muss Python installiert werden. Das Paket lautet `python`, wenn du im Kaptiel Entwicklungsumbebung installieren aufgepasst hast, müsstest du nun in der Lage sein Python zu installieren
<br/>

### Python ausprobieren
Zum prüfen, ob python installiert ist, kannst du die Python Konsole öffnen. Das machst du mit:
```BASH
python
```
nun kannst du Python Befehle verwenden:
```PYTHON
print("Hello World!")
```
Ausgabe: Hello World!
<br/>
Zum Beenden der Konsolenanwendung, kannst du den Hotkey `Strg + Z` benutzen. <br/>

### Pythondatei ausführen
Zum Ausführen einer Python-Datei musst du mithilfe von `python` den Pfad der Datei angeben.<br/>
Da diese noch nicht existiert erstellen wir sie.<br/>
Zum erstellen einer Datei kannst du zum Beispiel das Paket `nano` benutzen. Es gibt auch weitere Editoren wie `vi` oder `vim`.<br/>
Informiere dich über die Benutzung deines bevorzugten Editors und erstelle die Datei  `~/Schreibtisch/hello.py`
```PYTHON
print("Hello World")
```
Inhalt von hello.py<br/>
Du kannst natürlich auch deine Vorkenntnisse von Python freien lauf lassen :-)<br/>
um diese auszuführen müssen wir sie durch `python` referenzieren:
```BASH
python ~/Schreibtisch/hello.py
```
Du hast die Datei ausgeführt!
<br/>
Wenn du mit der Benutzung des Konsoleneditors nicht klakommst hier ein Tipp:
```PYTHON
nano ~/Schreibtisch/hello.py
print("Hello World")
```
Strg + X<br/>
Bestätigen mit Y<br/>
```BASH
python ~/Schreibtisch/hello.py
```
Fallen dir weitere Anwendungsfälle ein?
## Das geht auch mit Java!
Mit Yay `python` installieren
```BASH
yay -S liberica-jdk-17-full-bin
```
Java Datei erstellen
-	Datei genauso benennen wie Die Klasse
Möglicher Inhalt:
```JAVA
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hallo, Welt!");
    }
}
```
Nun müssen wir die Datei kompilieren
```BASH
javac Pfad/HelloWorld.java
```
Datei Ausführen
```BASH
java Pfad/HelloWorld.java
```
In Java könnt ihr ja schon programmieren, probiert einfach ein paar Sachen aus

## KDE-Theme anpassen
Manjaro bietet mit dem Plasma-KDE Desktop die Funktion, dass man sein Theme komplett ändern kann.<br/>
Das geht ganz einfach in den Einstellungen, dazu gehe in die Einstellungen unter:<br/>
`Einstellungen -> Erscheinungsbild -> Neue Themes erhalten`
![image](https://github.com/Tjorven-Liebe/Itec-Pr-sentation/assets/32434395/13db7bfe-d89c-4cb6-8cea-3eabf08880ea)

## Googlen und weitere Sachen ausprobieren
Nach interesse könnt ihr natürlich weitere Sachen ausprobieren. Gerne könnt ihr euch unter Google informieren. Wenn ihr was gefunden habt, stehen wir natürlich auch für Fragen zur Seite.
