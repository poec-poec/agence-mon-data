package agence.mon.interfaces;

import java.util.List;

/**
 * @author Seme
 */
public interface IDataRecovery<T>
{
    /**
     * Retourne tous les objets métier de la BDD de type T
     * 
     * @return La liste des BO
     */
    public abstract List<T> findAll();

    /**
     * Retourne un objet métier
     * 
     * @param id
     *            L'identifiant du BO
     * @return Le BO de la BDD qui possède l'id passé en paramètre.
     */
    public abstract T findById(int id);
}
