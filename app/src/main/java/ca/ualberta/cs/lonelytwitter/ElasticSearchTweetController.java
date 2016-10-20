package ca.ualberta.cs.lonelytwitter;

import android.os.AsyncTask;
import android.util.Log;

import com.searchly.jestdroid.DroidClientConfig;
import com.searchly.jestdroid.JestClientFactory;
import com.searchly.jestdroid.JestDroidClient;

import io.searchbox.client.JestClient;
import io.searchbox.core.Index;

/**
 * Created by orlick on 10/20/16.
 *
 */
public class ElasticSearchTweetController {
    //TODO we need a fuction which adds tweets to elastic search
    private static JestClient client;

    public static class AddTweetstask extends AsyncTask<NormalTweet, Void, Void> {

        @Override
        protected Void doInBackground(NormalTweet... tweets) {
            for (NormalTweet tweet : tweets) {
                Index index = new Index.Builder(tweet).index("testing").type("tweet").build();
            }

            try {
                //where is client
            }
            catch(Exception e){
                Log.i("Error", "The applications failed to build and send the tweets");
            }

            return null;
        }
    }

    //TODO we need a function which gets tweets from elastic search

    public static void verifySettings() {
        if (client == null) {
            DroidClientConfig.Builder builder = new DroidClientConfig.Builder("http://cmput301.softwareprocess.es:8080");
            DroidClientConfig config = builder.build();

            JestClientFactory factory = new JestClientFactory();
            factory.setDroidClientConfig(config);
            client = (JestDroidClient) factory.getObject();

        }

    }
}
