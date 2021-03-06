package damaschinas;

public class Casilla {

    private boolean color;
    private boolean tienePieza;
    private String pieza;
    //Colores de letra
    private String textoBlanco = "\u001B[37m";
    private String textoNegro = "\u001B[30m";
    //Colores de fondo
    private String negroFondo = "\u001B[40m";
    private String blancoFondo = "\u001B[47m";
    // reset
    public String reset = "\u001B[0m";

    public Casilla(boolean color, boolean tienePieza, int pieza) {
        this.color = color;
        this.tienePieza = tienePieza;
        definirColor(pieza);

    }

    public void definirColor(int pieza) {
        if (tienePieza == true) {
            if (color == true) {
                switch (pieza) {
                    case 1:
                        this.pieza = negroFondo + "  X  " + reset;
                        break;
                    case 2:
                        this.pieza = negroFondo + "  O  " + reset;
                        break;
                }
            } else {
                switch (pieza) {
                    case 1:
                        this.pieza = blancoFondo + textoNegro + "  X  " + reset;
                        break;
                    case 2:
                        this.pieza = blancoFondo + textoNegro + "  O  " + reset;
                        break;
                }
            }
        } else {
            if (color == true) {
                this.pieza = negroFondo + "     " + reset;
            } else {
                this.pieza = blancoFondo + "     " + reset;
            }
        }
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public boolean isTienePieza() {
        return tienePieza;
    }

    public void setTienePieza(boolean tienePieza) {
        this.tienePieza = tienePieza;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

}
