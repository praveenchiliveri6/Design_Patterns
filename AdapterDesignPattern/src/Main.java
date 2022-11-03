import com.pattern.adapter.AssignmentWork;
import com.pattern.adapter.PenAdapter;

public class Main {
    public static void main(String[] args) {
        AssignmentWork assignmentWork = new AssignmentWork();
        PenAdapter penAdapter = new PenAdapter();
        assignmentWork.setPen(penAdapter);
        assignmentWork.writeAssignment("I started my assignment.");
    }
}