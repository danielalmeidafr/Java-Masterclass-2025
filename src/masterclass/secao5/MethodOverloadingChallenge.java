package masterclass.secao5;


public class MethodOverloadingChallenge {

    public static void main(String[] args) {
        System.out.println("Altura de polegadas (68in) para centimetros: " + converterParaCentimetros(68));
        System.out.println("Altura de pes (5ft) e polegadas (8in) em centimetros: " + converterParaCentimetros(5, 8));
    }
    
    public static double converterParaCentimetros(int polegadas){
//        double centimetros = alturaTotalPolegadas * 2.54d;
//        return centimetros;
        return polegadas * 2.54d;
    }

    public static double converterParaCentimetros(int polegadas, int pes){
//        int pesParaPolegadas = pes * 12;
//        int altura = pesParaPolegadas + polegadas;
//        return converterParaCentimetros(altura);

        return converterParaCentimetros((pes * 12) + polegadas);

    }

}
