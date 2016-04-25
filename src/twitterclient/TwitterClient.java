/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterclient;


import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author aariasgonzalez
 */
public class TwitterClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
          // The factory instance is re-useable and thread safe.
        Twitter twitter = TwitterFactory.getSingleton();
        Status status = twitter.updateStatus("452045245204523.4532");
        System.out.println("Successfully updated the status to [" + status.getText() + "].");
    }
    
}
