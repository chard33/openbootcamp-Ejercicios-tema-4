public class Main {
    public static void main(String[] args) {

        condicionalIf();
        buclesDoWhile();
        bucleFor();
        condicionalSwitch();
    }

    public static void condicionalIf(){

        int numeroIf = 1;

        espaciado();

        if(numeroIf > 0){

            System.out.println("El valor de numeroIf es positivo");
        } else if (numeroIf == 0) {

            System.out.println("El valor de numeroIf es 0");
        }else{

            System.out.println("El valor de numeroIf es negativo");
        }

        espaciado();
    }

    public static void buclesDoWhile(){

        int numeroWhile = 1;

        while (numeroWhile < 3){

            System.out.println("El valor del numeroWhile en WHILE es: " + numeroWhile);
            numeroWhile++;
        }

        do{

            System.out.println("El valor del numeroWhile en DO-WHILE es: " + numeroWhile);
            numeroWhile++;
        }while (numeroWhile < 3);

        espaciado();
    }

    public static void bucleFor(){

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){

            System.out.println("El valor de numeroFor es: " + numeroFor);
        }

        espaciado();
    }

    public static void condicionalSwitch(){

        String estacion = "INVIERNO";

        switch (estacion){
            case "PRIMAVERA":
                System.out.println("La estacion es: " + estacion);
                break;
            case "VERANO":
                System.out.println("La estacion es: " + estacion);
                break;
            case "OTOÑO":
                System.out.println("La estacion es: " + estacion);
                break;
            case "INVIERNO":
                System.out.println("La estacion es: " + estacion);
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }

        espaciado();
    }

    public static void espaciado(){

        System.out.println("----------------------------------------");
    }
}