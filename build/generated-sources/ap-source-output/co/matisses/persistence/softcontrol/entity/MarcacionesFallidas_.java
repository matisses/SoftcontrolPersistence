package co.matisses.persistence.softcontrol.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MarcacionesFallidas.class)
public abstract class MarcacionesFallidas_ {

	public static volatile SingularAttribute<MarcacionesFallidas, String> estacionIp;
	public static volatile SingularAttribute<MarcacionesFallidas, Date> fecha;
	public static volatile SingularAttribute<MarcacionesFallidas, byte[]> foto;
	public static volatile SingularAttribute<MarcacionesFallidas, String> excepcion;
	public static volatile SingularAttribute<MarcacionesFallidas, Long> id;
	public static volatile SingularAttribute<MarcacionesFallidas, String> estacionNombre;

}

