package hust.project.student.entity;

import javax.persistence.*;

@Entity
@Table(name = "sinh_vien")
public class Student {
    @Id
    @Column(name = "mssv")
    private long id;
    @Column(name = "ten")
    private String name;
    @Column(name = "ngay_sinh")
    private String brith;
    @OneToOne()
    @JoinColumn(name="lop", referencedColumnName = "stt", insertable = true, updatable = true)
    private Grade grade;
    @Column(name = "khoa_hoc")
    private int year;
    @Column(name = "email")
    private String email;
    @Column(name = "gioi_tinh")
    private int gender;

    public Student() {
    }

    public Student(long id, String name, String brith, Grade grade, int year, String email, int gender) {
        this.id = id;
        this.name = name;
        this.brith = brith;
        this.grade = grade;
        this.year = year;
        this.email = email;
        this.gender = gender;
    }

    public String getGenderText(){
        if ( gender == 1 ) return "Nữ";
        return "Nam";
    }

    public void setGenderText(String t){
        if ( t.equals("Nữ") ) setGender(1);
        else setGender(0);
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

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
