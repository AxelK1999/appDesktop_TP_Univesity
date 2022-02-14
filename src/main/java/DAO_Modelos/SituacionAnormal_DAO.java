package DAO_Modelos;

import Modelos.Proyecto;
import Modelos.SituacionAnormal;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.TransactionException;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.util.config.ConfigurationException;
import org.hibernate.query.Query;

public class SituacionAnormal_DAO implements DAO_Base_CRUD <SituacionAnormal> {
	
	SessionFactory configuracionConexion = null;
	Session conexionBD = null;
	
	
	private int abrirConexion() {
		
		try {
			configuracionConexion = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(SituacionAnormal.class).buildSessionFactory();
			conexionBD = configuracionConexion.openSession();
		}catch(ConfigurationException |  SessionException E) {
			JOptionPane.showMessageDialog(null, E.getMessage() , "Error al establecer la conexion", 0, null);
			return -1;
		}
		return 1;
	}
	
	
	public int actualizar(SituacionAnormal elemento){
		
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
	
	
	public int eliminar(SituacionAnormal elemento){

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
	
	public int agregar(SituacionAnormal elemento){  
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
	
	public SituacionAnormal obtener(int claveElemnto){
        
		SituacionAnormal result = null;
		try {
			
			if(abrirConexion() == -1)
				return null;
			
			conexionBD.beginTransaction();
			result = conexionBD.get(SituacionAnormal.class,claveElemnto);
			conexionBD.getTransaction().commit();
		
		}catch(TransactionException E) {
			 return null;
		}finally {
			conexionBD.close();
			configuracionConexion.close();
		}
	     return result;  
     }
	
		public LinkedList<SituacionAnormal> obtenerTodos(){
            
        	LinkedList<SituacionAnormal> result = null;
        	Query query = null;
    		try {
    			
    			if(abrirConexion() == -1)
    				return null;
    			
    			conexionBD.beginTransaction();
    			query = conexionBD.createQuery("FROM situacionanormal");
    			result = (LinkedList<SituacionAnormal>)query.list();
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
