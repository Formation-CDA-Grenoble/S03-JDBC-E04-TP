# Travaux pratiques - Java JDBC
 
## Première partie: conceptualisation de base de données

Un client t'a contacté pour te demander de réaliser un jeu de questions/réponses en ligne. Il a été assez vague dans sa description du produit, mais fort heureusement, il est au taquet sur la norme UML, et il t'a fourni le **modèle conceptuel de données (MCD)** suivant: https://www.lucidchart.com/invitations/accept/32400412-e64d-4f49-84ae-e5a2e5a3796e, accompagné de quelques annotations:

- **User**: les membres inscrits à l'application.
- **Quiz**: les différents questionnaires.
- **Question**: les questions posées dans les questionnaires.
- **Answer**: les différentes réponses possibles aux questions.
- **Tag**: des catégories décrivant les questionnaires (animaux, sciences, histoire, etc.).
- **QuizResult**: les résultats obtenus par les joueurs à chaque questionnaire.

En observant le diagramme, réponds aux questions suivantes. Tu dois créer un fichier **quiz.md** dans ton dépôt, et écrire les réponses à chaque question en _Markdown_ dedans.

- Combien de colonnes aura la table **question** en base de données? Donne le nom de chacune de ces colonnes.
- Quelle fonctionnalité de l'application est décrite par la relation **Quiz** _written by_ **User**? Essaie d'exprimer cette fonctionnalité sous la forme d'une _user story_ ("en tant que ..., j'ai besoin de ... afin de ...").
- La relation **Quiz** _written by_ **User** a un losange blanc, alors que la relation **Question** _belongs to_ **Quiz** a un losange noir. Peux-tu expliquer la différence entre ces deux relations?
- Combien de question peut-il y avoir dans un questionnaire (minimum et maximum)?
- Combien de réponses chaque question peut-elle avoir (minimum et maximum)?
- Que se passe-t-il si je supprime une question?
- Que se passe-t-il si je supprime un utilisateur?
- Comment pourrons-nous coder la relation **Tag** _describes_ **Quiz** dans notre base de données?
- Combien de clés étrangères la table **Quiz** possède-t-elle? Nomme chacune de ces clés.
- Pourquoi y a-t-il deux relations entre **Answer** et **Question**?
- Peux-tu expliquer pourquoi la classe **QuizResult** se trouve entre les classes **User** et **Quiz**?
- Si un utilisateur souhaite tenter à nouveau un questionnaire, est-il prévu qu'il puisse voir à quelles questions il avait bien répondu précédemment? Si oui, où peut-on le voir sur le diagramme? Si non, que faudrait-il rajouter sur le diagramme pour pouvoir l'exprimer?

## Deuxième partie: création de base de données

Réalise à l'aide de PHPMyAdmin une base de données **exercice_quiz** qui corresponde aux spécifications données par le MCD fourni à la partie précédente. Ta base de données devra contenir:

- Toutes les tables nécessaires (qu'elles soient ou non écrites sur le diagramme).
- Toutes les colonnes nécessaires dans chaque table.
- Les contraintes de clés étrangères nécessaires.

Lorsque tu as terminé, utilise la fonction **Export** de PHPMyAdmin, ajoute le fichier .sql ainsi obtenu dans ton dépôt et fais un _commit_. Si tu souhaites compléter ta base de données plus tard, n'oublie pas que tu peux toujours refaire un export et un _commit_ du nouveau fichier!

## Troisième partie: exploitation d'une base de données en Java
