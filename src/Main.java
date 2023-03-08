import java.util.*;

public class Main {

        public static void main (String [] args ) {
            Scanner in = new Scanner(System.in);
            System.out.print("enter a line: ");
            String p = in.nextLine();

            String[] words = p.split(" ");
            HashMap<String,Integer> keyValue = new HashMap<>();

            for (String word : words) {
                keyValue.put(word, keyValue.getOrDefault(word, 0) + 1);
            }

            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(keyValue.entrySet());
            sortedList.sort((o1, o2) -> {
                int valueCompare = o2.getValue().compareTo(o1.getValue());
                if (valueCompare == 0) {
                    return o1.getKey().compareTo(o2.getKey());
                } else {
                    return valueCompare;
                }
            });

            System.out.print("В тексте: " + words.length + " слов, уникальных слов: " + keyValue.size() + "\n");
            System.out.println("Топ-10:");
            for (int i=0; i<sortedList.size(); i++) {
                if (i == 10) break;
                System.out.println(sortedList.get(i).getValue() + " - " + sortedList.get(i).getKey());
            }

            in.close();
        }
        }

