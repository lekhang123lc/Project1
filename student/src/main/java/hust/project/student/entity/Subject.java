package hust.project.student.entity;

import javax.persistence.*;

@Entity
@Table(name = "mon_hoc")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stt")
    private long id;
    @Column(name = "ma_mon")
    private String code;
    @Column(name = "ten_mon")
    private String name;
    @Column(name = "mo_ta")
    private String desc;
    @Column(name = "trong_so_qua_trinh")
    private Double process_weight;
    @Column(name = "so_tin")
    private int credit;

    public Subject() {

    }

    public Subject(long id, String code, String name, String desc, Double process_weight, int credit) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.desc = desc;
        this.process_weight = process_weight;
        this.credit = credit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getProcess_weight() {
        return process_weight;
    }

    public void setProcess_weight(Double process_weight) {
        this.process_weight = process_weight;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
