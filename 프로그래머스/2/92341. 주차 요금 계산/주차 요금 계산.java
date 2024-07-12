import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        List recordList = new ArrayList<Record>();
        for (String record : records) {
            String[] temp = record.split(" ");
            recordList.add(new Record(temp[0], temp[1], temp[2]));
        }
        
        Map<String, String> recordMap = new HashMap<>(); // key: 차 번호 value: 입출차 시간
        Map<String, Integer> timeMap = new HashMap<>(); // key: 차 번호 value: 누적 시간
        for (int i = 0; i < recordList.size(); i++) {
            Record record = (Record) recordList.get(i);
            if (recordMap.containsKey(record.number)) {
                String inTimeStr = recordMap.get(record.number);
                String[] splitInTime = inTimeStr.split(":");
                String outTimeStr = record.time;
                String[] splitOutTime = outTimeStr.split(":");
                
                int hour = Integer.parseInt(splitOutTime[0]) - Integer.parseInt(splitInTime[0]);
                int min = Integer.parseInt(splitOutTime[1]) - Integer.parseInt(splitInTime[1]);
                int time = hour * 60 + min;
                
                if (timeMap.containsKey(record.number)) {
                    timeMap.put(record.number, timeMap.get(record.number) + time);
                } else {
                    timeMap.put(record.number, time);
                }
                
                recordMap.remove(record.number);
            } else {
                recordMap.put(record.number, record.time);
            }
        }
        
        for (Map.Entry<String, String> record : recordMap.entrySet()) {
            String inTimeStr = new String(record.getValue());
            String[] splitInTime = inTimeStr.split(":");
            int hour = 23 - Integer.parseInt(splitInTime[0]);
            int min = 59 - Integer.parseInt(splitInTime[1]);
            int time = hour * 60 + min;
            
            if (timeMap.containsKey(record.getKey())) {
                timeMap.put(record.getKey(), timeMap.get(record.getKey()) + time);
            } else {
                timeMap.put(record.getKey(), time);
            }
        }
        
        // for (Map.Entry<String, Integer> time : timeMap.entrySet()) {
        //     System.out.println(time.getKey() + " " + time.getValue());
        // }
        
        int[] answer = new int[timeMap.size()];
        List timeMapKeySet = new ArrayList<String>(timeMap.keySet()); 
        Collections.sort(timeMapKeySet);
        
        for (int i = 0; i < timeMapKeySet.size(); i++) {
            int time = timeMap.get(timeMapKeySet.get(i));
            time -= fees[0];
            answer[i] += fees[1];
            if (time > 0) {
                int n = time / fees[2];
                if (time % fees[2] > 0) {
                    n++;
                }
                answer[i] += fees[3] * n;
            }
        }
        
        return answer;
    }
    
    public void printList(List<Record> recordList) {
        for (int i = 0; i < recordList.size(); i++) {
            System.out.println(recordList.get(i).toString());
        }
    }
    
    
    class Record {
        String time;
        String number;
        String code;
        public Record(String time, String number, String code) {
            this.time = time;
            this.number = number;
            this.code = code;
        }
        
        @Override
        public String toString() {
            return time + " " + number + " " + code;
        }
    }
}