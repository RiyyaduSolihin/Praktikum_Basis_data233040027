package Pertemuan6;

public class StrukturListTest {

    public static void main(String[] args) {
        StrukturList list = new StrukturList();

       
        list.addTail(4);
        list.addTail(3);
        list.addTail(7);
        list.addTail(8);
        list.addTail(1);
        list.addTail(9);
        
        list.displayElement(); 
        System.out.println("");
    
        list.clear();
        
        list.displayElement();  
        System.out.println("List Kosong");
    }
}

