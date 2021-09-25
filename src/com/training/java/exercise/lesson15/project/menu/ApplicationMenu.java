package com.training.java.exercise.lesson15.project.menu;

import com.training.java.exercise.lesson15.project.model.User;
import com.training.java.exercise.lesson15.project.reader.Reader;
import com.training.java.exercise.lesson15.project.storage.UserStorage;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ApplicationMenu {

    private static final UserStorage STORAGE = new UserStorage();
    private static final Reader READER = new Reader();

    public void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. add new user");
        System.out.println("2. find user by user name");
        System.out.println("3. delete user by user name");
        System.out.println("4. find all users");
        System.out.println("5. remove user by user name");
        System.out.println("6. create new file");
        System.out.println("7. read file");
        System.out.println("0. exit");

    }

    public int readMenu() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void makeChoice(int choice) throws IOException {
        switch (choice) {
            case 1:
                addUser();
                break;
            case 2:
                findUser();
                break;
            case 3:
                deleteUser();
                break;
            case 4:
                findAllUsers();
                break;
            case 5:
                updateUser();
                break;
            case 6:
                createNewFileTxt();
            case 7:
                readFile();
            case 0:
                System.exit(0);
            default:
                System.out.println("no such operations");
        }
    }

    private void addUser() {
        String inputName = READER.readLine("input new first name: ");
        String inputEmail = READER.readLine("input new Email: ");
        User user = new User(inputName, inputEmail);
        STORAGE.addUser(user);
    }

    private void findUser() {
        String firstName = READER.readLine("Enter user name: ");
        User foundUser = STORAGE.findByFirstName(firstName);
        System.out.println(foundUser);
    }

    private void deleteUser() {
        String name = READER.readLine("Enter user name: ");
        if (STORAGE.deleteByUserName(name)) {
            System.out.println("User deleted");
        } else {
            System.out.println("User not found");
        }
    }

    private void findAllUsers() {
        List<User> users = STORAGE.findAllUsers();
        for (User element : users) {
            System.out.println(element);
        }
        if (users.size() == 0) {
            System.out.println("No users!");
        }
    }

    private void updateUser() {
        String findName = READER.readLine("input user name: ");
        String inputName = READER.readLine("input new first name: ");
        String inputEmail = READER.readLine("input new Email: ");
        long id = STORAGE.findByFirstName(findName).getId();
        User newUser = new User(id, inputName, inputEmail);
        STORAGE.changeUser(findName, newUser);
    }

    private File createNewFileTxt() throws IOException {
        String name = READER.readLine("Enter file name: ");
        FileWriter createdFile = new FileWriter("C:\\projects\\training\\src\\com\\training\\" +
                "java\\exercise\\lesson15\\project\\resource\\" + name + ".txt");
        List<User> users = STORAGE.findAllUsers();
        for (User element : users) {
            createdFile.write(element.toString());
        }
        createdFile.close();
        return createNewFileTxt();
    }

    private void readFile() throws IOException {
        String name = READER.readLine("Enter file name: ");
        FileReader readFile = new FileReader("C:\\projects\\training\\src\\com\\training\\" +
                "java\\exercise\\lesson15\\project\\resource\\" + name + ".txt");
        Scanner scan = new Scanner(readFile);

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        readFile.close();
    }

}
