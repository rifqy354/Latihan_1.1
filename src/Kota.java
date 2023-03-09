public class Kota<E> {
    private E element;

    public Kota(E kota) {
        element = kota;
    }

    public E getElement(){
        return element;
    }
    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.print("Jumlah Kota di Jawa Timur : " + jumlahKota.getElement() + " kota.\n");
        System.out.println("Salah satu Kota di Jawa Timur adalah " + namaKota.getElement());
    }
}