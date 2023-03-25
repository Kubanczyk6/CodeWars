import javax.swing.*;
import java.math.BigInteger;

public class Arrayli {
    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null, "Hello " + name);
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
        System.out.println(check(new BigInteger("76116022020000000288509155")));

    }

    public static boolean check(BigInteger bigInteger){
        return bigInteger.isProbablePrime(2);
            }
        }


