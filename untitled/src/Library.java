import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of books you wish to search: ");
        int members = scanner.nextInt();
        int[] list_ids = new int[members];
        String[] list_names = new String[members];
        int[] list_ages = new int[members];
        String[] list_genders = new String[members];
        library.jobs( list_ids, list_names, list_ages, list_genders);
    }
    private int jobs(int[] ids, String[] names, int[] ages, String[] genders) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        System.out.println("please enter what do you want to do ? \n 1) Add Member \n 2) Delete Member \n 3) Search Member \n 4) Edit Member \n 5) Exit");
        int list_do = scanner.nextInt();
        switch (list_do) {
            case 1:
                library.create(ids,names,ages,genders);
                break;
            case 2:
                break;
            case 3:
                library.search(ids,names,ages,genders);
                break;
            case 4:
                break;
            default:
                System.out.println("By");
                break;
        }
        return  0;
    }
    private void create(int[] ids, String[] names, int[] ages, String[] genders) {
        int id = getNextAvailableIndex(ids);
        if(id == -1) {
            System.out.println("USERS_IS_FULL");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        System.out.println("What is your name?");
        String name = scanner.nextLine(); // Read the name

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        System.out.println("What is your gender? M<Male>, F<Female>");
        String gender = scanner.nextLine();
        ids[id]=id+1 ;
        names[id] = name;
        ages[id] = age;
        genders[id] = gender;
        library.jobs(ids,names,ages,genders);
    }
    private void search(int[] ids,String[] names, int[] ages, String[] genders) {
        Library library = new Library();
        Scanner scanner =  new Scanner(System.in);
        System.out.println("What is your ID?");
        int id = scanner.nextInt();

       String result =   "name: " + names[id] + "\nages: " + ages[id] + "\ngenders: " + genders[id];
        System.out.println(result);

        library.jobs(ids,names,ages,genders);
    }
    private int getNextAvailableIndex(int[] id) {
        for(int i = 0 ; i < id.length ; i++) {
            if(id[i] == 0) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
