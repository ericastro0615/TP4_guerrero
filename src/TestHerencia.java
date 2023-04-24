public class TestHerencia {
    public static void main(String[] args) {
    Personaje p1 = new Guerrero(new Position(100, 200) ,"Thor", true);
    //giro hacia oeste
    for (int i = 0; i < 3; i++) {
        p1.girar();
    }
        System.out.println("\n");
    //avanza 5 pasos
        for (int i = 0; i < 5; i++) {
            p1.avanzar();
        }
        System.out.println("\n");
    //disparar 8 veces
        for (int i = 0; i < 8; i++) {
            p1.disparar();
        }
        System.out.println("\n");

        System.out.println(p1);

    }
}