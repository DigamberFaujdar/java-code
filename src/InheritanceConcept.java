public class InheritanceConcept {
    void Interest(double amount) {
        double S_I = (amount * 2 * 12) / 100;
        System.out.println("Interest of 1 years for base class "+S_I);
    }
}

     class SBI extends InheritanceConcept {
        void Interest(double amount) {
            double S_I = (amount * 2 * 12) / 100;
            System.out.println("Interest for 1 year "+S_I*12);
            double totalAmount=S_I+amount;
            System.out.println("Total amount "+totalAmount);
        }
        abstract  class HideDetails{
            abstract void play();
            void run(){
                System.out.println("he is a runner , he got 1st rank in district merathon");
            }

        }
        public static void main(String[] args) {
            SBI sbi = new SBI();
            InheritanceConcept inheritanceConcept=new InheritanceConcept();
            inheritanceConcept.Interest(10000);
            sbi.Interest(50000);

        }
    }
