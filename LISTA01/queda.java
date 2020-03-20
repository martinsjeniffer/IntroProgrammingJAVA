class queda {
    static public void main(String[] args) {
        //EX07
        double a = 10; // aceleracao
        double h = 45; // altura
        double t;

        t = Math.sqrt((2 * h) / a);
        System.out.println("o objeto leva "+t+" segundos para cair de uma altura de "+h+" metros");
    }
}