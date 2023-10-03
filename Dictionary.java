import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Dictionary using HashMap
 * @author lhamilton2
 */
class Dictionary 
{
    private Map<String, String> wordDefinitions;

    /**
     * Constructs a new Dictionary with a HashMap
     */
    public Dictionary()
    {
        wordDefinitions = new HashMap<>();
    }

    /**
     * Load key&definition pairs from my CSV file into HashMap.
     *
     * @param filePath The path to the CSV file.
     */
    public void loadDictionary(String filePath)
    {
        try 
        {
            Scanner s = new Scanner(new File(filePath));
            while (s.hasNextLine())
            {
                String line = s.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) 
                {
                    String word = parts[0].trim();
                    String def = parts[1].trim();
                    wordDefinitions.put(word, def);
                }
            }
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }//end loadDictionary method

    /**
     * Prints the unsorted dictionary keys and definition
     */
    public void printDictionary() 
    {
        Set<Map.Entry<String, String>> entries = wordDefinitions.entrySet();
        for (Map.Entry<String, String> entry : entries)
        {
            System.out.println("Word: " + entry.getKey() + ", Definition: " + entry.getValue());
        }
    }//end printDictionary method

    /**
     * Searches the dictionary for a key and prints the word, definition, and hash key.
     *
     * @param key The word to search for in the dictionary.
     */
    public void searchDictionary(String key) 
    {
        if (wordDefinitions.containsKey(key))
        {
            String def = wordDefinitions.get(key);
            int hashKey = key.hashCode();
            System.out.println("Word: " + key + ", Definition: " + def + ", HashKey: " + hashKey);
        } else 
        {
            System.out.println("Word wasn't found.");
        }
    }//end SearchDictionary method
}//end class

