package co.matisses.persistence.softcontrol.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ygil
 */
@Entity
@Table(name = "marcaciones_fallidas")
public class MarcacionesFallidas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "estacion_nombre")
    private String estacionNombre;
    @Basic(optional = false)
    @Column(name = "estacion_ip")
    private String estacionIp;
    @Basic(optional = false)
    @Column(name = "excepcion")
    private String excepcion;
    @Lob
    @Column(name = "foto")
    private byte[] foto;

    public MarcacionesFallidas() {
    }

    public MarcacionesFallidas(Long id, Date fecha, String estacionNombre, String estacionIp, String excepcion, byte[] foto) {
        this.id = id;
        this.fecha = fecha;
        this.estacionNombre = estacionNombre;
        this.estacionIp = estacionIp;
        this.excepcion = excepcion;
        this.foto = foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public String getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(String excepcion) {
        this.excepcion = excepcion;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarcacionesFallidas)) {
            return false;
        }
        MarcacionesFallidas other = (MarcacionesFallidas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.matisses.persistence.softcontrol.entity.MarcacionesFallidas[ id=" + id + " ]";
    }
}
