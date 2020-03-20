class instrucoes {
    public static void main (String[] args) {
        int a = 3;
        int b = 5;
        int c = 8;
        int d = a * (b + c * 3) - 7; // 80
        int e = a - b - c;           //-10
        System.out.println(a+" "+b+" "+c+" "+d+" "+e);
        a = a + 1;            // 4
        b = (4 * a + 1) / 10; // 1
        c = (4 * a + 1) % 10; // 7
        System.out.println(a+" "+b+" "+c+" "+d+" "+e);
        // Quando a variavel `d` eh chamada nessa segunda
        // vez, o programa volta para a declaracao da
        // variavel e refaz a conta. Por isso mesmo 
        // teoricamente não tendo uma atualizacao `d`, 
        // o valor dele muda quando chamamos no ultimo
        // println.
    }
}