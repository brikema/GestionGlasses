# GestionGlasses
---
## Projet

Application qui permet à un opticien de gérer son stock de lunettes.

Ce projet à été réalisé dans le cadre d'une formation à l'ENSUP. Cette formation avait pour objectif la découverte de Spring et Spring Framework.

---

## Lien vers le github pour le déploiement sur AWS de l'application

[Projet avec déploiement sur AWS](https://github.com/asemin08/GestionGlasses-terraform)

---

## Prérequis pour lancer l'application
* Avoir docker
* Avoir docker-compose
* Récupérer le code source
* Ce placer à la racine du projet
* Lancer le conteneur de la base de données : 
```docker-compose up -d docker-mysql```
* Lancer le conteneur de l'application et phpmyadmin:
```docker-compose up -d```
* Ouvrir un navigateur et se rendre à cette url pour accéder l'application: [http://localhost:8080/](http://localhost:8080/)
* Pour se rendre sur phpmyadmin : [http://localhost:8081/](http://localhost:8081/)

---
## Lien vers le dockerhub de l'image de l'application

[image docker du projet](https://hub.docker.com/r/verkeur08/gestionglasses)

---
## Liste des projets

Nom du projet | Description | Lien
---|---|----
GestionGlasses | Projet contenant notre application avec son code source, son dockerfile et un script docker-compose | [GestionGlasses](https://github.com/brikema/GestionGlasses)
GestionGlasses-role | Projet contenant notre rôle Ansible | [RoleAnsible](https://github.com/asemin08/GestionGlasses-role)
GestionGlasses-playground | Projet contenant notre playground Ansible | [PlaygroundAnsible](https://github.com/asemin08/GestionGlasses-playground)
GestionGlasses-terraform | Projet contenant notre script Terraform pour déployer l'application GestionGlasses | [Terraform](https://github.com/asemin08/GestionGlasses-terraform)
