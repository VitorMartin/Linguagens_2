package br.maua.maps;

import java.util.HashMap;
import java.util.Map;

public interface Estados {
    Map<Integer, String> map = new HashMap<Integer, String>() {{
        put(0, "REALIZADO");
        put(1, "PREPARACAO");
        put(2, "SAIU_PARA_ENTREGA");
        put(3, "ENTREGUE");
        put(4, "DEVOLVIDO");
    }};

    static String mapToString() {
        // Template de como a String deve ficar:
        /*
        0 - REALIZADO
        1 - PREPARACAO
        2 - SAIU_PARA_ENTREGA
         */
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < map.size() - 1; i++) {
            str.append(i).append(" - ").append(map.get(i)).append("\n");
        }
        str.append(map.size() - 1).append(" - ").append(map.get(map.size() - 1));
        return str.toString();
    }
}