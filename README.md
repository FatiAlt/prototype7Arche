#Nom du site : septArche

C'est une application de librairie de vente de livres dans le domaine du cinéma. 
Dans le cadre d'un lancement d'une application web pour s'agrandir, le client septarche librairie a remis un cahier des charges
en détaillant ses besoins et ses attentes.
https://github.com/Fatiocto/SeptArche.git (Toute la documentation générale est présente).
Stack technique :
- SpringBoot
- MySql : * [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
- Spring Web
- Spring Data JPA
- Spring Test
Hébergé sur localhost:8080

# Architecture
![image](https://github.com/Fatiocto/projet-arche-7/assets/116719823/a81da8f7-e86e-46a4-b3d3-17463397bb95)


### Récupération du projet
git clone git@github.com:Fatiocto/projet-arche-7.git

## Installation
1. Ajouter les dépendances suivantes :
-Le projet est sur JAR: le serveur tomcat est lancé par spring (port: 9080)
- MAVEN :   * [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.5/maven-plugin/reference/html/)
            * [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- Spring Web : * [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#web)
- Spring Data JPA : * [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#data.sql.jpa-and-spring-data)
- Spring Dev Tools : * [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#using.devtools)
- Spring Test : 
- Selon l'ide, installer maven

2. Générer le projet :
 Avec le bouton Generate, télécharger  le projet zip et l'extraire dans le dossier de votre choix.
Importer le projet dans votre IDE.

3. La base de données :
- Télécharger Mamp : https://www.mamp.info/en/downloads/
- Vérifier qu'apache est bien sélectionné
- Lancer la base de donnée avec le bouton Start
- Connecter vous sur phpMyAdmin : http://localhost:8888/phpMyAdmin5/index.php?route=/database/structure&db=7A_db
Nom de la base de donnée: 7A_db
port: 8888

4. Tester l'application :
## Usage
Pour lancer l'application dans le terminal :
- Build project
- Run project

### API
Postman permet de tester les appels API : https://www.postman.com/downloads/
Le lien du fichier généré se trouve en dessous: 
[AppSept.postman_collection.json](AppSept.postman_collection.json)

### Lien avec le client
https://github.com/Fatiocto/7-arche_client.git




