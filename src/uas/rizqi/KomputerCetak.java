package uas.rizqi;

final class KomputerCetak {
    final static void cetak(Komputer[] obj){
        for (Komputer comp : obj) {
            if (comp instanceof PC) {
                comp.hidupkan_os();
                comp.klik_kanan();
                comp.klik_kiri();
                comp.tekan_enter();
                comp.cetak_data();
                comp.matikan_os();
                System.out.println();
            } else if (comp instanceof Laptop) {
                comp.hidupkan_os();
                comp.klik_kanan();
                comp.klik_kiri();
                comp.tekan_enter();
                comp.cetak_data();
                comp.matikan_os();
                System.out.println();
            } else if (comp instanceof Netbook) {
                comp.hidupkan_os();
                comp.klik_kanan();
                comp.klik_kiri();
                comp.tekan_enter();
                comp.cetak_data();
                comp.matikan_os();
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Komputer[] komp = new Komputer[3];
        komp[0] = new PC("Asus ROG STRIX Z790 E Gaming", "Intel Core i9 13900K", 
                        "Nvidia GeForce RTX 4090", "Komputer Gaming High-End");
        komp[1] = new Laptop("HP Pavilion Gaming 15", "Ryzen 5 5600H", 
                        "Nvidia GeForce GTX 1650", "Laptop Gaming");
        komp[2] = new Netbook("Asus Chromebook", "Intel Celeron N4020", 
                        "Intel UHD Graphics", "Notebook Entry Level");
        KomputerCetak.cetak(komp);
    }
}
