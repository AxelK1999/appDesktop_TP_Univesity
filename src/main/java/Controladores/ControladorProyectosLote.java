package Controladores;

import Modelos.SituacionAnormal;

import java.util.Date;
import java.util.LinkedList;

import DAO_Modelos.Dao_BD;
import Modelos.Campo;
import Modelos.Cultivo;
import Modelos.DetalleProyecto;
import Modelos.Laboreo;
import Modelos.Lote;
import Modelos.Proyecto;

public class ControladorProyectosLote {
    
Dao_BD dao_CRUD;
	
	public ControladorProyectosLote() {
		//dao_CRUD = new Dao_BD();
	}

	
	public int agregarProyecto(String estado,int nro_lote,int nro_Cultivo) {
		Lote L = new Lote(0, null, null);
		L.setNroLote(nro_lote);
		Cultivo C = new Cultivo(null, null, null);
		C.setNroTipoCultivo(nro_Cultivo);
		return dao_CRUD.agregar(new Proyecto(estado, L, C));
	}
	// con el numero de lote y numero de cultivo alcanza en los objetos
	public int actualizarProyecto(String estado,Lote lote,Cultivo cultivo) {
		return dao_CRUD.actualizar(new Proyecto(estado, lote, cultivo));
	}
	
	public int eliminarProyecto(int nro_Proyecto) {
		Proyecto proyecto = new Proyecto(null, null, null);
		proyecto.setNroProyecto(nro_Proyecto);
		return dao_CRUD.eliminar(proyecto);
	}
	
	public Proyecto consultarProyecto(int nro_Proyecto) {
		return (Proyecto)dao_CRUD.obtener(nro_Proyecto);
	}
	
	public int agregarDetalle(Date fechaInicio, Date fechaFinalizacion,Proyecto proyecto, Laboreo laboreo) {
		return dao_CRUD.agregar(new DetalleProyecto(fechaInicio, fechaFinalizacion, proyecto, laboreo));
	}
	
	public int actualizarDetalle(Date fechaInicio, Date fechaFinalizacion,Proyecto proyecto, Laboreo laboreo) {
		return dao_CRUD.actualizar(new DetalleProyecto(fechaInicio, fechaFinalizacion, proyecto, laboreo));
	}
	
	public int eliminarDetalle(int nro_Detalle) {
		DetalleProyecto detalleProyecto = new DetalleProyecto(null, null, null, null);
		detalleProyecto.setNroDetalle(nro_Detalle);
		return dao_CRUD.eliminar(detalleProyecto);
	}
	
	public DetalleProyecto consultarDetalle(int nroDetalle) {
		return (DetalleProyecto)dao_CRUD.obtener(nroDetalle);
	}
	
	public int agregarSituacionAnormal(String Incidencia) {
		return dao_CRUD.agregar(new SituacionAnormal(Incidencia));
	}
	
	public int actualizarSituacionAnormal(int nro_Situacion,String Incidencia) {
		SituacionAnormal situacionAnormal = new SituacionAnormal(Incidencia);
		situacionAnormal.setIdIncidencia(nro_Situacion);
		return dao_CRUD.actualizar(situacionAnormal);
	}
	
	public int eliminarSituacionAnormal(int nro_SituacionAnormal) {
		SituacionAnormal situacionAnormal = new SituacionAnormal(null);
		situacionAnormal.setIdIncidencia(nro_SituacionAnormal);
		return dao_CRUD.eliminar(situacionAnormal);
	}
	
	public SituacionAnormal consultarSituacionAnormal(int nro_SituacionAnoraml) {
		return (SituacionAnormal)dao_CRUD.obtener(nro_SituacionAnoraml);
	}
	
	public LinkedList<Object> consultar(Object o){
		return dao_CRUD.obtenerTodos(o);
	}
    
}
