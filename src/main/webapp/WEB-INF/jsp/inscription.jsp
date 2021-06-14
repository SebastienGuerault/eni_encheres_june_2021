<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <title>Inscription</title>
      <meta name="description" content="">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="${pageContext.request.contextPath}/css/inscription.css">
   </head>

    <body>
      <form method="post" action="${pageContext.request.contextPath}/inscription">
         <fieldset>
             <legend>Inscription</legend>
             
             <div class="form_first">
               <label for="pseudonyme">Pseudonyme</label>
               <input type="text" id="pseudonyme" name="pseudonyme" size="20" maxlength="60" />
               <span class="erreur">${form.erreurs['pseudonyme']}</span>
               <br />
               
               <label for="nom">Nom</label>
               <input type="text" id="nom" name="nom" size="20" maxlength="60" />
               <span class="erreur">${form.erreurs['nom']}</span>
               <br />
               
               <label for="prenom">Prenom</label>
               <input type="text" id="prenom" name="prenom" size="20" maxlength="60" />
               <span class="erreur">${form.erreurs['prenom']}</span>
               <br />

               <label for="email">Adresse email</label>
               <input type="email" id="email" name="email" size="20" maxlength="50" />
               <span class="erreur">${form.erreurs['email']}</span>
               <br />
               
               <label for="telephone">Telephone</label>
               <input type="text" id="telephone" name="telephone" size="20" maxlength="60" />
               <span class="erreur">${form.erreurs['telephone']}</span>
               <br />

            </div>

            <div class="form_second">
             
               <label for="rue">rue</label>
               <input type="text" id="rue" name="rue" size="20" maxlength="60" />
               <span class="erreur">${form.erreurs['rue']}</span>
               <br />                
               
               <label for="codePostal">Code Postal</label>
               <input type="text" id="codePostal" name="codePostal" size="20" maxlength="60" />
               <span class="erreur">${form.erreurs['codePostal']}</span>
               <br />
               
               <label for="ville">Ville</label>
               <input type="text" id="ville" name="ville" size="20" maxlength="60" />
               <span class="erreur">${form.erreurs['ville']}</span>
               <br />                

               <label for="motdepasse">Mot de passe</label>
               <input type="password" id="motdepasse" name="motdepasse" size="20" maxlength="20" />
               <span class="erreur">${form.erreurs['motdepasse']}</span>
               <br />
               
               <label for="credit">Crédit</label>
               <input type="text" id="credit" name="credit" size="20" maxlength="20" />
               <span class="erreur">${form.erreurs['credit']}</span>
               <br />
               
               <label for="admin">admin</label>
               <input type="text" id="admin" name="admin" size="20" maxlength="20" />
               <span class="erreur">${form.erreurs['admin']}</span>
               <br />

            </div>

             <input type="submit" value="Créer" class="sansLabel" />
             <br />
             
             <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
         </fieldset>
     </form>
    </body>
</html>