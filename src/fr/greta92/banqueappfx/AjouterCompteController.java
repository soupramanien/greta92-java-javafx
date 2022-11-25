package fr.greta92.banqueappfx;
/**
 * <h1>Controlleur de la view 'AjouterCompte.fxml'</h1>
 * 
 * <p>Exercice 1: ajouter une methode permettant de recevoir l'objet banque dans AjouterCompteController.
 * Note: inspirez-vous du code de MainController
 * 
 * </p>
 * <p>Exercice 2: ajouter une méthode permettant de gérer l'evenement de type 'Action' sur le bouton 'Ajouter'. 
 * cette methode doit afficher un message d'erreur si les données sont invalide 
 * sinon elle doit ajouter le compte dans l'objet banque. 
 * Note: la méthode 'ouvrirCompte' de la Banque permet de créer le compte</p>
 * 
 * <p>Exercice 3: ajouter une méthode permettant de gérer l'evenement de type 'Action' sur le bouton 'Annuler'.
 * cette methode doit fermer la fenetre modale. 
 * Note: voici le code permettant de récuperer le stage depuis la méthode callback
	<pre>
	Node node = (Node) event.getSource();
   	Stage thisStage = (Stage) node.getScene().getWindow();
   	thisStage.hide();
    </pre>
    </p>
 * 
 *
 */
public class AjouterCompteController {
	
}
