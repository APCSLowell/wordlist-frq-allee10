import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
    int num=0;
    for (int j= myList.size()-1;j>=0;j--){
      if(myList.get(i).length() == len)
        num++;
    }
    return num;
  }

  public void removeWordsOfLength(int len)
  {
    /* to be implemented in part (b) */
    for(int j= myList.size()-1;j>=0;j--){
      if(myList.get(i).length() == len){
        myList.remove(i);
      }
    }
  }
}
