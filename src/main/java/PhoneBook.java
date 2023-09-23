import java.util.*;

public class PhoneBook {
    private HashMap<String, HashSet<String>> map = new HashMap<>();

    void add(String phoneNum, String name) {
        if (map.containsKey(name)) {
            HashSet<String> phoneNumbers = map.get(name);
            phoneNumbers.add(phoneNum);
        } else {
            HashSet<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNum);
            map.put(name, phoneNumbers);
        }
    }

    String getPhoneNum(String phoneNum) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, HashSet<String>> entry : map.entrySet()) {
            HashSet<String> phoneNumbers = entry.getValue();
            if (phoneNumbers.contains(phoneNum)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" -> ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getByName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        if (map.containsKey(name)) {
            HashSet<String> phoneNumbers = map.get(name);
            for (String phoneNumber : phoneNumbers) {
                stringBuilder.append(phoneNumber);
                stringBuilder.append(" -> ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAll() {
        StringBuilder stringBuilder = new StringBuilder();
        List<Map.Entry<String, HashSet<String>>> entries = new ArrayList<>(map.entrySet());
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        for (Map.Entry<String, HashSet<String>> entry : entries) {
            HashSet<String> phoneNumbers = entry.getValue();
            stringBuilder.append(entry.getKey());
            stringBuilder.append(" -> ");
            stringBuilder.append(phoneNumbers);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
