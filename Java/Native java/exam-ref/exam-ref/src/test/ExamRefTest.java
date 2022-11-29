package test;

import bean.ExamRef;
import service.ExamRefService;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExamRefTest {
    private static List<ExamRef> examRefs=new ArrayList();

    private static ExamRefService examRefService=new ExamRefService();

    public void init()
    {
        for(int i=0;i<=10;i++)
        {
            examRefs.add(new ExamRef(Long.parseLong(i+""),"ref"+i,i*2,"code"+i));
        }
    }

    public static void main(String[] args) {
        ExamRefTest examRefTest=new ExamRefTest();
        examRefTest.init();
        System.out.println("args = " + examRefs);
        ExamRef testRef= examRefService.findExamRefByRef("ref100",examRefs);
        if(testRef!=null)
        {
            System.out.println("green");
        }
        else {
            System.out.println("yellow");
        }
        int testSave=examRefService.save(Long.parseLong(100+""),"ref100",100,"code100",examRefs);
        if(testSave==1)
        {
            System.out.println("green");
        }
        else {
            System.out.println("yellow");
        }
        List<ExamRef> testfindExamsRefByCode=examRefService.findExamsRefByCode("code1",examRefs);
        if(testfindExamsRefByCode.size()>0)
        {
            System.out.println("green");
        }
        else{
            System.out.println("yellow");
        }
        double testgetSomeNotesAllExames=examRefService.getSomeNotesAllExames("code1",examRefs);
        if(testgetSomeNotesAllExames!=0)
        {
            System.out.println("green");
        }
        else{
            System.out.println("yellow");
        }
        int testDelete=examRefService.delete("ref0",examRefs);
        if(testDelete==1)
        {
            System.out.println("green");
        }
        else{
            System.out.println("yellow");
        }
    }
}
