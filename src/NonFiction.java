public class NonFiction extends Book{
    public NonFiction(String bookTitle,double bookPrice){
       super(bookTitle,bookPrice);
    }

    @Override
    public void setBookPrice() {
        super.bookPrice=37.99;
    }
    @Override
    public String toString(){
        return "{ " + bookTitle + "   "+bookPrice + " }";
    }
}
