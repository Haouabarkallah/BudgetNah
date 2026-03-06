#  BudgetNah

![Android](https://img.shields.io/badge/Platform-Android-green)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-purple)
![Architecture](https://img.shields.io/badge/Architecture-MVVM-blue)
![Database](https://img.shields.io/badge/Database-Room-orange)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

**BudgetNah** est une application mobile Android conçue pour aider les familles à gérer efficacement leurs revenus et leurs dépenses.
Elle permet aux utilisateurs d’enregistrer, organiser et analyser leurs transactions financières afin d’améliorer leur gestion budgétaire au quotidien.

L’application propose un **tableau de bord simple et intuitif** pour suivre les revenus, les dépenses et les statistiques financières mensuelles.
Elle intègre également des fonctionnalités intelligentes basées sur les **capteurs du smartphone** afin de simplifier l’expérience utilisateur.

---

#  Aperçu

BudgetNah offre une solution simple pour :

* Suivre ses revenus et dépenses
* Analyser ses habitudes financières
* Planifier son budget mensuel
* Simplifier la saisie des transactions

---

#  Fonctionnalités

###  Gestion financière

* Ajout et gestion des **revenus**
* Ajout et gestion des **dépenses**
* Organisation des transactions par **catégories**

###  Tableau de bord

* Visualisation des revenus et dépenses
* Statistiques mensuelles
* Analyse des habitudes financières

###  Scanner de factures

Utilisation de la **caméra du smartphone** pour scanner les factures ou reçus.
L’application utilise la **reconnaissance de texte (OCR)** pour extraire automatiquement :

* Montant
* Date
* Description

Cela permet de **remplir automatiquement les informations de dépense**.

###  Mode sombre intelligent

BudgetNah utilise le **capteur de lumière du smartphone** pour activer automatiquement le **mode sombre** lorsque la luminosité ambiante diminue, offrant un meilleur confort visuel.

---

#  Technologies utilisées

* **Kotlin**
* **Android SDK**
* **MVVM Architecture**
* **Room Database** (stockage local)
* **CameraX** (utilisation de la caméra)
* **ML Kit OCR** (reconnaissance de texte)
* **Material Design**

---

# Architecture du projet

Le projet suit une architecture **MVVM (Model – View – ViewModel)** pour améliorer la maintenabilité et la séparation des responsabilités.

```
BudgetNah
│
├── data
│   ├── database
│   ├── dao
│   └── entity
│
├── repository
│
├── ui
│   ├── screens
│   └── components
│
├── viewmodel
│
└── utils
```

---

#  Installation

###  Cloner le repository

```bash
git clone https://github.com/Haouabarkallah/BudgetNah.git
```

###  Ouvrir le projet

Ouvrir le projet dans **Android Studio**.

### Synchroniser les dépendances

Android Studio synchronisera automatiquement les dépendances Gradle.

###  Lancer l'application

Exécuter l’application sur :

* un **émulateur Android**
* ou un **appareil physique**

---

#  Améliorations futures

* Synchronisation Cloud
* Gestion multi-utilisateurs (famille)
* Notifications de dépassement de budget
* Export des rapports financiers (PDF / Excel)
* Graphiques avancés
* Sauvegarde automatique des données

---

#  Contribution

Les contributions sont les bienvenues.

1. Fork le projet
2. Créer une branche

```
git checkout -b feature/nouvelle-fonctionnalite
```

3. Commit les modifications

```
git commit -m "Ajout d'une nouvelle fonctionnalité"
```

4. Push la branche

```
git push origin feature/nouvelle-fonctionnalite
```

5. Ouvrir une **Pull Request**

---

#  Licence

Ce projet est distribué sous licence **MIT**.

---

# Auteur

Projet développé dans le cadre d’un apprentissage du **développement d’applications Android**.

---
