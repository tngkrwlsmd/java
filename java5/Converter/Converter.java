package Converter;
import java.util.Scanner;

abstract class Converter {
   abstract protected double convert(double src); // 추상 메소드
   abstract protected String getSrcString(); // 추상 메소드
   abstract protected String getDestString(); // 추상 메소드
   //protected double ratio; // 비율
   void run() {
      Scanner scanner = new Scanner(System.in);
      System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
      System.out.print(getSrcString()+"을 입력하세요>> ");
      double val = scanner.nextDouble(); //금액
      double res = convert(val);
      System.out.println("변환 결과: " + res + getDestString() + "입니다");
      scanner.close();
   }
}

class Won2Dollar extends Converter {
  private double val;
  Won2Dollar(double val) { this.val = val; }
  protected double convert(double src) { return src / val; }
  protected String getSrcString() { return "원"; }
  protected String getDestString() { return "달러"; }
}

class ConverterEx1 {
  public static void main(String args[]) {
   Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
   toDollar.run();
   }
}

class Km2Mile extends Converter {
   private double val;
   Km2Mile(double val){ this.val = val; }
   protected double convert(double src) { return src / val; }
   protected String getSrcString() { return "Km"; }
   protected String getDestString() { return "mile"; }
}

class ConverterEx2 {
   public static void main(String[] args) {
      Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
      toMile.run();
   }
}
