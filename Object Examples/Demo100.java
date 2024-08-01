import java.util.*;
import java.util.Arrays;

class Student 
{
    String name;
    String stream;
    int sid;
    int sPassword;
    List<String> borrowedBooks; // Track borrowed books

    Student(String name, String stream, int sid, int sPassword) 
    {
        this.name = name;
        this.stream = stream;
        this.sid = sid;
        this.sPassword = sPassword;
        this.borrowedBooks = new ArrayList<>();
    }

    public void displayStudent() 
    {
        System.out.println();
        System.out.println("*** Student Info ***");
        System.out.println("Name : " + this.name);
        System.out.println("Stream : " + this.stream);
        System.out.println("Stud ID : " + this.sid);
        System.out.println();
    }

    public void borrowBook(String book) 
    {
        borrowedBooks.add(book);
        System.out.println("Borrowed " + book);
    }

    public void displayBorrowedBooks() 
    {
        System.out.println("*** Borrowed Books ***");
        for (String book : borrowedBooks) 
        {
            System.out.println(book);
        }
    }
}

class Library 
{
    String[] bookslist;

    Library(String[] bookslist) 
    {
        this.bookslist = bookslist;
    }

    public void displayBooks() 
    {
        System.out.println();
        System.out.println("*** Books List ***");
        System.out.println("Books : " + Arrays.toString(this.bookslist));
        System.out.println();
    }
}

class Demo100
{
   public static void main(String[] args)  throws InterruptedException
    {
        String[] bookslist = { "1. Atomic Habit", "2. Agnipankh", "3. The Misail Man", "4. Verbal English" };
        Library library = new Library(bookslist);
        Student stud = new Student("Aditya", "Electronic", 1, 123);
        
        boolean isLoggedIn = false; // Flag to track login status

        Scanner sc = new Scanner(System.in);

        int attempt=1;
        outerloop: 
        for ( ; ; ) 
        {
        	//int stud.sPassword();
        	int count=3;
        	do
        	{
	            if (!isLoggedIn) 
	            { // Check if student is not logged in
	                System.out.println("*** Welcome Library ***");
	                System.out.println("1. Login");
	                System.out.println("2. Logout");
	                System.out.println();
	                System.out.print("Enter an option : ");
	                int opt = sc.nextInt();
	                System.out.println();
	                switch (opt) 
	                {
	                    case 1: 
	                    {
	                        System.out.print("Enter Stud Password : ");
	                        int uPass = sc.nextInt();
	                        if (uPass == stud.sPassword) 
	                        {
	                            stud.displayStudent();
	                            isLoggedIn = true; // Set login flag to true
	                        } 
	                        else 
	                        {
	                            System.out.println("Wrong Password"+(count-1));
	                            System.out.println(count);
	                        }
	                        if (count==1)
					   		{
					   			System.out.println("wait 5 sec then we Try again");
					   			Thread.sleep(5000);
					   			System.out.println("You Can Try To Enter Your Pin Again");
					   		}
					   		count--;
					   		break;
	                        
	                    }

	                    case 2: 
	                    {
	                        System.exit(0);
	                    }
	                    default:
	                        System.out.println("Invalid Option");
	         
	                }
                }
	            else 
	            { // If student is logged in
	            	System.out.println();
	                System.out.println("*** Welcome to Library ***");
	                System.out.println("1. View Books List");
	                System.out.println("2. Borrow a Book");
	                System.out.println("3. View Borrowed Books");
	                System.out.println("4. Exit");
	                System.out.println();
	                System.out.print("Enter an option : ");
	                int opt = sc.nextInt();
	                System.out.println();
	                switch (opt) 
	                {
	                    case 1: 
	                    {
	                        library.displayBooks();
	                        break;
	                    }
	                    case 2: 
	                    {
	                        if (stud.borrowedBooks.size() >= bookslist.length) 
	                        {
	                            System.out.println("You have already borrowed all available books.");
	                            break;
	                        }
		                        System.out.print("Enter the book number to borrow : ");
		                        int bookNum = sc.nextInt();
		                        if (bookNum >= 1 && bookNum <= bookslist.length) 
	                        {
	                            stud.borrowBook(bookslist[bookNum - 1]);
	                        } 
	                        else 
	                        {
	                            System.out.println("Invalid book option");
	                        }
	                        break;
	                    }
	                    case 3: 
	                    {
	                        stud.displayBorrowedBooks();
	                        break;
	                    }
	                    case 4: 
	                    {
	                        isLoggedIn = false; // Set login flag to false
	                        break;
	                    }
	                    default:
	                        System.out.println("Invalid Option");
	                }
	            }
	        }while(count>=1);

		   	 if(attempt++==2)
		   	  {
		   		break;
		   	  }
        }
    }
}

