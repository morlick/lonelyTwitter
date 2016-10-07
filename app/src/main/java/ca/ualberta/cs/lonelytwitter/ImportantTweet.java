package ca.ualberta.cs.lonelytwitter;

/**
 * Created by orlick on 9/15/16.
 *
 * This class is of important tweets.
 * It instantiates an important tweet and can tell that it is important.
 */
public class ImportantTweet extends Tweet {
    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * This method returns true because these are important tweets.
     * @return boolean
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
