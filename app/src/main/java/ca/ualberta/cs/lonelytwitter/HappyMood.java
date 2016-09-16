package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by orlick on 9/15/16.
 */
public class HappyMood extends CurrentMood {

    public HappyMood(Date date) {
        super(date);
    }
    public HappyMood() {
        super();
    }

    @Override
    public String myMood() {
        return "Happy";
    }


}
