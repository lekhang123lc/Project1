package hust.project.student.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "ket_qua_ky_hoc")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stt")
    private int stt;
    @Column(name = "ky_hoc")
    private int id;
    @OneToOne()
    @JoinColumn(name="mssv", referencedColumnName = "mssv", insertable = true, updatable = true)
    private Student student;
    @Column(name = "so_tin_qua")
    private int credit;
    @Column(name = "so_tin_no")
    private int credit_debt;
    @Column(name = "gpa")
    private Double GPA;

    public Semester() {

    }

    public Semester(int stt, int id, Student student, int credit, int credit_debt, Double GPA) {
        this.stt = stt;
        this.id = id;
        this.student = student;
        this.credit = credit;
        this.credit_debt = credit_debt;
        this.GPA = GPA;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit_debt() {
        return credit_debt;
    }

    public void setCredit_debt(int credit_debt) {
        this.credit_debt = credit_debt;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }
}
