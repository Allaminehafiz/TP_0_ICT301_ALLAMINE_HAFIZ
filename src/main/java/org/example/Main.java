package org.example;

import org.example.OCP.AreaCalculator;
import org.example.OCP.Circle;
import org.example.OCP.apres.AreaCalculator2;
import org.example.OCP.apres.Rectangle;
import org.example.OCP.apres.Shape;
import org.example.SRP.*;

import java.awt.*;

// Utilisation de la classe Book
public class Main {
    public static void main(String[] args) {


        /*
        BookSRP myBook = new BookSRP(

                "Le Petit Prince",
                "Antoine de Saint-Exupéry",
                "Toutes les grandes personnes ont d'abord été des enfants."
        );

        // 2. Utilisation du Printer pour l'affichage
        BookPrinter printer = new BookPrinter();
        printer.printToScreen(myBook);
        printer.printToHTML(myBook);

        // 3. Utilisation du Saver pour la persistance
        BookSaver saver = new BookSaver();
        saver.saveToDatabase(myBook);
        saver.saveToFile(myBook, "livre_archive.txt");

        // 4. Utilisation de la Logique Métier
        BookBusinessLogic logic = new BookBusinessLogic();
        logic.emprunter(myBook, "Jean Dupont");
        logic.autreService(myBook);
        */

    /*
    // Avant refactoring
         Book book = new Book("Les principes SOLID", "Etudiants de M1-GL", "Révision des principes SOLID");
         book.printToScreen();
         book.saveToDatabase();
         book.emprunter("Marcial");
         }*/

        /*

            Avant refactoring

            public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Rectangle myRect = new Rectangle(10, 5);
        Circle myCircle = new Circle(3);

        System.out.println("Surface du rectangle : " + calculator.calculateArea(myRect));
        System.out.println("Surface du cercle : " + calculator.calculateArea(myCircle));
    }
    */

        /*
        OCP avant refactoring


            AreaCalculator calculator = new AreaCalculator();

            Rectangle myRect = new Rectangle(10, 5);
            Circle myCircle = new Circle(3);

            System.out.println("Surface du rectangle : " + calculator.calculateArea(myRect));
            System.out.println("Surface du cercle : " + calculator.calculateArea(myCircle));



         */


       Shape myShape = new Rectangle(4, 3);
        AreaCalculator2 calculator = new AreaCalculator2();
        System.out.println("Area = " + calculator.calculateArea(myShape));

    }
}