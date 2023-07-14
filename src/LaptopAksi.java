public class LaptopAksi {
    public static void main(String[] args) {
        Laptop Acer = new Laptop();
        Acer.namapembeli ="Ramadhani";
        Acer.warna = "Black";
        Acer.ukuran = 14.5;
        Acer.processor = "Intel i3-4170";
        Acer.harga = 8000000;


        System.out.println("nama pembeli : "+Acer.namapembeli);
        System.out.println("Warna : "+Acer.warna);
        System.out.println("ukuran layar : "+Acer.ukuran+(" inch"));
        System.out.println("Processor : "+Acer.processor);
        System.out.println("harga : "+Acer.harga+("\n"));



        Laptop Asus = new Laptop();
        Asus.namapembeli ="Akhmad";
        Asus.warna = "White";
        Asus.ukuran = 15;
        Asus.processor = "Amd Ryzen 3";
        Asus.harga = 8000000;


        System.out.println("nama pembeli : "+Asus.namapembeli);
        System.out.println("Warna : "+Asus.warna);
        System.out.println("ukuran layar : "+Asus.ukuran+(" inch"));
        System.out.println("Processor : "+Asus.processor);
        System.out.println("harga : "+Asus.harga+("\n"));



Acer.diskon();
Asus.diskon();
        System.out.println("Total membeli 2 Laptop dengan diskon : Rp "+(Acer.harga+Asus.harga));

    }
}
