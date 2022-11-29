package bean;

import java.math.BigDecimal;

public class ExamRef {
    private Long id;
    private String ref;
    private double noteExamRef;

    private String examRefCode;

    public String getExamRefCode() {
        return examRefCode;
    }

    public void setExamRefCode(String examRefCode) {
        this.examRefCode = examRefCode;
    }

    public ExamRef() {
    }

    public ExamRef(Long id, String ref, double noteExamRef,String examRefCode) {
        this.id = id;
        this.ref = ref;
        this.noteExamRef = noteExamRef;
        this.examRefCode=examRefCode;
    }

    @Override
    public String toString() {
        return "examRef{" +
                "id=" + id +
                ", ref='" + ref + '\'' +
                ", noteExamRef=" + noteExamRef +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getnoteExamRef() {
        return noteExamRef;
    }

    public void setnoteExamRef(double noteExamRef) {
        this.noteExamRef = noteExamRef;
    }
}
