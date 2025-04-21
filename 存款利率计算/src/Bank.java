//父类Bank，包含计算利息的方法和保存金额、年限、利率等属性
public class Bank {
    protected double savedMoney;
    protected int year;
    protected double interest;
    protected double interestRate = 0.35;
    public double computeInterest() {
        interest = savedMoney * interestRate * year;
        return interest;
    }
    public void setSaveMoney(double savedMoney) {
        this.savedMoney = savedMoney;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
//子类ConstructionBank，继承自Bank类，重写computeInterest方法
class ConstructionBank extends Bank  {
    private double year;
    public double computeInterest() {
        int wholeYear = (int) year;
        super.setYear(wholeYear);
        double interest = super.computeInterest();
        int days = (int) ((year - wholeYear) * 1000);
        double dayInterest = days * 0.0001 * savedMoney;
        return interest + dayInterest;
    }
    public void setYear(double year) {
        this.year = year;
    }
}
// /子类BankOfDalian，继承自Bank类，重写computeInterest方法
class BankOfDalian extends Bank  {
    private double year;
    public double computeInterest() {
        int wholeYear = (int) year;
        super.setYear(wholeYear);
        double interest = super.computeInterest();
        int days = (int) ((year - wholeYear) * 1000);
        double dayInterest = days * 0.00012 * savedMoney;
        return interest + dayInterest;
    }
    public void setYear(double year) {
        this.year = year;
    }
}
// /测试类testBank，创建两个银行对象，分别计算利息并输出
class testBank {
    public static void main(String[] args) {
        ConstructionBank cb = new ConstructionBank();
        BankOfDalian bod = new BankOfDalian();
        cb.setSaveMoney(8000);
        cb.setYear(5.236);
        bod.setSaveMoney(8000);
        bod.setYear(5.236);
        double interestCB = cb.computeInterest();
        double interestBOD = bod.computeInterest();
        double difference = -(interestCB - interestBOD);// 计算利息差额(取绝对值)
        int truncated = (int) difference;// 取整
        System.out.println("建设银行利息: " + interestCB + "元");
        System.out.println("大连银行利息: " + interestBOD + "元");
        System.out.println("利息差额: " + truncated + "元");
    }
}                                                                                                                                                        