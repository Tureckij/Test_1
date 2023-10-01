public class Books {
    String title;
    String author;
}
class BookTestDrive{
    public static void main(String[] args){


        Books [] mybooks = new Books[3];
        mybooks[0] = new Books();
        mybooks[1] = new Books();
        mybooks[2] = new Books();
        int x = 0;
        mybooks[0].title = "Плоды Java";
        mybooks[1].title = "Java Гэтсби";
        mybooks[2].title = "Сборник рецептов по Java";

        mybooks[0].author = "Боб";
        mybooks[1].author = "Сью";
        mybooks[2].author = "Ян";

        while (x < 3) {
            System.out.print(mybooks[x].title);
            System.out.print(", автор ");
            System.out.println(mybooks[x].author);
            x = x + 1;
        }
    }
}