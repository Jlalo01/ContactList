public class Contact {
	static int count = 0;
	int id;
	String name;
	String email;
	int phone;
	String notes;
	
	Contact(String name, String email, int phone, String notes){
		count++;
		this.name = name;
		this.email = email;
		this.phone = phone;
		if (notes.length() == 0) {this.notes = "Nothing";}
		else {this.notes = notes;}
		this.id = count;
	}
	
	public String toString() {
		System.out.println(id + name + email + phone + notes);
		return "";
	}

}
