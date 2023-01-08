
    // Реализуйте структуру телефонной книги с помощью HashMap, 
    // учитывая, что 1 человек может иметь несколько телефонов.
    
    
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.*;
    import java.util.logging.Logger;
    

public class Home_work_5 {
    
           public static void main(final String[] args) {
    
            Home_work_5 task = new Home_work_5();
            task.phoneBook();
            task.repeatNames();
    
        }
    
    
        private void repeatNames() {
        }
    
        /**
         * 
         */
        public void phoneBook(){
    
            Map <String, ArrayList> map = new HashMap<>();
            ArrayList <String> list = new ArrayList<>();
            list.add("+378787878");
    
    
         
            Logger log = Logger.getAnonymousLogger();
            log.info(map.toString());
    
         
    
            public void repeatNames() {
            }
            ArrayList <String> list = new ArrayList<>();
            Map <String, Integer> map = new HashMap<>();
            list.add("Светлана Петрова");
            list.add("Кристина Белова");
            list.add("Анна Мусина");
            list.add("Анна Крутова");
            list.add("Иван Юрин");
            list.add("Петр Лыков");
            list.add("Павел Чернов");
            list.add("Петр Чернышов");
            list.add("Мария Федорова");
            list.add("Марина Светлова");
            list.add("Мария Савина");
            list.add("Мария Рыкова");
            list.add("Марина Лугова");
            list.add("Анна Владимирова");
            list.add("Иван Мечников");
            list.add("Петр Петин");
            list.add("Иван Ежов");
    
            for (String item:list
                 ) {
                String [] nameList = item.split(" ");
                var name = nameList[0].toString();
                if (map.containsKey(name)){
                    map.put(name, map.get(name) + 1);
                }
                else {
                    map.put(name, 1);
                }
            }
    
            Logger log = Logger.getAnonymousLogger();
            log.info("Unsorted : " + map.toString());
    
            Map<String, Integer> unSortedMap =map;
            LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
            unSortedMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
    
            log.info("Sorted : " + reverseSortedMap.toString());
        }
    
        }
    







