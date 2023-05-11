package JoeyLalo_01;
import java.util.*;

public class Main {
	
	
	static String spaces(int x) {
		String done = "";
		for (int i = 0; i < x; i++) {done+=" ";}
		return done;
	}
	
	static void topLine() {
		System.out.println("\nSearch Results:\n----------------------------------------------------------------------------");
		System.out.println("ID | Name          | Email               | Phone            | Notes");
		System.out.println("----------------------------------------------------------------------------");
	}
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Contact> conts = new ArrayList<Contact>();
		ArrayList<String> names = new ArrayList<String>();
		String name, email, notes;
		int phone;
		
		while (true) {
			System.out.println("Main Window:\n===============================================\nChoose one of the following options:");
			System.out.println("(1)Add a new contact");
			System.out.println("(2)Search for contact");
			System.out.println("(3)Display all contacts");
			System.out.println("(4)Quit");
			System.out.print("Enter your choice: ");
			int choice = input.nextInt(); input.nextLine();
			
			System.out.println("\n\n");
			
			if (choice == 1) {
				System.out.println("Main Window: --> Add a new contact window (Enter the following information):\n===============================================");
				System.out.print("Name: "); name = input.nextLine();
				System.out.print("Email: "); email = input.nextLine();
				System.out.print("Phone: "); phone = input.nextInt(); input.nextLine();
				System.out.print("Notes: "); notes = input.nextLine();
				System.out.println("-----------------------------------------------");
				conts.add(new Contact(name, email, phone, notes));
				names.add(name);
				System.out.print("Saved Successfully... Press Enter to go back to the Main Window"); input.nextLine();
			}
			
			else if (choice == 2) {
				System.out.println("Main Window: --> Search for Contact window: (Choose one of the following options)\n===============================================");
				System.out.println("(1)Search by Name\n(2)Search by Email\n(3)Search by Phone\n");
				System.out.print("Enter Your Choice: "); choice = input.nextInt(); input.nextLine();
				System.out.println("\n");
				
				if (choice == 1) {
					String search;
					Contact on;
					System.out.println("Main Window: --> Search for Contact window --> Search by Name\n===============================================");
					System.out.print("(1)Enter Name: "); search = input.nextLine();
					topLine();
					for (int i = 0; i < conts.size(); i++) {
						on = conts.get(i);
						if (on.name.contains(search)) {System.out.println(on.id + spaces(2-Integer.toString(on.id).length()) + " | " + on.name + spaces(14-on.name.length()) + "| " + on.email + spaces(20-on.email.length()) + "| " + on.phone + spaces(17-Integer.toString(on.phone).length()) + "| " + on.notes);}
					}
					System.out.println("----------------------------------------------------------------------------\n");
					System.out.println("Choose one of these options:\n(1)To delete a contact\n(2)Back to main Window\n");
					System.out.print("Enter Your Choice: ");choice = input.nextInt(); input.nextLine();
					if (choice == 1) {
						int del;
						System.out.println("\nMain Window: --> Search for Contact window --> Search by Name --> Delete Contact\n===============================================");
						System.out.print("Enter the Contact ID: "); del = input.nextInt(); input.nextLine();
						for (int i = 0; i < conts.size(); i++) {
							if (conts.get(i).id == del) {names.remove(names.indexOf(conts.get(i).name)); conts.remove(i);}
						}
						System.out.print("Deleted... press Enter to go back to main window"); input.nextLine();
					}
				}
				else if (choice == 2) {
					String search;
					Contact on;
					System.out.println("Main Window: --> Search for Contact window --> Search by Email\n===============================================");
					System.out.print("(2)Enter Email: "); search = input.nextLine();
					topLine();
					for (int i = 0; i < conts.size(); i++) {
						on = conts.get(i);
						if (on.email.contentEquals(search)) {System.out.println(on.id + spaces(2-Integer.toString(on.id).length()) + " | " + on.name + spaces(14-on.name.length()) + "| " + on.email + spaces(20-on.email.length()) + "| " + on.phone + spaces(17-Integer.toString(on.phone).length()) + "| " + on.notes);}
					}
					System.out.println("----------------------------------------------------------------------------\n");
					System.out.println("Choose one of these options:\n(1)To delete a contact\n(2)Back to main Window\n");
					System.out.print("Enter Your Choice: ");choice = input.nextInt(); input.nextLine();
					if (choice == 1) {
						int del;
						System.out.println("\nMain Window: --> Search for Contact window --> Search by Email --> Delete Contact\n===============================================");
						System.out.print("Enter the Contact ID: "); del = input.nextInt(); input.nextLine();
						for (int i = 0; i < conts.size(); i++) {
							if (conts.get(i).id == del) {names.remove(names.indexOf(conts.get(i).name)); conts.remove(i);}
						}
						System.out.print("Deleted... press Enter to go back to main window"); input.nextLine();
					}
				}
				else if (choice == 3) {
					int search;
					Contact on;
					System.out.println("Main Window: --> Search for Contact window --> Search by Phone\n===============================================");
					System.out.print("(2)Enter Phone: "); search = input.nextInt(); input.nextLine();
					topLine();
					for (int i = 0; i < conts.size(); i++) {
						on = conts.get(i);
						if (on.phone==search) {System.out.println(on.id + spaces(2-Integer.toString(on.id).length()) + " | " + on.name + spaces(14-on.name.length()) + "| " + on.email + spaces(20-on.email.length()) + "| " + on.phone + spaces(17-Integer.toString(on.phone).length()) + "| " + on.notes);}
					}
					System.out.println("----------------------------------------------------------------------------\n");
					System.out.println("Choose one of these options:\n(1)To delete a contact\n(2)Back to main Window\n");
					System.out.print("Enter Your Choice: ");choice = input.nextInt(); input.nextLine();
					if (choice == 1) {
						int del;
						System.out.println("\nMain Window: --> Search for Contact window --> Search by Phone --> Delete Contact\n===============================================");
						System.out.print("Enter the Contact ID: "); del = input.nextInt(); input.nextLine();
						for (int i = 0; i < conts.size(); i++) {
							if (conts.get(i).id == del) {names.remove(names.indexOf(conts.get(i).name)); conts.remove(i);}
						}
						System.out.print("Deleted... press Enter to go back to main window"); input.nextLine();
					}
				}
				
				
				
			}
			
			else if (choice == 3) {
				System.out.println("Main Window: --> Display All Contacts\n===============================================");
				Collections.sort(names);
				Contact on;
				topLine();
				for (int i = 0; i < names.size(); i++) {
					for (int j =0; j < names.size(); j++) {
						on = conts.get(j);
						if (on.name.contentEquals(names.get(i))) {
							System.out.println(on.id + spaces(2-Integer.toString(on.id).length()) + " | " + on.name + spaces(14-on.name.length()) + "| " + on.email + spaces(20-on.email.length()) + "| " + on.phone + spaces(17-Integer.toString(on.phone).length()) + "| " + on.notes);
							break;
						}
					}
				}
				System.out.println("----------------------------------------------------------------------------\n");
				System.out.print("Press Enter to go back to the Main Window"); input.nextLine();
				
			}
			
			else if (choice == 4) {break;}
			
			
			System.out.println("\n\n");
		}
		input.close();

	}

}
