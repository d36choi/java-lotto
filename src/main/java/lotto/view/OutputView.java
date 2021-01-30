package lotto.view;

import java.util.Arrays;
import java.util.Map;
import lotto.domain.Prize;

import java.util.List;

public class OutputView {

    public static void printNumberOfLottoInfo(int numberOfLotto) {
        System.out.println(numberOfLotto + "개를 구매하셨습니다.");
    }

    public static void printPrizeStatus(List<Prize> myPrizes) {
        for (Prize p : myPrizes) {
            System.out.println("wow");
        }
    }

    public static void printWinningResult(Map<Prize, Integer> prizeBoard) {
        System.out.println("당첨 통계");
        System.out.println("---------");
        Arrays.stream(Prize.values()).forEach(value -> {
            if(value.getMatchedNumber() >= Prize.THREE.getMatchedNumber()) {
                System.out.print(value.getMatchedNumber() + "개 일치");
                printFiveWithBonusBallCase(value);
                System.out.println(" (" + value.getCash() + "원) - " + prizeBoard.get(value) + "개");
            }

        });
    }

    public static void printReturnOnInvestment(int returnOnInvestment) {
        System.out.println("총 수익률은 " + returnOnInvestment + "입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)");
    }

    private static void printFiveWithBonusBallCase(Prize prize) {
        if (prize.equals(Prize.FIVE_WITH_BONUS)) {
            System.out.print(", 보너스 볼 일치");
        }
    }

}

//당첨 통계
//---------
//3개 일치 (5000원)- 1개
//4개 일치 (50000원)- 0개
//5개 일치 (1500000원)- 0개
//5개 일치, 보너스 볼 일치(30000000원) - 0개
//6개 일치 (2000000000원)- 0개
//총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)