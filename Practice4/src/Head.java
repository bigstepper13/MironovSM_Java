public class Head {
    private String hairColor;
    private int eyeCount;

    public Head(String hairColor, int eyeCount) {
        this.hairColor = hairColor;
        this.eyeCount = eyeCount;
    }

    public void talk() {
        System.out.println("I am talking.");
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getEyeCount() {
        return eyeCount;
    }

    public void setEyeCount(int eyeCount) {
        this.eyeCount = eyeCount;
    }
}