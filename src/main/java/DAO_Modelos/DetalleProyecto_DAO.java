package DAO_Modelos;

import Modelos.Cultivo;
import Modelos.DetalleProyecto;
import java.util.Date;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.TransactionException;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.util.config.ConfigurationException;
import org.hibernate.query.Query;

public class DetalleProyecto_DAO implements DAO_Base_CRUD <DetalleProyecto> {
	
	SessionFactory configuracionConexion = null;
	Session conexionBD = null;
	
	
	private int abrirConexion() {
		
		try {
			configuracionConexion = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(DetalleProyecto.class).buildSessionFactory();
			conexionBD = configuracionConexion.openSession();
		}catch(ConfigurationException |  SessionException E) {
			JOptionPane.showMessageDialog(null, E.getMessage() , "Error al establecer la conexion", 0, null);
			return -1;
		}
		return 1;
	}
	
	
	public int actualizar(DetalleProyecto elemento){
		
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
	
	
	public int eliminar(DetalleProyecto elemento){

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
	
	public int agregar(DetalleProyecto elemento){
           
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
	
	public DetalleProyecto obtener(int claveElemnto){
         
		DetalleProyecto result = null;
		try {
			
			if(abrirConexion() == -1)
				return null;
			
			conexionBD.beginTransaction();
			result = conexionBD.get(DetalleProyecto.class,claveElemnto);
			conexionBD.getTransaction().commit();
		
		}catch(TransactionException E) {
			 return null;
		}finally {
			conexionBD.close();
			configuracionConexion.close();
		}
		
	     return result;
           
      }
	
		public LinkedList<DetalleProyecto> obtenerTodos(){
            
        	LinkedList<DetalleProyecto> result = null;
        	Query query = null;
    		try {
    			
    			if(abrirConexion() == -1)
    				return null;
    			
    			conexionBD.beginTransaction();
    			query = conexionBD.createQuery("FROM detalle_proyecto");
    			result = (LinkedList<DetalleProyecto>)query.list();
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

