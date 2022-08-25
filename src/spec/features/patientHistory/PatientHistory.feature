@jotform
Feature: J accede au site web Jotfrom
  En tant que utilisateur je souhaite acceder a l application Jotfrom

  @patient
  Scenario Outline: J accede au site web Jotfrom
    Given J accede a l application Jetform
    When Je selectionne Female dans Pateient Gende "<gender>"
    And Je saisis le prenom dans First Name "<first_name>"
    And Je saisis le nom dans Last Name "<Last_name>"
    And Je saisis le mois dans Month "<month>"
    And Je saisis le jour dans Day "<day>"
    And Je saisis l annee dans Year "<year>"
    And Je saisis l hauter dans Height "<height>"
    And Je saisis le poid dans Weight "<weight>"
    And Je saisis l adesse email dans E-mail "<email>"
    And Je saisis la raison dans Reason for seeing doctor "<reason>"
    And Je saisis l allergie dans drug allergies "<drug_allergies>"
   # And Je coche une maladie dans Have you ever had
    And Je saisis une autre maladie dans Other illnesses "<other_illnesses>"
    And Je saisis l operation dans Please list any Operations and date of each "<opeations>"
    And Je saisis le medicament dans Please list your Curent Medications "<medications>"
    And Je coche 1-2 days dans Exercice 
    And Je coche I dont have diet dans Eating following a diet 
    And Je coche I dont drink dans Alcohol Consumption 
    And Je coche 1-2 cups/day dans Caffeine Consumption 
    And Je coche No dans Do you smoke 
    And Je saisis un commentaire dans Include other comments "<comments>"
    And Je clique sur le bouton Submit 
    Then Je me redirige vers la page home "page"

    Examples: 
      | gender  | first_name | Last_name  | month 		 | day | year  | height  | weight 	| email 						  | reason 			 | drug_allergies | other_illnesses  | opeations | medications  | comments |   
      | Female 	|   Amal 		 | Aouini		  |  September |  9  |  1999 	 | 	167  	 |   65   | amal@gmail.com		  | 	Head acke	 |  No 						| 		 No 				 | 		 No	 | 			 No  		  | comments | 
      | Female	|  Soumaya 	 | Dridi      |  February  |  2  |  1999   |	 170 	 |   70 	| soumaya@gmail.com   | 	Dizziness	 |  No	 				  |			 No					 |		 No	 |			 No 		  | comments | 
