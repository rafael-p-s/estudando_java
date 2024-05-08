package classe;

public class Usuario {
	String name;
	String email;
	
	
	//implement equals
	public boolean equals(Object object) {
		//Here, I'll explain how to compare users.
		
		Usuario other = (Usuario) object; //object convert to "Usuario"
		
		boolean nameIgual = other.name.equals(this.name);
		boolean emailIgual = other.email.equals(this.email);
		
		return nameIgual && emailIgual;
	}
}
