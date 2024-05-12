package colecoes;

public class Usuario {

	// Object
	String name;

	Usuario(String name) {
		this.name = name;
	}
	

	public String toString() {
		return "My name is "+this.name;
	}

	@Override
	public int hashCode() {
		//This area will generate unique numbers to assign names, similar to an 'id'.

		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
