package za.ac.cput;

public class AverageMark {
        private int mark1, mark2, mark3, mark4;
        private String name;

        // Constructor
        public AverageMark() {
            mark1 = 0;
            mark2 = 0;
            mark3 = 0;
            mark4 = 0;


        }

        public AverageMark(int mark1, int mark2, int mark3, int mark4) {
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
            this.mark4 = mark4;

        }
        // Getters
        public int getMark1() {
            return mark1;
        }

        public int getMark2() {
            return mark2;
        }

        public int getMark3() {
            return mark3;
        }

        public int getMark4() {
            return mark4;

        }

        // Setters
        public void setMark1(int mark1) {
            this.mark1 = mark1;
        }

        public void setMark2(int mark2) {
            this.mark2 = mark2;
        }

        public void setMark3(int mark3) {
            this.mark3 = mark3;
        }

        public void setMark4(int mark4) {
            this.mark4 = mark4;
        }


        public String toString() {
            return String.format("%d%mark1= %d%mark2= %d%mark3= %d%mark4= ", this.mark1, this.mark2, this.mark3, this.mark4);
        }

        public static String Message(){
            return "The Average Mark for Student";
        }

        public double average() {
            double avg = (mark1 + mark2 + mark3 + mark4) / 4;
            return avg;
        }


    }


