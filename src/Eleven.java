public class Eleven extends Gyerek {

    public Eleven() {
    }

    public Eleven(String name, int elegedettseg) {
        this.setName(name);
        this.setElegedettseg(elegedettseg);
    }

    @Override
    public void applyTevekenyseg(Main.Tevekenysegek actualTevekenyseg) {
        if (!this.isNyafog()) {
            switch (actualTevekenyseg) {
                case ENEK:
                    this.changeElegedettseg(-1);
                    break;
                case RAJZ:
                    this.changeElegedettseg(-1);
                    break;
                case TANC:
                    break;
                case LABDAZAS:
                    this.setElegedettseg(3);
                    break;
            }
            if (this.getElegedettseg() <= 0) {
                this.setNyafog(true);
            }
        }
    }
}
