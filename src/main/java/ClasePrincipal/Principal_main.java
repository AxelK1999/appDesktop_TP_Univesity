package ClasePrincipal;


import java.util.List;



/*import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;*/

import Controladores.ControladorCampo;
import Controladores.ControladorCultivos;
import Controladores.ControladorLote;
import Controladores.ControladorProyectosLote;
import Modelos.Campo;
import Modelos.EstadoCampo;
import Modelos.Lote;
import Vistas.MenuPrincipal;

public class Principal_main {

	public static void main(String[] args) {
		
		MenuPrincipal menuPrincipal = new MenuPrincipal(/*new ControladorProyectosLote(),new ControladorCampo(),new ControladorCultivos(),new ControladorLote()*/);
		menuPrincipal.setVisible(true);

	}
	
}
