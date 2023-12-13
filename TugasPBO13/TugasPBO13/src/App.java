import java.util.NoSuchElementException;

public class App {
    public static void main(String[] args) throws Exception {
        Kasir kasir = new Kasir();
        kasir.Login();
    //polymorphism
    InfoLengkap pelanggan1 = new Pelanggan();
    //exception    
    try {
        pelanggan1.input();
    } 
    catch (NoSuchElementException e){
        System.out.println("Error, input salah");
    }
        pelanggan1.struk();

    }
}