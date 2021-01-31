# Setup von Git und Initial-Klon vom Repository

## Vorbereitung 

Für die nächsten Schritte brauchen Sie folgende Software:

- git
- Java IDE (IntelliJ oder Eclipse)
- GitHub Desktop (optional, falls gewünscht und GitHub verwendet wird)

Falls Dir Git noch nicht bekannt ist, schaue Dir folgende Ressourcen an:

- https://www.youtube.com/watch?v=dEWymjAJO0E&ab_channel=FabianHiller 
- https://git-scm.com/docs/gittutorial
- Google

## Projektsetup

1. **Alle Gruppenmitglieder**: Erstelle einen GitHub Account (als Alternative können auch Gitlab oder ähnliche Dienste verwendet werden) 
2. **Gruppenleiter**: Erstelle ein neues GitHub Repository mit dem namen m226-[name oder gruppe]
   - Kein README.md erstellen - leeres Repository!
3. **Gruppenleiter**: Füge alle Gruppenmitglieder und @leandrolerena zu dem Projekt als Collaborator hinzu
4. **Gruppenleiter**: Kopiere die URL zum Repository (https://github.com/user/repository.git)
5. **Alle Gruppenmitglieder**: Klonen des Gruppenrepositories (**LINK ANPASSEN!**):

```shell script
git clone https://github.com/user/repository.git
```

6. In das Repository navigieren

```shell script
cd repository-name
```

7. Verbindung mit meinem Repository herstellen

```shell script
git remote add gibb https://github.com/leandrolerena/m226-lerena-leandro.git
```

8. Neuster Stand von meinem Repository klonen

```shell script
git pull gibb main
```