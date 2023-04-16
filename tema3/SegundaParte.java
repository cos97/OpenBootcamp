/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

/**
 *
 * @author Usuario
 */
public class SegundaParte {

    /**
     * @param args the command line arguments
     */
    public static class Coche {

        private int numPuertas;

        public Coche(int numPuertas) {
            this.numPuertas = numPuertas;
        }

        public void aumentoPuertas() {
            numPuertas++;
        }

        public int getPuertas() {
            return numPuertas;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Coche seatLeon = new Coche(3);
        System.out.println("El coche tiene " + seatLeon.getPuertas() + " puertas");
        seatLeon.aumentoPuertas();
        System.out.println("El coche tiene " + seatLeon.getPuertas() + " puertas");
    }
}
