<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html lang="fr">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <title>Les objets sont nos amis</title>
      <meta name="description" content="">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="${pageContext.request.contextPath}/css/pageAccueil.css">
   </head>
   <body>
   


      <header>
         <div class="connection_buttons_display">
            <h1>ENI-Encheres</h1>
            <p class="connected_user">${pseudo}</p>
            
            <%
            	if (session.getAttribute("email") != null) {
            %>
           	<div class="positionning">
               <a class="connection_buttons" href="${pageContext.request.contextPath}/profil">Mon profil</a>
               <a class="connection_buttons" href="${pageContext.request.contextPath}/logout">Déconnexion</a>
            </div>
            		
            	<%	
            	} else {
            		 %>
            <div class="positionning">
               <a class="connection_buttons" href="${pageContext.request.contextPath}/login">Se connecter</a>
               <a class="connection_buttons" href="${pageContext.request.contextPath}/inscription">S'inscrire</a>
             </div>
          		<%  
            	}
            %>

          </div>
            
      </header>

		
		
		<h2 class="page_title">Liste des enchères</h2>
		
<!-- 		<input type="radio" id="achats" name="achats"/>
      	<label for="achats">Achats</label> -->
		
		
<!-- 		<label for="choix-categories">Catégories :</label>
		<select name="categories" id="choix-categories">
			<option value="Toutes" selected>Toutes</option>
			<option value="Informatique">Informatique</option>
			<option value="Ameublement">Ameublement</option>
			<option value="Vêtements">Vêtements</option>
			<option value="Sport&Loisirs">Sport&Loisirs</option>
		</select>
		 -->

       <div class="container_list">
         <div class="container1">
            <a href="#"><img class="container_image" src="${pageContext.request.contextPath}/css/resources/desktop.jpg"></a>
            <div class="container_text1">
               <a href="#">PC Gamer pour travailler</a>
               <p><span>Prix : </span>210 points</p>
               <p><span>Fin de l'enchère : </span>10/08/2021</p>  
               <p><span>Vendeur : </span>jojo44</p>
            </div>
         </div>
         <div class="container2">
            <a href="#"><img class="container_image" src="${pageContext.request.contextPath}/css/resources/rocketStove.jpg"></a>
            <div class="container_text2">
               <a href="#">Rocket stove pour riz et pâtes</a>
               <p><span>Prix : </span>185 points</p>
               <p><span>Fin de l'enchère : </span>09/10/2021</p>
               <p><span>Vendeur : </span>NineJea</p>
            </div>
         </div>
       </div>

		
		<footer>
			<p class="footer_text">Copyright&copy; ENI-Enchères - Juin 2021</p>
		</footer>
      
   </body>
</html>