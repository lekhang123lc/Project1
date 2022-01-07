package hust.project.student.entity;

import javax.persistence.*;

@Entity
@Table(name = "lop")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stt")
    private long id;
    @Column(name = "ma_lop")
    private String code;
    @Column(name = "ten")
    private String name;

    @OneToOne()
    @JoinColumn(name="khoa_vien", referencedColumnName = "stt", insertable = true, updatable = true)
    private Institute institute;
    @Column(name = "mo_ta")
    private String desc;

    public Grade(){

    }

    public Grade(int id, String code, String name,  String desc) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.desc = desc;
    }

    public Grade(long id, String code, String name, Institute institute, String desc) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.institute = institute;
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public Institute getInstitute() {
        return institute;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
