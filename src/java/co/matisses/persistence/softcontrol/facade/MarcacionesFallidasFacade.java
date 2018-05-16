package co.matisses.persistence.softcontrol.facade;

import co.matisses.persistence.softcontrol.entity.MarcacionesFallidas;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ygil
 */
@Stateless
public class MarcacionesFallidasFacade extends AbstractFacade<MarcacionesFallidas> {

    @PersistenceContext(unitName = "SoftcontrolPersistencePU")
    private EntityManager em;
    private static final Logger CONSOLE = Logger.getLogger(MarcacionesFallidasFacade.class.getSimpleName());

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MarcacionesFallidasFacade() {
        super(MarcacionesFallidas.class);
    }

    public List<Object[]> obtenerRegistros() {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT e.identificacion, e.nombre, m.fecha, m.estacion_ip, m.excepcion ");
        sb.append("FROM   marcaciones_fallidas m ");
        sb.append("INNER  JOIN empleados e ON e.id = m.empleado_id ");
        sb.append("WHERE  m.empleado_id IS NOT NULL ");
        sb.append("AND    DATE(m.fecha) = curdate() ");
        sb.append("ORDER  BY m.fecha DESC ");

        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las marcaciones fallidas. ", e);
        }

        return null;
    }
}
