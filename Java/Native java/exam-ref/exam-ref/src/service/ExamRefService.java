package service;

import bean.ExamRef;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExamRefService {
    public ExamRef findExamRefByRef(String ref, List<ExamRef> examRefs){
        for (ExamRef examRef : examRefs) {
            if(examRef.getRef().equals(ref)){
                return examRef;
            }
        }
        return null;
    }

    public int save(Long id, String ref, double priceExamRef,String examRefCode, List<ExamRef> examRefs)
    {
        ExamRef examRef=findExamRefByRef(ref,examRefs);
        if(examRef!=null)
        {
            return -1;
        }
        else{
            examRef=new ExamRef(id,ref,priceExamRef,examRefCode);
            examRefs.add(examRef);
            return 1;
        }
    }
    public List<ExamRef> findExamsRefByCode(String code,List<ExamRef> examRefs)
    {
        List<ExamRef> results=new ArrayList<ExamRef>();
        for (ExamRef examRef : examRefs) {
            if(examRef.getExamRefCode().equals(code)){
                results.add(examRef);
            }
        }
        return results;
    }

    public double getSomeNotesAllExames(String code,List<ExamRef> examRefs)
    {
        double sommeNotes=0;
        for (ExamRef examRef : examRefs) {
            if(examRef.getExamRefCode().equals(code))
            {
                sommeNotes+=examRef.getnoteExamRef();
            }
        }
        return  sommeNotes;
    }

    public int delete(String ref,List<ExamRef> examRefs)
    {
        ExamRef examRef=findExamRefByRef(ref,examRefs);
        if(examRef==null)
        {
            return -1;
        }
        else{
            examRefs.remove(examRef);
            return 1;
        }
    }

}
