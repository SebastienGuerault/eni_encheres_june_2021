<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Connexion</title>
        <link type="text/css" rel="stylesheet" href="" />
    </head>
    <body>
    
<%--      		<c:if test="${ not empty error_message }">
			<p>${error_message}</p>
			</c:if>
		 --%>
        <form method="post" action="${pageContext.request.contextPath}/login">
            <fieldset>
                <legend>Connexion</legend>
                <label for="nom">Adresse email</label>
                <input type="email" id="email" name="email" size="20" maxlength="60" />
                <span class="erreur">${form.erreurs['email']}</span>
                <br />

                <label for="motdepasse">Mot de passe</label>
                <input type="password" id="motdepasse" name="motdepasse" size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['motdepasse']}</span>
                <br />
                <br />

                <input type="submit" value="Connexion" class="sansLabel" />
                <br />
                
                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
            </fieldset>
        </form>
    </body>
</html>