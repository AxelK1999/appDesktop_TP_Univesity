package DAO_Modelos;

import Modelos.Cultivo;
import Modelos.EstadoCampo;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.TransactionException;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.util.config.ConfigurationException;
import org.hibernate.query.Query;

public class EstadoCampo_DAO implements DAO_Base_CRUD <EstadoCampo> {
	
	SessionFactory configuracionConexion = null;
	Session conexionBD = null;
	
	
	private int abrirConexion() {
		
		try {
			configuracionConexion = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EstadoCampo.class).buildSessionFactory();
			conexionBD = configuracionConexion.openSession();
		}catch(ConfigurationException |  SessionException E) {
			JOptionPane.showMessageDialog(null, E.getMessage() , "Error al establecer la conexion", 0, null);
			return -1;
		}
		return 1;
	}
	
	
	public int actualizar(EstadoCampo elemento){
		
		try {
			
			 if(abrirConexion()== -1)
				 return -1;
			
			 conexionBD.beginTransaction();
			 conexionBD.update(elemento);
			 conexionBD.getTransaction().commit();
		
		}catch(TransactionException E) {
			 return -1;
		}finally {
			conexionBD.close();
			configuracionConexion.close();
		}
	     return 1; 
    }
	
	
	public int eliminar(EstadoCampo elemento){

			try {
				if(abrirConexion()== -1)
					return -1;
				
				conexionBD.beginTransaction();
				conexionBD.delete(elemento);
				conexionBD.getTransaction().commit();
			
			}catch(TransactionException E) {
				 return -1;
			}finally {
				conexionBD.close();
				configuracionConexion.close();
			}
		     return 1;  
        }
	
	public int agregar(EstadoCampo elemento){  
		try {
			if(abrirConexion()== -1)
				return -1;
			
			conexionBD.beginTransaction();
			conexionBD.save(elemento);
			conexionBD.getTransaction().commit();
		
		}catch(TransactionException E) {
			return -1;
		}finally {
			conexionBD.close();
			configuracionConexion.close();
		}
	     return 1;    
	}
	
	public EstadoCampo obtener(int claveElemnto){
        
		EstadoCampo result = null;
		try {
			
			if(abrirConexion() == -1)
				return null;
			
			conexionBD.beginTransaction();
			result = conexionBD.get(EstadoCampo.class,claveElemnto);
			conexionBD.getTransaction().commit();
		
		}catch(TransactionException E) {
			 return null;
		}finally {
			conexionBD.close();
			configuracionConexion.close();
		}
	     return result;  
     }
	
		public LinkedList<EstadoCampo> obtenerTodos(){
            
        	LinkedList<EstadoCampo> result = null;
        	Query query = null;
    		try {
    			
    			if(abrirConexion() == -1)
    				return null;
    			
    			conexionBD.beginTransaction();
    			query = conexionBD.createQuery("FROM estadocampo");
    			result = (LinkedList<EstadoCampo>)query.list();
    			conexionBD.getTransaction().commit();
    		
    		}catch(TransactionException E) {
    			return null;
    		}finally {
    			conexionBD.close();
    			configuracionConexion.close();
    		}
    	     return result;
        }
	
}
