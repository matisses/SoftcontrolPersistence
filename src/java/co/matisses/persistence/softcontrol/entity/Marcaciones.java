package co.matisses.persistence.softcontrol.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ygil
 */
@Entity
@Table(name = "marcaciones")
public class Marcaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MarcacionesPK marcacionesPK;
    @Basic(optional = false)
    @Column(name = "estacion_nombre")
    private String estacionNombre;
    @Basic(optional = false)
    @Column(name = "estacion_ip")
    private String estacionIp;
    @Basic(optional = false)
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;

    public Marcaciones() {
    }

    public Marcaciones(MarcacionesPK marcacionesPK, String estacionNombre, String estacionIp, Date fechaCreacion, Date fechaActualizacion) {
        this.marcacionesPK = marcacionesPK;
        this.estacionNombre = estacionNombre;
        this.estacionIp = estacionIp;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public MarcacionesPK getMarcacionesPK() {
        return marcacionesPK;
    }

    public void setMarcacionesPK(MarcacionesPK marcacionesPK) {
        this.marcacionesPK = marcacionesPK;
    }

    public String getEstacionNombre() {
        return estacionNombre;
    }

    public void setEstacionNombre(String estacionNombre) {
        this.estacionNombre = estacionNombre;
    }

    public String getEstacionIp() {
        return estacionIp;
    }

    public void setEstacionIp(String estacionIp) {
        this.estacionIp = estacionIp;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marcacionesPK != null ? marcacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marcaciones)) {
            return false;
        }
        Marcaciones other = (Marcaciones) object;
        if ((this.marcacionesPK == null && other.marcacionesPK != null) || (this.marcacionesPK != null && !this.marcacionesPK.equals(other.marcacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.matisses.persistence.softcontrol.entity.Marcaciones[ marcacionesPK=" + marcacionesPK + " ]";
    }
}
