package co.matisses.persistence.softcontrol.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Marcaciones.class)
public abstract class Marcaciones_ {

	public static volatile SingularAttribute<Marcaciones, String> estacionIp;
	public static volatile SingularAttribute<Marcaciones, Date> fechaCreacion;
	public static volatile SingularAttribute<Marcaciones, Date> fechaActualizacion;
	public static volatile SingularAttribute<Marcaciones, MarcacionesPK> marcacionesPK;
	public static volatile SingularAttribute<Marcaciones, String> estacionNombre;

}

