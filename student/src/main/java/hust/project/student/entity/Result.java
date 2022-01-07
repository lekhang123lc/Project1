package hust.project.student.entity;

import javax.persistence.*;

@Entity
@Table(name = "ket_qua_hoc_tap")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stt")
    private long id;
    @OneToOne()
    @JoinColumn(name="mssv", referencedColumnName = "mssv", insertable = true, updatable = true)
    private Student student;
    @OneToOne()
    @JoinColumn(name="mon", referencedColumnName = "stt", insertable = true, updatable = true)
    private Subject subject;
    @Column(name = "ky_hoc")
    private int semester;
    @Column(name = "diem_qua_trinh", nullable = true)
    private Double process_result;
    @Column(name = "diem_cuoi_ky", nullable = true)
    private Double final_result;
    @Column(name = "diem_tong_ket", nullable = true)
    private Double summary;
    @Column(name = "diem_chu", nullable = true)
    private String type;

    public Result() {

    }

    public Result(long id, Student student, Subject subject, int semester) {
        this.id = id;
        this.student = student;
        this.subject = subject;
        this.semester = semester;
    }

    public void calcSummary(){
        Double point = process_result*getSubject().getProcess_weight() + final_result*(1-getSubject().getProcess_weight());
        point = Math.round(point * 100.0) / 100.0;
        setSummary(point);
        if ( point <= 3.9 ) setType("F");
        else if ( point <= 4.9 ) setType("D");
        else if ( point <= 5.4 ) setType("D+");
        else if ( point <= 6.4 ) setType("C");
        else if ( point <= 6.9 ) setType("C+");
        else if ( point <= 7.9 ) setType("B");
        else if ( point <= 8.4 ) setType("B+");
        else if ( point <= 9.4 ) setType("A");
        else setType("A+");
    }

    public double typeToPoint(){
        if ( type == "F" ) return 0;
        else if ( type == "D"  ) return 1;
        else if ( type == "D+" ) return 1.5; 
        else if ( type == "C"  ) return 2;
        else if ( type == "C+" ) return 2.5;
        else if ( type == "B"  ) return 3;
        else if ( type == "B+" ) return 3.5;
        else if ( type == "A"  ) return 4;
        else return 4;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Double getProcess_result() {
        return process_result;
    }

    public void setProcess_result(Double process_result) {
        this.process_result = process_result;
    }

    public Double getFinal_result() {
        return final_result;
    }

    public void setFinal_result(Double final_result) {
        this.final_result = final_result;
    }

    public Double getSummary() {
        return summary;
    }

    public void setSummary(Double summary) {
        this.summary = summary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
