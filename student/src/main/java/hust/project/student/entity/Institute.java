package hust.project.student.entity;

import javax.persistence.*;

@Entity
@Table(name = "khoa_vien")
public class Institute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stt")
    private long id;
    @Column(name = "ten")
    private String name;
    @Column(name = "mo_ta")
    private String desc;

    public Institute(){

    }

    public Institute(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
