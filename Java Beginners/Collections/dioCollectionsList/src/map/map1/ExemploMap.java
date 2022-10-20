package map.map1;

import java.util.*;

/*Dados os modelos dos carros e seus respectivos consumos na estrada, faça:

modelo = gol - consumo = 14,4km/l
modelo = uno - consumo = 15,6km/l
modelo = mobi - consumo = 16,1km/l
modelo = hb20 - consumo = 14,5km/l
modelo = kwid - consumo = 15,6km/l
*/
public class ExemploMap {

    public static void main(String[] args) {

        //Algumas formas de iniciar o Map:

        //Primeira forma:
        //Map carrosPopulares2020 = new HashMap<>();//antes da JAVA 5

        //Segunda forma:
        //Map<String, Double> carrosPopulares2020 = new HashMap<>();//[](Generics (JDK 5) - []Diamont Operator (JDK 7))

        //Terceira forma:
        //HashMap<String, Double> carrosPopulares2020 = new HashMap<>();

        //Quarta forma:
        //Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi",
                //16.1, "hb20", 14.5, "kwid", 15.6);

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos.");

        Map<String, Double> carrosPopulares2020 = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrosPopulares2020.toString());//[]toString

        System.out.println("Substitua o consumo do gol por 15.2 km/l.");
        carrosPopulares2020.put("gol", 15.2);//[]put
        System.out.println(carrosPopulares2020.toString());

        System.out.println("Confira se o moldelo tucson se encontra no dicionário:"+ carrosPopulares2020.containsKey("tuson"));//[]containskey

        System.out.println("Exiba o consumo do uno:"+carrosPopulares2020.get("uno"));//[]get

        System.out.println("Exiba os modelos:");
        Set<String> modelos = carrosPopulares2020.keySet();//[]keySet
        System.out.println(modelos);

        System.out.println("Exiba os consumos:");
        Collection<Double> consumos = carrosPopulares2020.values();//[]values
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economico e seu consumo.");
        Double consumoMaisEficiente = Collections.max(carrosPopulares2020.values());//[]Collecions.max
        Set<Map.Entry<String, Double>> entries = carrosPopulares2020.entrySet();//[]entrySet
        String modeloMaisEfeciente = "";
        for (Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEfeciente = entry.getKey();//[]get.key

                System.out.println("Modelo mais efeciente "+modeloMaisEfeciente+ " - " +consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo mais economico e seu consumo.");
        Double consumoMenosEficiente = Collections.min(carrosPopulares2020.values());//[]Collecions.min
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares2020.entrySet();//[]entrySet
        String modeloMenosEfeciente = "";
        for (Map.Entry<String, Double> entry : entries1){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEfeciente = entry.getKey();//[]get.key

                System.out.println("Modelo menos efeciente "+modeloMenosEfeciente+ " - " +consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares2020.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){//[]iterator.hasNext

            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos consumos: "+soma);

        System.out.println("Exiba a media dos consumos: "+soma/carrosPopulares2020.size());//[]size

        System.out.println(carrosPopulares2020);

        System.out.println("Remova os modelos com consumo igual a 15.6 km/l");
        Iterator<Double> iterator1 = carrosPopulares2020.values().iterator();
        while(iterator1.hasNext()){//[]iterator.hasNext
            if(iterator1.next().equals(15.6)){
                iterator1.remove();
            }

        }
        System.out.println(carrosPopulares2020);

        System.out.println("Exiba os carros na ordem em que foram informados.");
        Map<String, Double> carrosPopulares = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};

        System.out.println(carrosPopulares);

        System.out.println("Exiba o dicionário ordenado pelo dicionário.");
        Map<String, Double> carrosPopulares1 = new TreeMap<>(carrosPopulares);
        System.out.println(carrosPopulares1.toString());

        System.out.println("Apague o dicionário de carros");
        carrosPopulares2020.clear();//[]clear

        System.out.println("Verifique se o dicionário está vazio:"+ carrosPopulares2020.isEmpty());//[]isEmpty

    }
}
