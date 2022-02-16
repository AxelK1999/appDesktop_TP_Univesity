package Controladores;

import java.util.*;
import DAO_Modelos.Dao_BD;
import Modelos.Campo;
import Modelos.EstadoCampo;

public class ControladorCampo {
    
	Dao_BD dao_CRUD;
	
    public ControladorCampo(){
    	dao_CRUD = new Dao_BD();
    }
    
    public int agregarCampo(String direccion, int nro_estado) {
    	EstadoCampo estado = new EstadoCampo("Creado");
    	estado.setIdEstado(nro_estado);
    	
    	if(direccion == null)
    		return -4;
    	if(direccion.length() > 50)
			return -11;// longitud demasado largo
		if(dao_CRUD.countElement(new Campo(), "where direccion = '"+direccion+"'") > 0)
			return -10;
    	
		return dao_CRUD.agregar(new Campo(direccion, estado));
    	
    }
    
    public int eliminarCampo(int nro_Campo) {
    	Campo C = new Campo(null,null);
    	C.setNroCampo(nro_Campo);
    	return dao_CRUD.eliminar(C);
    }
    
    public int actualizarDireccionCampo(int nro_Campo,String direccion){
        
       Campo C = consultarCampo(nro_Campo);
       
       if(C == null)
           return -1;
       
        C.setDireccion(direccion);
        return dao_CRUD.actualizar(C);
        
    }
    public int actualizarCampo(int nro_Campo,String direccion,EstadoCampo estdo) {
    	Campo C = new Campo(direccion, estdo);
    	C.setNroCampo(nro_Campo);
    	return dao_CRUD.actualizar(C);
    }
    
    public Campo consultarCampo(int nro_Campo) {
    	return (Campo)dao_CRUD.obtener(nro_Campo,Campo.class);
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
    
    public  java.util.List consultar(String filtro){
    	return dao_CRUD.obtenerTodos(new Campo(),filtro);
	}
    
    public long numeroCampos(String filtro){
    	return dao_CRUD.countElement(new Campo(), filtro);
    }
    
    public List consultarEstadosCampo() {
    	return (List) dao_CRUD.obtenerTodos(new EstadoCampo()," ");
    }
    
    public List<Object[]> cantidadLotesEnCampo(int nroCampo) {
    	return dao_CRUD.consultaNativa(new Campo(),"select campo.pk_nro_campo, count(pk_nro_campo)as cantidad from campo inner join lotes on campo.pk_nro_campo = lotes.fk_nro_campo "
    			+ "group by pk_nro_campo, campo.pk_nro_campo having campo.pk_nro_campo = " + nroCampo );
    }
}
