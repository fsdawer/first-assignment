package day07;

public class Aladin {
    public static void main(String[] args) {

        Book book = new Book();
        book.title = "전지적 독자시점";
        book.author = "싱숑";
        book.company = "비채";
        book.price = 13000;

        Book book1 = new Book();
        book1.title = "견우와 선녀";
        book1.author = "안수민";
        book1.company = "아르테팝";
        book1.price = 30000;


        Book[] fantasy = new Book[2];
        fantasy[0] = book;
        fantasy[1] = book1;


        System.out.println(fantasy[1].title + fantasy[1].price + fantasy[1].author);
    }
}
