package masterclass.section7;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quill;

    public Bed(String style, int pillows, int height, int sheets, int quill) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quill = quill;
    }
    public void make() {
        System.out.println("The bed is being made");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuill() {
        return quill;
    }
}
