public class Convertor {
    private String boolean_value;
    private String byte_value;
    private String short_value;
    private String int_value;
    private String long_value;
    private String double_value;
    private String float_value;
    public void Convertion(String boolean_value, String byte_value, String short_value, String int_value, String long_value, String double_value, String float_value){
        this.boolean_value = boolean_value;
        this.byte_value = byte_value;
        this.short_value = short_value;
        this.int_value = int_value;
        this.long_value = long_value;
        this.double_value = double_value;
        this.float_value = float_value;
    }
    public void Converted(){
        boolean bo = Boolean.parseBoolean(boolean_value);
        byte by = Byte.parseByte(byte_value);
        short s = Short.parseShort(short_value);
        int i = Integer.parseInt(int_value);
        long l = Long.parseLong(long_value);
        double d = Double.parseDouble(double_value);
        float f = Float.parseFloat(float_value);
        System.out.println(bo);
        System.out.println(by);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
    }

    @Override
    public String toString(){
        return (String) ("Boolean " + boolean_value + "\n"
        + "Byte " + byte_value + "\n"
        + "Short " + short_value + "\n"
        + "Int " + int_value + "\n"
        + "Long " + long_value + "\n"
        + "Double " + double_value + "\n"
        + "Float " + float_value);
    }
}
