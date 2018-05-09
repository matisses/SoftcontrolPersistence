package co.matisses.persistence.softcontrol.facade;

import co.matisses.persistence.softcontrol.entity.EmpleadosSoftcontrol;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ygil
 */
@Stateless
public class EmpleadosSoftcontrolFacade extends AbstractFacade<EmpleadosSoftcontrol> {

    @PersistenceContext(unitName = "SoftcontrolPersistencePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadosSoftcontrolFacade() {
        super(EmpleadosSoftcontrol.class);
    }
}
