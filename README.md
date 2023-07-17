C'est une application de librairie de vente de livres dans le domaine du cinéma, qui se nomme septArche. 

J'utilise SpringBoot pour construire l'app en back, et mySql pour la base de donnée.

J'  ai choisi SpringBoot car c'est un framework JAVA qui facilite l'automatisation du code.

Java Spring Framework (Spring Framework) est une infrastructure open souce d'entreprise couramment utilisée qui permet de créer des applications autonomes de production qui fonctionnent sur la machine virtuelle Java (JVM).

Java Spring Boot (Spring Boot) est un outil qui accélère et simplifie le développement d'applications Web et de microservices avec Spring Framework grâce à trois fonctionnalités principales :

-Configuration automatique

-Approche directive de la configuration
-Possibilité de créer des applications autonomes

Ces fonctionnalités fonctionnent ensemble pour fournir un outil qui permet de configurer une application Spring avec une configuration et une installation minimales.

Spring Framework offre une fonction d'injection de dépendances qui permet aux objets de définir leurs propres dépendances que le conteneur Spring leur injecte ensuite. Ainsi, en tant que développeur on peut créer des applications modulaires constituées de composants faiblement couplés qui sont idéaux pour les microservices  et les applications de réseau distribué.

Spring Framework offre également un support intégré pour les tâches typiques qu'une application doit effectuer, telles que la liaison de données, la conversion de type, la validation, le traitement des exceptions, la gestion des ressources et des évènements, l'internationalisation, etc. Il s'intègre à diverses technologies Java EE telles que RMI (Remote Method Invocation), AMQP (Advanced Message Queuing Protocol), Java Web Services, etc. En résumé, Spring Framework fournit aux développeurs tous les outils et toutes les fonctionnalités dont ils ont besoin pour créer des applications Java EE multiplateformes faiblement couplées qui fonctionnent dans n'importe quel environnement.


POURQUOI SPRING BOOT?

Aussi performant et complet que soit Spring Framework, la configuration, l'installation et le déploiement d'applications Spring requièrent toujours beaucoup de temps et de connaissances. 
Spring Boot réduit cet effort grâce avec trois fonctionnalités importantes.

Configuration automatique

La configuration automatique signifie que les applications sont initialisées avec des dépendances prédéfinies. Java Spring Boot étant doté de fonctionnalités intégrées de configuration automatique, il configure automatiquement les packages Spring Framework et tiers sous-jacents en fonction de vos paramètres (et des meilleures pratiques) pour éviter les erreurs. Même si vous pouvez remplacer ces valeurs par défaut une fois l'initialisation terminée, la fonction d'autoconfiguration de Java Spring Boot permet de commencer à développer rapidement vos applications Spring et réduit les risques d'erreurs humaines.

Approche directive

Spring Boot utilise une approche directive pour ajouter et configurer les dépendances de démarrage, en fonction des besoins de votre projet. Spring Boot choisit lui-même les packages à installer et les valeurs par défaut à utiliser.

Par exemple, la dépendance de démarrage « Spring Web » permet de créer des applications Web Spring avec une configuration minimale en ajoutant au projet toutes les dépendances nécessaires, telles que le serveur Web Apache Tomcat. « Spring Security » est une autre dépendance de démarrage couramment utilisée qui ajoute automatiquement des fonctions d'authentification et de contrôle d'accès à votre application.

Spring Boot comprend plus de 50 Spring Starters, et de nombreux autres starters tiers sont disponibles. Ce qui un avantage et un gain de temps considérable.

Applications autonomes

Avec Spring Boot, on peut créer des applications qui s'exécutent directement. Concrètement, il permet de créer des applications autonomes qui s'exécutent seules, sans dépendre d'un serveur Web externe, en intégrant un serveur Web tel que Tomcat dans votre application au cours du processus d'initialisation.

Différences entre Spring Boot et Spring:

Là encore, les principaux avantages de Spring Boot par rapport à Spring Framework seul sont la facilité d'utilisation et la rapidité du développement. En théorie, cela se fait au détriment de la flexibilité que vous obtenez en travaillant directement avec Spring Framework.

Mais, dans la pratique, l'utilisation de Spring Boot est vraiment intéressante. Vous pouvez toujours utiliser le très prisé système d'annotation de Spring Framework qui permet d'injecter facilement des dépendances supplémentaires (non couvertes par les Spring Starters) dans votre application. De plus, vous avez toujours accès à toutes les fonctions de Spring Framework, notamment la gestion simplifiée des évènements, la validation, la liaison de données, la conversion de type et les fonctionnalités intégrées de sécurité et de test. En résumé, si le champ d'application de votre projet est couvert par ne serait-ce qu'un seul Spring Starter, Spring Boot peut considérablement optimiser le développement.
