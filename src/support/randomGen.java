package support;

import java.util.Random;

public class randomGen {
    Random randomObj = new Random();

    public int getRundomNum(int vFrom, int vTo){
        return vFrom + randomObj.nextInt(vTo-vFrom+1); // генерирует случайные числа в интервале, включая конечные значения
    }

}
