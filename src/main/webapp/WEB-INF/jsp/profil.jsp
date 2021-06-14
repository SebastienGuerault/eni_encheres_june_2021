<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <title>Profil</title>
      <meta name="description" content="">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="${pageContext.request.contextPath}/css/profil.css">
   </head>
   
   <body>

      <h1>ENI-Enchères</h1>

      <h2>Mon profil</h2>

      <div class="centering">
         <label for="pseudo">Pseudo : <%=request.getAttribute(user.getPseudo())%></label>
         <br>
         <label for="nom">Nom : </label>
         <br>
         <label for="prenom">Prénom : </label>
         <br>
         <label for="email">Email : </label>
         <br>
         <label for="telephone">Téléphone : </label>
         <br>
         <label for="rue">Rue : </label>
         <br>
         <label for="codepostal">Code postal : </label>
         <br>
         <label for="ville">Ville : </label>
         <br>
         <label for="motdepasse">Mot de passe : </label>
         <br>
         <label for="confirmation">Confirmation : </label>
      </div>

   </body>
</html>