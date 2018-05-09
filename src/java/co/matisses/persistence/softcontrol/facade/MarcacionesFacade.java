package co.matisses.persistence.softcontrol.facade;

import co.matisses.persistence.softcontrol.entity.Marcaciones;
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
public class MarcacionesFacade extends AbstractFacade<Marcaciones> {

    @PersistenceContext(unitName = "SoftcontrolPersistencePU")
    private EntityManager em;
    private static final Logger CONSOLE = Logger.getLogger(MarcacionesFacade.class.getSimpleName());

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MarcacionesFacade() {
        super(Marcaciones.class);
    }

    public List<Object[]> obtenerRegistros(Integer minutos) {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT e.identificacion, e.nombre, m.fecha, m.estacion_ip, m.tipo_marcacion_id ");
        sb.append("FROM   marcaciones m ");
        sb.append("INNER  JOIN empleados e ON e.id = m.empleado_id ");
        sb.append("WHERE  m.fecha > now() - INTERVAL ");
        sb.append(minutos);
        sb.append(" minute ");
        sb.append("ORDER  BY m.fecha DESC ");

        try {
            return em.createNativeQuery(sb.toString()).getResultList();
        } catch (NoResultException e) {
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar las marcaciones. ", e);
        }
        return null;
    }
}
