import org.w3c.dom.ls.LSOutput;

public class test {
    public static void main(String[] args) {
        Book b1 = new Book("NguyenDucTri","0-123-0123","baitap",2024);
        Magazine m1 = new Magazine(1234,"abc","bt",2024);

        System.out.println("Book Detail:");
        b1.getDetails();

        System.out.println("Magazine Detail:");
        m1.getDetails();
    }


}
