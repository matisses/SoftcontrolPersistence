package co.matisses.persistence.softcontrol.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ygil
 */
@Embeddable
public class MarcacionesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "empleado_id")
    private long empleadoId;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public MarcacionesPK() {
    }

    public MarcacionesPK(long empleadoId, Date fecha) {
        this.empleadoId = empleadoId;
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) empleadoId;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarcacionesPK)) {
            return false;
        }
        MarcacionesPK other = (MarcacionesPK) object;
        if (this.empleadoId != other.empleadoId) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.matisses.persistence.softcontrol.entity.MarcacionesPK{" + "empleadoId=" + empleadoId + ", fecha=" + fecha + '}';
    }
}
