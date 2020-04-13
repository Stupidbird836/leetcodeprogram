package test;

import solution.topk.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huchenfei
 * @version 1.0
 * @date 2020/3/23 17:49
 * @description
 * @className Big
 */
public class Big {

    public static void main(String[] args) {
        Big big = new Big();
        Map<String, Object> paramMap = new HashMap<>();
        BigDecimal planSaleAmount = BigDecimal.ZERO;
        planSaleAmount = BigDecimal.ZERO.add(BigDecimal.valueOf(Double.parseDouble("7.93")).multiply(BigDecimal.valueOf(Double.parseDouble("2.5"))));
        planSaleAmount = planSaleAmount.multiply(BigDecimal.valueOf(1)).setScale(2, BigDecimal.ROUND_HALF_UP);
        paramMap.put("amount", planSaleAmount);
        test((BigDecimal) paramMap.get("amount"));
        System.out.println(paramMap.get("amount"));
        System.out.println(big.getBigDecimal());
    }

    private static void test(BigDecimal amount) {
        System.out.println(amount);
    }

    private BigDecimal bigDecimal;

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

}
