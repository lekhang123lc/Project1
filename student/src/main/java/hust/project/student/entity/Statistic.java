package hust.project.student.entity;

import javax.persistence.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Statistic {
    private long semester;
    private long subject_id;
    private Map<String, Integer> type;

    public Statistic(){
        type = new LinkedHashMap<String, Integer>();
        type.put("A+",0);
        type.put("A", 0);
        type.put("B+",0);
        type.put("B", 0);
        type.put("C+",0);
        type.put("C", 0);
        type.put("D+",0);
        type.put("D", 0);
        type.put("F", 0);
    }
    
    public void addResult(List<Result> rs){
        for(Result r: rs){
            int x = type.get(r.getType());
            type.put(r.getType(), x+1);
        }
    }

    public long getSemester() {
        return semester;
    }

    public void setSemester(long semester) {
        this.semester = semester;
    }

    public long getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(long subject_id) {
        this.subject_id = subject_id;
    }

    public Map<String, Integer> getType() {
        return type;
    }

    public void setType(Map<String, Integer> type) {
        this.type = type;
    }
}
