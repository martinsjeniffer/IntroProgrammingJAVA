class equacaoSegundoGrau {
    static public void main(String[] args) {
        //EX08
        int a = 1;
        int b = -1;
        int c = -12;
        double delta;
        double x_1;
        double x_2;
        // delta = b^2 - 4 a c 
        // x_1 = (- b + sqrt (delta))/2 a c
        // x_2 = (-b - sqrt (delta))/2 a c 
        delta = (b * b) - (4 * a * c);
        System.out.println("delta: "+delta);

        if (delta > 0) {
            x_1 = (-b + Math.sqrt(delta))/(2*a);
            x_2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("as raizes da equacao "+a+"x^2 + "+b+"x + "+c+" sao \nx_1 = "+x_1+" e x_2 = "+x_2);
        }

        if (delta == 0) {
            x_1 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("a unica raiz da equacao "+a+"x^2 + "+b+"x + "+c+" eh\nx_1 = "+x_1);
        }

        if (delta < 0) {
            System.out.println("a equacao "+a+"x^2 + "+b+"x + "+c+" nao admite solucao ideal");
        }
    }
}