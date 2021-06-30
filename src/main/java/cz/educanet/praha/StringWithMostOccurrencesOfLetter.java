package cz.educanet.praha;

public class StringWithMostOccurrencesOfLetter {

    public static void main(String[] args) {

        String[] pole = new String[]{"Zdravime ze Zbeslavi","Dobry den", "Jak se mas?", "Ja jsem John nebo Pepa", "Dnes je ctvrtek", "Zitra je patek", "A potom sobota"};

        System.out.println(findStringWithMostOccurrencesOfLetter(pole,'e'));


    }


    public static String findStringWithMostOccurrencesOfLetter(String[] strings, char letter) {

        int[] pocetPismen = new int[strings.length];

        for (int i = 0;i < strings.length;i++) {
            String veta = strings[i];

            for (int k = 0; k < veta.length(); k++) {
                if (veta.charAt(k) == letter) {
                    pocetPismen[i]++;
                }
            }
        }

        int nejvetsiCislo = pocetPismen[0];
        int index = 0;

        for (int z = 1;z < pocetPismen.length; z++){
            if (pocetPismen[z] > nejvetsiCislo){
                nejvetsiCislo = pocetPismen[z];
                index = z;
            }
        }

        return strings[index];

    }
}
