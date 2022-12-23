package uas.rizqi;

import uas.rizqi.iface.Keyboard;
import uas.rizqi.iface.Mouse;
import uas.rizqi.iface.Printer;

public abstract class Komputer implements Mouse, Keyboard, Printer{
   protected String merek, proc, gpu, jenis;

   abstract void hidupkan_os();
   abstract void matikan_os(); 

}
