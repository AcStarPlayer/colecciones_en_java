package coleccionesbiblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SistemaBiblioteca {

    private Map<String, Material> catalogo = new HashMap<>();
    private Map<String, ArrayList<String>> listaEspera = new HashMap<>();

    public void registrarMaterial(Material material) {

        catalogo.put(material.getCodigo(), material);

    }

    public Material buscarMaterial(String codigo) {

        return catalogo.get(codigo);

    }

    public void mostrarCatalogo() {

        System.out.println("\nCATÁLOGO BIBLIOTECA");

        for (Map.Entry<String, Material> entry : catalogo.entrySet()) {

            Material material = entry.getValue();

            material.mostrarInfo();

        }

    }

    public void agregarEspera(String codigoMaterial, String usuario) {

        if (!listaEspera.containsKey(codigoMaterial)) {

            listaEspera.put(codigoMaterial, new ArrayList<>());

        }

        listaEspera.get(codigoMaterial).add(usuario);

        System.out.println( usuario + " agregado a la lista de espera de " + codigoMaterial);

    }

    public String siguienteEnEspera(String codigoMaterial) {

        if (!listaEspera.containsKey(codigoMaterial)) {

            return null;

        }

        ArrayList<String> usuarios =
                listaEspera.get(codigoMaterial);

        if (usuarios.isEmpty()) {

            return null;

        }

        return usuarios.remove(0);

    }

}
