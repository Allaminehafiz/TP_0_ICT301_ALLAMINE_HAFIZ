package org.example;
import org.example.LSP.Rectangle;

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

    /* principe OCP apres refactoring
       Shape myShape = new Rectangle(4, 3);
        AreaCalculator2 calculator = new AreaCalculator2();
        System.out.println("Area = " + calculator.calculateArea(myShape));
        */

        Rectangle rectangle = new Rectangle();
         rectangle.setWidth(5);
         rectangle.setHeight(4); // Attend une aire de 20
         System.out.println("Aire du Rectagle ="+rectangle.getArea());

        Rectangle rectangle1 = new Rectangle.Square();
         rectangle1.setWidth(5);
         rectangle1.setHeight(4); // Attend une aire de 20, mais obtient 16 (4x4)
         System.out.println("Aire du Carré ="+rectangle1.getArea()); // Résultat inattendu }

    }
}