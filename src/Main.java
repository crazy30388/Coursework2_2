import java.util.*;

public class Main {

        public static void main (String [] args ) {
            Scanner in = new Scanner(System.in);
            System.out.print("enter a line: ");
            String p = in.nextLine();
            int q= p.length();
            int i;
            int count=0;
            for( i=0; i<q; i++)
            {
                if( p.charAt(i)==' ')
                {
                    count++;
                }
            }
            String[] words = p.split(" ");
            HashMap<String,Integer> keyValue = new HashMap<>();
            for (i = 0; i<= words.length-1; i++) {
                if (keyValue.containsKey(words[i])) {
                    int counter = keyValue.get(words[i]);
                    keyValue.put(words[i], counter+1);
                }
                else {
                    keyValue.put(words[i], 1);
                }
            }

            System.out.print("В тексте: " + count + " слов");
            System.out.println("\nТоп-10 " + keyValue);
            in.close();
        }
        }

