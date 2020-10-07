package ventanalogin;

public class DatosUsuario {
public DatosUsuario() {}

String usuario1 ="";
String contra="";
public boolean  probarcontra()
{
	usuario1= Ventana1.txtUsuario.getText();
	contra=Ventana1.pssContraseña.getText();
	if(usuario1.equals("humberto")&& contra.equals("Elmejor123")) 
		{
		return (true);
		}
		else 
		{
		return (false);
		}
	}

}

 
