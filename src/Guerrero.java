public class Guerrero extends Personaje {

    protected boolean caballo;

    public Guerrero(Position ubicacion, String nick, boolean caballo) {
        super(ubicacion, nick, caballo);
        //se inicializa con caballo. Es necesario que vaya en el construcotr, sino se puede poner caballo = true (sin recibirlo en parametro)
        this.caballo = caballo;
    }


    public boolean isCaballo() {
        return caballo;
    }


    //con menos de -30 pierde caballo
    public void disparar() {
        if (this.energia < 30) {
            System.out.println("No hay suficiente energía. No podés montarte al caballo ");
        } else {
            super.disparar();
        }
    }


    public void girar() {
        super.girar();
    }

    @Override
    public void avanzar() {
        int pasos = 10;
        if (this.caballo) {
            switch (orientacion) {
                case 'N' :
                    ubicacion.setY(ubicacion.getY()-pasos) ;

                    break;
                case 'E' :
                    ubicacion.setX(ubicacion.getX() + pasos);

                    break;
                case 'O' :
                    ubicacion.setX(ubicacion.getX() - pasos);

                    break;
                case 'S' :
                    ubicacion.setY(ubicacion.getY() + pasos);

                    break;

            }




           /*
           switch ( orientacion ) {

               case 'N':

                   ubicacion.setX((getUbicacion().getY())-pasos);
                   System.out.println("Avanzando sobre el eje Y, nueva posición " + getUbicacion().getX() + "Y: " + getUbicacion().getY());

                   break;

               case 'S':
                   ubicacion.setY(ubicacion.getY()+pasos);
                   System.out.println("Retrocediendo sobre el eje de las Y, nueva posición: " + getUbicacion().getX() + "Y: " + getUbicacion().getY());
                   break;
               //se aleja del 0 del eje de las x
               case 'E':
                   ubicacion.setX(ubicacion.getX()+pasos);
                   System.out.println("Avanzando sobre el eje de las X , nueva posición: " + getUbicacion().getX() + "Y: " + getUbicacion().getY());
                   break;
               //se acerca al 0 de las x
               case 'O':
                   ubicacion.setX(ubicacion.getX()-pasos);
                   System.out.println("Retrocediendo sobre el eje de las X, nueva posición: " + getUbicacion().getX() + "Y: " + getUbicacion().getY());
                   break;
           }
       } else {
           super.avanzar();

    }*/
        } else {
            super.avanzar();
            System.out.println("El guerrero se mueve sin caballos " + pasos + " pasos.");
            }
    }
}
