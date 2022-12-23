package uas.rizqi;

import uas.rizqi.iface.Mouse;
import uas.rizqi.iface.Keyboard;
import uas.rizqi.iface.Printer;

public class Netbook extends Komputer implements Mouse, Keyboard, Printer{
    Netbook(String merek, String proc, String gpu, String jenis){
        this.merek = merek;
        this.proc = proc;
        this.gpu = gpu;
        this.jenis = jenis;
    }

    void hidupkan_os() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("|   ~~~~ Netbook Sedang Booting..... ~~~~   |");
        System.out.println("---------------------------------------------");
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());;
        }
    }

    public void klik_kanan() {
        System.out.println("|   Sedang menekan klik kanan               |");
    }

    public void klik_kiri() {
        System.out.println("|   Sedang menekan klik kiri                |");
    }

    public void tekan_enter() {
        System.out.println("|   Netbook sedang menekan Enter            |");
    }

    public void cetak_data() {
            System.out.println("---------------------------------------------");
            System.out.println("|               Detail Netbook              |");
            System.out.println("---------------------------------------------");
            System.out.println("|    Merek      : "+merek);
            System.out.println("|    Procecor   : "+proc);
            System.out.println("|    GPU        : "+gpu);
            System.out.println("|    Jenis      : "+jenis);
    }

    void matikan_os() {
        System.out.println("---------------------------------------------");
        System.out.println("|     ~~~~ Mematikan Netbook..... ~~~~      |");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());;
        }
    }
}
