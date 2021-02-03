package lotto.view;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import lotto.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OutputViewTest {

    private LottoMatcher lottoMatcher;

    @BeforeEach
    void setUp() {
        lottoMatcher = new LottoMatcher();
    }

    @Test
    void printWinningResultTest() {
        PlayersLotto playersLotto = PlayersLotto.of(
                LottoFactory.createListOfLottoNumber(new int[]{1,2,3,4,5,6}));
        List<PlayersLotto> playersLottoTickets = new ArrayList<>(Arrays.asList(
            playersLotto
        ));
        LottoTickets lottoTickets = LottoTickets.of(playersLottoTickets);
        List<LottoNumber> winnerNumbers = LottoFactory.createListOfLottoNumber(new int[] {1,2,3,4,5,7});
        WinnerLotto winnerLotto = WinnerLotto.of(LottoNumber.of(6), winnerNumbers);
        lottoMatcher.checkAllTickets(lottoTickets, winnerLotto);
        OutputView.printWinningResult(lottoMatcher.getPrizeBoard());
    }
}