public class Fiction extends Book{

    public Fiction(String bookTitle,double bookPrice){
        super(bookTitle,bookPrice);
    }
    @Override
    public void setBookPrice() {
        super.bookPrice=24.99;
    }
    @Override
    public String toString(){
        return "{ " + bookTitle + "   "+bookPrice + " }";
    }
}
