package lotto.domain;

import java.util.List;

public class LottoTickets {

    private List<Lotto> lottoTickets;
    private static final int LOTTO_PRICE = 1000;

    public LottoTickets(List<Lotto> lottoTickets) {
        this.lottoTickets = lottoTickets;
    }

    public List<Lotto> getLottoTickets() {
        return lottoTickets;
    }

    public void setLottoTickets(List<Lotto> lottoTickets) {
        this.lottoTickets = lottoTickets;
    }

    public int getNumberOfTickets() {
        return lottoTickets.size();
    }

    public static int countTicketNumberByMoney(int money) {
        return money / LOTTO_PRICE;
    }
}
