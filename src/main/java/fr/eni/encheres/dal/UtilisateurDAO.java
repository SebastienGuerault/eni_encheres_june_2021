/**
 * 
 */
package fr.eni.encheres.dal;

import java.util.List;
import fr.eni.encheres.bo.Article;

/**
 * Classe en charge
 * @author Vente
 * @version Encheres - v1.0
 * @date 4 juin 2021 - 20:11:57
 */
public interface UtilisateurDAO {

	Article selectById(int id) throws DalException;
	List <Article> selectAll() throws DalException;
	List <Article> selectByMarque(String marque) throws DalException;
	List <Article> selectMotCle(String motCle) throws DalException;
	void update(Article a) throws DalException;
	void insert(Article a) throws DalException;
	void delete(int id) throws DalException;
}
