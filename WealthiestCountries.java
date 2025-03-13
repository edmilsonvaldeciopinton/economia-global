import java.util.Map;
import java.util.LinkedHashMap;

public class WealthiestCountries {
    public static void main(String[] args) {
        // Cria um LinkedHashMap para armazenar os países mais ricos e seus PIBs
        // LinkedHashMap é usado para manter a ordem de inserção
        Map<Integer, String> richestCountries = new LinkedHashMap<>();

        // Adiciona os países e seus respectivos PIBs em trilhões de dólares
        richestCountries.put(10, "Canadá (US$ 2,24 trilhões)");
        richestCountries.put(9, "Itália (US$ 2,33 trilhões)");
        richestCountries.put(8, "Brasil (US$ 2,33 trilhões)");
        richestCountries.put(7, "França (US$ 3,13 trilhões)");
        richestCountries.put(6, "Reino Unido (US$ 3,50 trilhões)");
        richestCountries.put(5, "Índia (US$ 3,94 trilhões)");
        richestCountries.put(4, "Japão (US$ 4,11 trilhões)");
        richestCountries.put(3, "Alemanha (US$ 4,59 trilhões)");
        richestCountries.put(2, "China (US$ 18,53 trilhões)");
        richestCountries.put(1, "Estados Unidos (US$ 28,78 trilhões)");

        // Exibe o cabeçalho para a lista de países
        System.out.println("Lista dos dez países mais ricos do mundo:");

        // Percorre o mapa usando um loop for-each para exibir os países e PIBs
        for (Map.Entry<Integer, String> entry : richestCountries.entrySet()) {
            // Imprime a posição, o nome do país e seu PIB
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }

        // Comentário sobre a saída esperada:
        // A saída será:
        // Lista dos dez países mais ricos do mundo:
        // 10. Canadá (US$ 2,24 trilhões)
        // 9. Itália (US$ 2,33 trilhões)
        // 8. Brasil (US$ 2,33 trilhões)
        // 7. França (US$ 3,13 trilhões)
        // 6. Reino Unido (US$ 3,50 trilhões)
        // 5. Índia (US$ 3,94 trilhões)
        // 4. Japão (US$ 4,11 trilhões)
        // 3. Alemanha (US$ 4,59 trilhões)
        // 2. China (US$ 18,53 trilhões)
        // 1. Estados Unidos (US$ 28,78 trilhões)
    }
}
