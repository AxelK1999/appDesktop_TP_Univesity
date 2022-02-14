package DAO_Modelos;
import Modelos.Campo;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.TransactionException;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.util.config.ConfigurationException;
import org.hibernate.query.Query;



public class Campo_DAO implements DAO_Base_CRUD <Campo> {
	
	SessionFactory configuracionConexion = null;
	Session conexionBD = null;
	
	
	private int abrirConexion() {
		
		try {
			configuracionConexion = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Campo.class).buildSessionFactory();
			conexionBD = configuracionConexion.openSession();
		}catch(ConfigurationException |  SessionException E) {
			JOptionPane.showMessageDialog(null, E.getMessage() , "Error al establecer la conexion", 0, null);
			return -1;
		}
		return 1;
	}
	
	
	public int actualizar(Campo elemento){
		
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
	
	
	public int eliminar(Campo elemento){

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
	
	public int agregar(Campo elemento){
           
		try {
			if(abrirConexion()== -1)
				return -1;
			
			conexionBD.beginTransaction();
			conexionBD.save(elemento);
			conexionBD.getTransaction().commit();
		
		}catch(TransactionException E) {
			return -1;
			//TODO
		}finally {
			conexionBD.close();
			configuracionConexion.close();
		}
		
	     return 1;    
	}
	
	public Campo obtener(int claveElemnto){
         
		Campo result = null;
		try {
			
			if(abrirConexion() == -1)
				return null;
			
			conexionBD.beginTransaction();
			result = conexionBD.get(Campo.class,claveElemnto);
			conexionBD.getTransaction().commit();
		
		}catch(TransactionException E) {
			 return null;
			//TODO
		}finally {
			conexionBD.close();
			configuracionConexion.close();
		}
		
	     return result;
           
      }
	
		public LinkedList<Campo> obtenerTodos(){
            
        	LinkedList<Campo> result = null;
        	Query query = null;
    		try {
    			
    			if(abrirConexion() == -1)
    				return null;
    			
    			conexionBD.beginTransaction();
    			query = conexionBD.createQuery("FROM campo");
    			result = (LinkedList<Campo>)query.list();
    			conexionBD.getTransaction().commit();
    		
    		}catch(TransactionException E) {
    			return null;
    			//TODO
    		}finally {
    			conexionBD.close();
    			configuracionConexion.close();
    		}
    	     return result;
        }
        
	
}
