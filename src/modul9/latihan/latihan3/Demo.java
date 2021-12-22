package modul9.latihan.latihan3;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        try {
            throw new ExceptionC();
        } catch (ExceptionA a){
            JOptionPane.showMessageDialog(null, a.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE);
        } try {
            throw new ExceptionB();
        } catch (ExceptionA b){
            JOptionPane.showMessageDialog(null, b.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}