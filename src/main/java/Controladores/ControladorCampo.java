package Controladores;

import java.util.LinkedList;

import DAO_Modelos.Dao_BD;
import Modelos.Campo;
import Modelos.EstadoCampo;

public class ControladorCampo {
    
	Dao_BD dao_CRUD;
	
    public ControladorCampo(){
    	dao_CRUD = new Dao_BD();
    }
    
    public int agregarCampo(String direccion, int nro_estado) {
    	EstadoCampo estado = new EstadoCampo(null);
    	estado.setIdEstado(nro_estado);
    	return dao_CRUD.agregar(new Campo(direccion, estado));
    }
    public int eliminarCampo(int nro_Campo) {
    	Campo C = new Campo(null,null);
    	C.setNroCampo(nro_Campo);
    	return dao_CRUD.eliminar(C);
    }
    public int actualizarCampo(int nro_Campo,String direccion,EstadoCampo estdo) {
    	Campo C = new Campo(direccion, estdo);
    	C.setNroCampo(nro_Campo);
    	return dao_CRUD.actualizar(C);
    }
    
    public Campo consultarCampo(int nro_Campo) {
    	return (Campo)dao_CRUD.obtener(nro_Campo);
    }
    
    public int agregarEstadoCampo(String estado) {
    	return dao_CRUD.agregar(new EstadoCampo(estado));
    }
    public int actualizarEstadoCampo(int nro_EstadoCampo,String estado) {
    	EstadoCampo estadoCampo = new EstadoCampo(estado);
    	estadoCampo.setIdEstado(nro_EstadoCampo);
    	return dao_CRUD.actualizar(estadoCampo);
    }
    public int eliminarUnEstado(int nro_Estado) {
    	EstadoCampo e = new EstadoCampo(null);
    	e.setIdEstado(nro_Estado);
    	return dao_CRUD.eliminar(e);
    }
    
    public LinkedList<Object> consultar(Object o){
		return dao_CRUD.obtenerTodos(o);
	}
}
