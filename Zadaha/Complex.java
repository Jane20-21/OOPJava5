package JavaHomeWork.Zadaha;

import java.util.ArrayList;

public class Complex {
    ArrayList<Integer> numComplex = new ArrayList<>();
    public Complex() {
    }

    public ArrayList<Integer> numComplex(String inputNum) {
        String inputNumTemp = inputNum.substring(0, inputNum.length() - 1);
        int index = -1;
        if (inputNumTemp.contains("+")) {
            index = inputNumTemp.indexOf("+");
        } else if (inputNumTemp.contains("-")) {
            index = inputNumTemp.lastIndexOf("-");
        }
        String inputNumTempFirst = inputNumTemp.substring(0, index); // выделила действительнуй часть числа
        String inputNumTempSecond = inputNumTemp.substring(index); // выделила мниную часть числа
        numComplex.add(Integer.parseInt(inputNumTempFirst));
        numComplex.add(Integer.parseInt(inputNumTempSecond));
        return numComplex;
    }

    public String printComplex(ArrayList<Integer> numComplex) {
        String stringComplex = "";
        if (numComplex.get(1) > 0) {
            stringComplex = stringComplex + numComplex.get(0) + "+" + numComplex.get(1) + "i";
        } else if (numComplex.get(1) < 0) {
            stringComplex = stringComplex + numComplex.get(0) + numComplex.get(1) + "i";
        }
        return stringComplex;
    }

    public String printComplexDiv(ArrayList<Integer> numComplex) {
        String stringComplex = "";
        if (numComplex.get(1) > 0) {
            stringComplex = stringComplex
                    + numComplex.get(0) + "/" + numComplex.get(2) + "+"
                    + numComplex.get(1) + "/" + numComplex.get(2) + "i";
        } else if (numComplex.get(1) < 0) {
            stringComplex = stringComplex
                    + numComplex.get(0) + "/" + numComplex.get(2)
                    + numComplex.get(1) + "/" + numComplex.get(2) + "i";
        }
        return stringComplex;
    }
}
