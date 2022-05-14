package pl.lazanek.spring5jokesappv2.serices;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeSericeImpl implements JokeSerice {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeSericeImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
