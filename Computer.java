public class Computer {
    private String computerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGpu;

    Computer(){

    }
    Computer(String computerNumber, String lcdModel, int ramSize, int hddSize,boolean hasGpu){
        this.computerNumber=computerNumber;
        this.lcdModel=lcdModel;
        this.ramSize=ramSize;
        this.hddSize=hddSize;
        this.hasGpu=hasGpu;
    }

    public void setComputerNumber(String computerNumber){
        this.computerNumber=computerNumber;
    }
    public String getComputerNumber(){
        return computerNumber;
    }

    public void setLcdModel(String lcdModel) {
        this.lcdModel = lcdModel;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public void setHasGpu(boolean hasGpu) {
        this.hasGpu = hasGpu;
    }

    public String getLcdModel() {
        return lcdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public boolean isHasGpu() {
        return hasGpu;
    }

    public boolean isEquals(Object obj){
        if(this == obj)return true;
        if(obj == null || getClass() .equals(obj.getClass())) return false;
        Computer computer = (Computer)obj;
        return computerNmuber.isEquals(computer.ComputerNumber);

    }
}
