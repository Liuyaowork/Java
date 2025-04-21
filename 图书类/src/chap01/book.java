package chap01;

public class book {
    public String author;
    public String title;
    public double price;
    public String publisher;
    public String publishedYear;

    public book(String author, String title, double price, String publisher, String publishedYear) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void display() {
        System.out.println("作者: " + author);
        System.out.println("书名: " + title);
        System.out.println("价格: " + price);
        System.out.println("出版社: " + publisher);
        System.out.println("出版年份: " + publishedYear);
    }
}