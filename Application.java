/**
 * An application class to test the Dictionary methods.
 */
public class Application
{
    /**
     * Main method to test the Dictionary
     * @author lhamilton2
     * @param args 
     */
    public static void main(String[] args)
    {
        Dictionary d = new Dictionary();
        
        // Load dictionary from downloaded file
        d.loadDictionary("C:\\Users\\Levif\\Downloads\\DictionaryWordValuePairs - Sheet1.csv");
        
        // Print
        System.out.println("Dictionary:");
        d.printDictionary();

        // Search for words in dictionary
        System.out.println("\nSearching:");
        d.searchDictionary("brimstone");
        d.searchDictionary("appetency");
        d.searchDictionary("mooncalf");
        d.searchDictionary("meet");
        d.searchDictionary("Alakazam");
    }
}
