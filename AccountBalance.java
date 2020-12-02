import MyPack.Lab18;

class AccountBalance {
public static void main(String args[]) {
	Lab18 current[] = new Lab18[3];
	current[0] = new Lab18("T. K. prasad", 123.23);
	current[1] = new Lab18(" Ashok Reddy", 157.02);
	current[2] = new Lab18("Narayana ", -12.33);
	for(int i=0;i<3;i++)
		current[i].show();
	
}
}