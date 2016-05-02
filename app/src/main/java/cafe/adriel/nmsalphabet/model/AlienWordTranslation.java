package cafe.adriel.nmsalphabet.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseRelation;

import java.io.Serializable;

@ParseClassName("AlienWordTranslation")
public class AlienWordTranslation extends ParseObject implements Serializable {

    public String getTranslation(){
        return getString("translation");
    }

    public void setTranslation(String translation){
        put("translation", translation);
    }

    public String getLanguage(){
        return getString("language");
    }

    public void setLanguage(String language){
        put("language", language);
    }

    public AlienWord getWord(){
        return (AlienWord) getParseObject("word");
    }

    public void setWord(AlienWord word){
        put("word", word);
    }

    public AlienRace getRace(){
        return (AlienRace) getParseObject("race");
    }

    public void setRace(AlienRace race){
        put("race", race);
    }

    public String getUsersCount(){
        return getString("usersCount");
    }

    public ParseRelation getUsers() {
        return getRelation("users");
    }

    public void addUser(User user){
        getUsers().add(user);
    }

    public void removeUser(User user){
        getUsers().remove(user);
    }

}