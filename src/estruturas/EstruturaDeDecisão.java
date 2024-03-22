package estruturas;

public class EstruturaDeDecisão {
    public static void main(String[] args) {
        StringIgual();

    }

    private static void StringIgual() {
        String texto = "Sexta uma da manha";
        if (texto.contains("Segunda-feira")) {
            if(texto.contains("seis da tarde"))
            System.out.println("Dia triste hora boa");
        } else if((texto.contains("Sabado")) || (texto.contains("Sexta")) || (texto.contains("Domingo")))
            if (texto.contains(("uma da manha"))) {
                System.out.println("Dia bom hora ruim");

            }
        }
    }





