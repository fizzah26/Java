public class Lab {
    private String labId;
    private LabStatus status;
    private Employee labAttendant;
    private Computer [] computers;

    Lab (){

    }
    public Lab(String labId, LabStatus status, Employee labAttendant, Computer[] computers) {
        this.labId = labId;
        this.status = status;
        this.labAttendant = labAttendant;
        this.computers = computers;
    }
}
