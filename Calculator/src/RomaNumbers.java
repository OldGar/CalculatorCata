import java.util.Arrays;
import java.util.List;

public class RomaNumbers {
    final static List<String> romaNumbersForUser = Arrays.asList("I","II","III","IV","V","VI","VII","VIII","IX","X");

    int findRomaNumberA(String strA){
        int a = 0;
        for (int i = 0; i < romaNumbersForUser.size(); i++) {
            if (strA.equals(romaNumbersForUser.get(i)))
                a = i + 1;
        }
        return a;
    }

    int findRomaNumberB(String strB){
        int a = 0;
        for (int i = 0; i < romaNumbersForUser.size(); i++) {
            if (strB.equals(romaNumbersForUser.get(i)))
                a = i + 1;
        }
        return a;
    }

    final static String[] romaNumbersForResult = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII"
            ,"XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII"
            ,"XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII"
            ,"XLVIII","XLIX","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX","LXI","LXII","LXIII","LXIV"
            ,"LXV","LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII"
            ,"LXXXIX","LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI"
            ,"XII","XCIII","XCIV","XCV","XCVI","XVII","XCVIII","ХХIХ","C"
    };
}
