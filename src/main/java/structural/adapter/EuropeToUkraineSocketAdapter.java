package structural.adapter;

public class EuropeToUkraineSocketAdapter implements UkrainianSocket {

    private final EuropeSocket europeSocket;

    public EuropeToUkraineSocketAdapter(EuropeSocket europeSocket) {
        if (europeSocket == null) {
            throw new IllegalArgumentException("EuropeSocket can't be null");
        }
        this.europeSocket = europeSocket;
    }

    @Override
    public String connect() {
        return europeSocket.plugIn();
    }
}
