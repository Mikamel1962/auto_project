import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.File.*;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner s = new Scanner(System.in);

        System.out.println("What kind of project do you want to make?");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Web: 1");
        System.out.println(" ");
        System.out.println("Java: 2");
        System.out.println(" ");
        System.out.println("Python: 3");

        String input = s.nextLine();

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.print("Project Name: ");
        String projectName = s.nextLine();

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        if (input.equals("1")) {
            new File("C:\\Users\\Adrian\\OneDrive - Møre og Romsdal Fylkeskommune\\Documents\\Coding\\Javascript\\" + projectName).mkdirs();


            new File("C:\\Users\\Adrian\\OneDrive - Møre og Romsdal Fylkeskommune\\Documents\\Coding\\Javascript\\" + projectName + "\\index.html")
                    .createNewFile();
            new File("C:\\Users\\Adrian\\OneDrive - Møre og Romsdal Fylkeskommune\\Documents\\Coding\\Javascript\\" + projectName + "\\index.css")
                    .createNewFile();
            new File("C:\\Users\\Adrian\\OneDrive - Møre og Romsdal Fylkeskommune\\Documents\\Coding\\Javascript\\" + projectName + "\\app.js")
                    .createNewFile();

            System.out.println(projectName + " has been made!");
        }

        if (input.equals("3")) {
            new File("C:\\Users\\Adrian\\OneDrive - Møre og Romsdal Fylkeskommune\\Documents\\Coding\\Python\\" + projectName).mkdirs();
            new File("C:\\Users\\Adrian\\OneDrive - Møre og Romsdal Fylkeskommune\\Documents\\Coding\\Python\\" + projectName + "\\main.py")
                    .createNewFile();
            System.out.println(projectName + " has been made!");
        }

    }
}
