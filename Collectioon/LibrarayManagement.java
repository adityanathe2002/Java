//package com.collection;
//
//import java.util.*;
//
//class Student
//{
//    String name;
//    String stream;
//    int sid;
//    int sPassword;
//    List<String> borrowedBooks;
//
//    Student(String name, String stream, int sid, int sPassword) 
//    {
//        this.name = name;
//        this.stream = stream;
//        this.sid = sid;
//        this.sPassword = sPassword;
//        this.borrowedBooks = new ArrayList<>();
//    }
//
//    public void displayStudent() 
//    {
//        System.out.println();
//        System.out.println("*** Student Info ***");
//        System.out.println("Name : " + this.name);
//        System.out.println("Stream : " + this.stream);
//        System.out.println("Stud ID : " + this.sid);
//        System.out.println();
//    }
//
//    public void borrowBook(String book) 
//    {
//        borrowedBooks.add(book);
//        System.out.println("Borrowed " + book);
//    }
//
//    public void returnBook(String book) 
//    {
//        if (borrowedBooks.remove(book)) 
//        {
//            System.out.println("Returned " + book);
//        } 
//        else 
//        {
//            System.out.println("You haven't borrowed this book.");
//        }
//    }
//
//    public void displayBorrowedBooks() 
//    {
//        System.out.println("*** Borrowed Books ***");
//        if (borrowedBooks.isEmpty()) 
//        {
//            System.out.println("No borrowed books.");
//        } 
//        else 
//        {
//            for (String book : borrowedBooks) 
//            {
//                System.out.println(book);
//            }
//        }
//    }
//}
//
//class Library 
//{
//    Map<String, List<String>> streamWiseBooksList;
//
//    Library(Map<String, List<String>> streamWiseBooksList) 
//    {
//        this.streamWiseBooksList = streamWiseBooksList;
//    }
//
//    public void displayBooks(String stream) 
//    {
//        System.out.println();
//        System.out.println("*** Books List for " + stream + " Stream ***");
//        List<String> booksList = streamWiseBooksList.get(stream);
//        if (booksList != null) 
//        {
//            for (String book : booksList) 
//            {
//                System.out.println(book);
//            }
//        } 
//        else 
//        {
//            System.out.println("No books available for this stream.");
//        }
//        System.out.println();
//    }
//}
//
//class LibrarayManagement
//{
//    public static void main(String[] args) 
//    {
//        //  Student Stream wise books Display
//        Map<String, List<String>> streamWiseBooksList = new HashMap<>();
//
//        streamWiseBooksList.put("Electronic", Arrays.asList("1. Electronic Book 1", "2. Electronic Book 2"));
//        streamWiseBooksList.put("Computer Science", Arrays.asList("1. CS Book 1", "2. CS Book 2"));
//        streamWiseBooksList.put("Mechanical", Arrays.asList("1. Mechanical Book 1", "2. Mechanical Book 2"));
//        streamWiseBooksList.put("Civil", Arrays.asList("1. Civil Book 1", "2. Civil Book 2"));
//        streamWiseBooksList.put("Electrical", Arrays.asList("1. Electrical Book 1", "2. Electrical Book 2"));
//
//        Library library = new Library(streamWiseBooksList);
//
//        //  create a object to call the methods 
//        List<Student> students = new ArrayList<>();
//
//        boolean isLoggedIn = false;  
//        Student currentStudent = null; // initialy student are not available
//        Scanner sc = new Scanner(System.in);
//
//        while (true) 
//        {
//            if (!isLoggedIn) 
//            {
//                System.out.println("*** Welcome to the Library ***");
//                System.out.println("1. Register");
//                System.out.println("2. Login");
//                System.out.println("3. Exit");
//                System.out.print("Enter an option: ");
//                int opt = sc.nextInt();
//
//                switch (opt) 
//                {
//                    case 1:
//                        Student newStudent = registerStudent(sc, students);
//                        if (newStudent != null) 
//                        {
//                            students.add(newStudent);
//                            System.out.println("Registration successful. You can now login.");
//                            System.out.println();
//                        } 
//                        else 
//                        {
//                            System.out.println("Registration failed. Please try again.");
//                            System.out.println();
//                        }
//                        break;
//                    case 2:
//                        System.out.print("Enter Student ID: ");
//                        int sID = sc.nextInt();
//                        System.out.print("Enter Student Password: ");
//                        int uPass = sc.nextInt();
//
//                        currentStudent = students.stream()
//                                .filter(stud -> stud.sid == sID && stud.sPassword == uPass)
//                                .findFirst()
//                                .orElse(null);
//
//                        if (currentStudent != null) 
//                        {
//                            currentStudent.displayStudent();
//                            isLoggedIn = true;
//                        } 
//                        else 
//                        {
//                            System.out.println("Wrong Student ID or Password");
//                        }
//                        break;
//                    case 3:
//                        System.out.println("Exiting...");
//                        sc.close();
//                        return;
//                    default:
//                        System.out.println("Invalid Option");
//                }
//            } 
//            else 
//            {
//                System.out.println();
//                System.out.println("*** Library Menu ***");
//                System.out.println("1. View Books List");
//                System.out.println("2. Borrow a Book");
//                System.out.println("3. Return a Book");
//                System.out.println("4. View Borrowed Books");
//                System.out.println("5. Logout");
//                System.out.print("Enter an option: ");
//                int opt = sc.nextInt();
//
//                switch (opt) 
//                {
//                    case 1:
//                        library.displayBooks(currentStudent.stream);
//                        break;
//                    case 2:
//                        List<String> booksList = streamWiseBooksList.get(currentStudent.stream);
//                        if (currentStudent.borrowedBooks.size() >= booksList.size()) 
//                        {
//                            System.out.println("You have already borrowed all available books.");
//                            break;
//                        }
//                        System.out.print("Enter the book number to borrow: ");
//                        int bookNum = sc.nextInt();
//                        if (bookNum >= 1 && bookNum <= booksList.size()) 
//                        {
//                            currentStudent.borrowBook(booksList.get(bookNum - 1));
//                        } 
//                        else 
//                        {
//                            System.out.println("Invalid book option");
//                        }
//                        break;
//                    case 3:
//                        booksList = streamWiseBooksList.get(currentStudent.stream); // Add this line
//                        System.out.print("Enter the book number to return: ");
//                        int returnBookNum = sc.nextInt();
//                        if (returnBookNum >= 1 && returnBookNum <= booksList.size()) 
//                        {
//                            currentStudent.returnBook(booksList.get(returnBookNum - 1));
//                        } 
//                        else 
//                        {
//                            System.out.println("Invalid book option");
//                        }
//                        break;
//                    case 4:
//                        currentStudent.displayBorrowedBooks();
//                        break;
//                    case 5:
//                        isLoggedIn = false;
//                        currentStudent = null;
//                        break;
//                    default:
//                        System.out.println("Invalid Option");
//                }
//            }
//        }
//    }
//
//    private static Student registerStudent(Scanner sc, List<Student> students) 
//    {
//        System.out.print("Enter Name: ");
//        String name = sc.next();
//        System.out.print("Enter Stream: ");
//        String stream = sc.next();
//        System.out.print("Enter Student ID: ");
//        int sid = sc.nextInt();
//        System.out.print("Enter Password: ");
//        int sPassword = sc.nextInt();
//
//        boolean idExists = students.stream().anyMatch(stud -> stud.sid == sid);
//        if (idExists) 
//        {
//            System.out.println("Student ID already exists. Try again with a different ID.");
//            return null;
//        }
//
//        return new Student(name, stream, sid, sPassword);
//    }
//}
