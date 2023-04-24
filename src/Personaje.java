public  class Personaje {

    Position ubicacion;
    protected String nick;
    protected int vidas =3;
    protected int energia = 100;
    protected char orientacion = 'N';


/*
Con los métodos:
Disparar que consume 10 unidades de energía y podrá disparar hasta que consuma
toda su energía.
Girar que cambia secuencialmente de orientación N, E, S, O y vuelve nuevamente
N,E,S,O…..
 */

    public Personaje(Position ubicacion, String nick,boolean caballo){
        this.ubicacion = ubicacion;
        this.nick = nick;
        caballo = true;
    }

    public void girar () {
        char   orientacion = 0;
        switch (this.orientacion)  {
            case 'N':
                this.orientacion='E';
                System.out.println("orientación hacia el Este");
                break;
            case 'E':
                this.orientacion= 'S';
                System.out.println("orientación hacia el sur");
                break;
            case 'S':
                this.orientacion='O';
                System.out.println("orientación hacia el oeste");
                break;
            case 'O':
                this.orientacion = 'N';
                System.out.println("orientación hacia el norte");
                break;
        }
    }
    public void disparar () {
        if (getEnergia() >=0 ) {
            System.out.println("Disparando 🔫 ") ;
            this.energia -= 10;
        }else {
            System.out.println("No hay suficiente energia ⚠" +getEnergia());
        }
    }



    public void avanzar () {
        switch (this.orientacion){
            case 'N':
                this.ubicacion.setY(ubicacion.getY() - 1);
                System.out.println("Has bajado en Y");
                System.out.println("Nueva posicion: X= " + ubicacion.getX() + " Y= " + ubicacion.getY());
                break;
            case 'E':
                this.ubicacion.setX(ubicacion.getX() + 1);
                System.out.println("Has subido en X");
                System.out.println("Nueva posicion: X= " + ubicacion.getX() + " Y= " + ubicacion.getY());
                break;
            case 'S':
                this.ubicacion.setY(ubicacion.getY() + 1);
                System.out.println("Has subido en Y");
                System.out.println("Nueva posicion: X= " + ubicacion.getX() + " Y= " + ubicacion.getY());
                break;
            case 'O':
                this.ubicacion.setX(ubicacion.getX() - 1);
                System.out.println("Has bajado en X");
                System.out.println("Nueva posicion: X= " + ubicacion.getX() + " Y= " + ubicacion.getY());
                break;
        }
    }

    public void setNick(String nick) {
        this.nick = nick;
    }


    public Position getUbicacion() {
        return ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public int getVidas() {
        return vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    @Override
    public String toString() {
        return "Personaje: " +
                "ubicacion=" + ubicacion +
                ", nick='" + nick + '\'' +
                ", vidas=" + vidas +
                ", energia=" + energia +
                ", orientacion=" + orientacion ;
    }
}
