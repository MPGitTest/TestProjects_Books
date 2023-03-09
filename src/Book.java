public abstract class Book {
    protected String bookTitle;
    protected double bookPrice;
    public Book(String bookTitle,double bookPrice){
        this.bookTitle=bookTitle;
        this.bookPrice=bookPrice;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }
    public abstract void setBookPrice();

}
