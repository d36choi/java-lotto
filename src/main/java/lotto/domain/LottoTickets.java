package lotto.domain;

import java.util.List;

public class LottoTickets {
    // 일급 컬렉션:: 컬렉션을 래핑해 컬렉션을 제외한 멤버 변수를 가지지 않는 상태.
    private final  List<Lotto> playersLottoTickets;
    private static final int LOTTO_PRICE = 1000;

    public LottoTickets(List<Lotto> playersLottoTickets) {
        this.playersLottoTickets = playersLottoTickets;
    }

    public List<Lotto> getLottoTickets() {
        return playersLottoTickets;
    }

    public int getNumberOfTickets() {
        return playersLottoTickets.size();
    }

    public static int countTicketNumberByMoney(Money money) {
        return money.getMoney() / LOTTO_PRICE;
    }

    public static LottoTickets of (List<Lotto> playersLottoTickets) {
        return new LottoTickets(playersLottoTickets);
    }
}
