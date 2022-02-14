package DAO_Modelos;

import java.util.LinkedList;

public interface DAO_Base_CRUD <Objeto> {
	
	public int actualizar(Objeto elemento);
	public int eliminar(Objeto elemento);
	public int agregar(Objeto elemento);
	public Objeto obtener(int claveElemnto);
    public LinkedList<Objeto> obtenerTodos();
	
}
