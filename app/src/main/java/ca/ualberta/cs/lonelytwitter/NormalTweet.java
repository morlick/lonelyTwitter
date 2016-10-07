package ca.ualberta.cs.lonelytwitter;

/**
 * Created by orlick on 9/15/16.
 *
 * This class is for normal tweets. It instantiates a normal tweet and knows that it is a normal
 * tweet.
 */
public class NormalTweet extends Tweet implements Tweetable{
    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     * This method returns false because these are normal tweets.
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
