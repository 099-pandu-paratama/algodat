package algodat;
import java.util.Arrays;
public class main {
    public static void main(String [] args){
        ArrayLinearList x = new ArrayLinearList1();
        x.add(0,"z");
        x.add(1,"y");
        x.add(2,"x");
        x.add(3,"w");
        x.add(4,"v");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.element[i]);
        }
        System.out.println("panjang array : "+x.size());
        System.out.println("sebelum di trim : "+x.capacity);
        x.trimToSize();
        System.out.println("setelah di trim : "+x.capacity);
        x.setSize(8);
        System.out.println("ukuran elemen de set menjadi: " +x.element2.length);
        x.remove(1);
        System.out.println("Tampilan setelah indek 1 dihapus :");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.element[i]);
        }
    }
    }

